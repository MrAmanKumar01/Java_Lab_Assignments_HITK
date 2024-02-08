package _7_multithreading;
/*Problem 1) Write a Java program that illustrates the use of the yield( ), start( ),stop( ),run ( ),
sleep( ), wait( ) and isAlive( ) methods.*/
//stop() is deprecated so I have used interrupt() in place of stop()

import java.util.Scanner;

//Class implementing Runnable interface.
class Demo implements Runnable
{
    //Static variable of class.
    static int secs;

    //Static block to initialise static variable.
    static
    {
        secs=0;
    }

    //Illustrating run().
    public void run()
    {
        //Searches for exceptions.
        try {
            while (true)
            {
                System.out.println("Seconds passed: "+secs++);
                Thread.sleep(1000); //Illustrating sleep().
                Thread.yield(); //Illustrating yield().
            }
        }
        //Catches InterruptedException.
        catch (InterruptedException e) {}
    }
}

//Driver class.
public class Prob1
{
    public static void main(String[] args) throws InterruptedException
    {
        Scanner sc=new Scanner(System.in); //Scanner object.
        Demo t=new Demo();
        Thread t1=new Thread(t, "Stopwatch"); //Object of Thread class.
        System.out.print("Enter the time to stop in seconds for stopwatch : ");
        int time=sc.nextInt();
        t1.start();    //Illustrating start().
        while(true)
        {
            if(Demo.secs>time)
            {
                t1.interrupt();    //used interrupt() in place of stop()
                break;
            }
            Thread.yield();    //Illustrating yield().
        }
        System.out.println(time+"s completed.");
        System.out.println("Stopped thread: "+t1.getName());
//        t1.join(); //Waiting for Stopwatch thread to die naturally.
        System.out.println("Is "+t1.getName()+" alive? "+t1.isAlive()); //Illustrating isAlive().
        System.out.println("Is "+Thread.currentThread().getName()+" alive? "+Thread.currentThread().isAlive());
        sc.close();    //Scanner object closed.
    }
}
/*
OUTPUT :
---------
Enter the time to stop in seconds for stopwatch : 2
Seconds passed: 0
Seconds passed: 1
Seconds passed: 2
2s completed.
Stopped thread: Stopwatch
Is Stopwatch alive? false
Is main alive? true
*/