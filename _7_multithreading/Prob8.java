/*Program 8) Write a program, which will create a deadDeadLock.*/
package _7_multithreading;
class DeadLock
{
    static int count;
    int ix;

    DeadLock()
    {
        count++;
        ix = count;
        System.out.println("Created DeadLock: " + ix);
    }

    synchronized void hold(int i)
    {
        System.out.println("Thread " + i + " is holding DeadLock: " + this.ix);
        try
        {
            wait();
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    synchronized void release(int i)
    {
        System.out.println("Thread " + i + "is releasing DeadLock: " + this.ix);
        notify();
    }
}

public class Prob8
{
    public static void main(String[] args)
    {
        DeadLock l1 = new DeadLock();
        DeadLock l2 = new DeadLock();

        Thread t1 = new Thread()
        {
            @Override
            public void run()
            {
                l1.hold(1);
                l2.hold(1);
                l1.release(1);
                l2.release(1);
            }
        };

        Thread t2 = new Thread()
        {
            @Override
            public void run()
            {
                l2.hold(2);
                l1.hold(2);
                l2.release(2);
                l1.release(2);
            }
        };
        t1.start();
        t2.start();
    }
}
/*
OUTPUT :
Created DeadLock: 1
Created DeadLock: 2
Thread 1 is holding DeadLock: 1
Thread 2 is holding DeadLock: 2
*/