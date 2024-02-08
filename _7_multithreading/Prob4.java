/*
Problem4) Inherit a class from Thread and override the run( ) method. Inside run( ), print a
message, and then call sleep( ). Repeat this three times, then return from run( ).
Put a start-up message in the constructor and override finalize( ) to print a shut-
down message. Make a separate thread class that calls System.gc( ) and
System.runFinalization( ) inside run( ), printing a message as it does so. Make
several thread objects of both types and run them to see what happens.
*/

package _7_multithreading;
class TripleSleep extends Thread
{
    static int count; // Counts the number of threads created.
    int ix; // Thread id.
    Thread t;

    TripleSleep(Thread t)
    {
        count++;
        ix = count;
        System.out.println("Initializing object " + ix);
        this.t = t;
    }

    protected void finalize()
    {
        System.out.println("Killing object " + ix);
    }

    public void run()
    {
        try
        {
            System.out.println("Object " + ix + " says 1");
            sleep(1500);
            System.out.println("Object " + ix + " says 2");
            sleep(1000);
            System.out.println("Object " + ix + " says 3");
            sleep(500);
        } catch (InterruptedException e)
        {
            e.getMessage();
        }
        t.start(); // calling Finalizer thread
    }
}

class Finalizer extends Thread
{
    static int count; // Counts the number of threads created.
    int ix; // Thread id.

    public Finalizer()
    {
        count++;
        ix = count;
    }

    public void run()
    {
        System.out.println("Running Finalizer! " + ix);
        System.runFinalization();
        System.out.println("Running Garbage Collector! " + ix);
        System.gc();
    }
}

public class Prob4
{
    public static void main(String[] args)
    {
        // Finalizer
        Finalizer f1 = new Finalizer();
        Finalizer f2 = new Finalizer();
        Finalizer f3 = new Finalizer();

        // TripleSleep
        TripleSleep t1 = new TripleSleep(f1);
        TripleSleep t2 = new TripleSleep(f2);
        TripleSleep t3 = new TripleSleep(f3);

        // thread calls
        t1.start();
        t2.start();
        t3.start();
    }
}
/*
OUTPUT :
Initializing object 1
Initializing object 2
Initializing object 3
Object 1 says 1
Object 2 says 1
Object 3 says 1
Object 2 says 2
Object 1 says 2
Object 3 says 2
Object 2 says 3
Object 3 says 3
Object 1 says 3
Running Finalizer! 2
Running Finalizer! 1
Running Finalizer! 3
Running Garbage Collector! 2
Running Garbage Collector! 3
Killing object 3
Killing object 2
Killing object 1
Running Garbage Collector! 1
*/
