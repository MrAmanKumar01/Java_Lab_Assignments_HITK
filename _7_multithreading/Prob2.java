/*
Problem 2) Write multithreaded program that continuously prints the strings “ping” and
“PONG” in the console at random distances at intervals of one second. Use two
threads one for “ping” and another for “PONG”.
*/
package _7_multithreading;

import java.util.Random;

//Class implementing print procedure.
class Print extends Thread
{
    static boolean flag=true; //Static variable of class.

    public void run()
    {
        Random ob=new Random(); //Object of Random class.
        //Searches for errors.
        try
        {
            int dconsole=0, dist=0;   // counter "dconsole" tracks the current position on the console
            //Infinite loop to print.
            while(true)
            {
                dist=ob.nextInt(50); //Getting random distance for console between 1 to 50.
                if(flag)
                {
                    System.out.print("ping");
                    flag=false;
                }
                else
                {
                    System.out.print("PONG"); //if flag is false "PONG" is printed and flag is set to true
                    flag=true;
                }

                dconsole+=4;  //Every 4 spaces, a new line is checked and inserted if needed to maintain a maximum line length of 150 characters
                for(int i=1; i<=dist; i++)
                {
                    System.out.print(" ");
                    dconsole+=1;
                    if(dconsole+4>=150)
                    {
                        System.out.println();
                        dconsole=0;
                    }
                }
                Thread.sleep(1000); // pauses the thread for 1 second before the next iteration of the while loop
            }
        }
        //Catches particular error InterruptedException.
        catch(InterruptedException e){
            System.out.println("rest program code");
        }
    }
}
//Driver class.
public class Prob2
{
    public static void main(String[] args)
    {
        Print t=new Print(); //Thread extending class's object.
        t.start(); //Starting thread execution.
    }
}