package _7_multithreading;

/*Problem 6 & 7) Suppose that two threads “t1” and “t2” access a shared integer “x”. Thread “t1”
indefinitely increases “x” and “t2” indefinitely prints the value of “x”. That is the
threads run in an infinite loop. However, thread “t1” must not increase “x” till that
value of “x” is printed by “t2” and “t2” must not print the same value of “x” more
than once.
Define the classes for implementing “t1” and “t2”. Write appropriate methods for
accomplishing the above.*/

class XEval
{
    int x;
    boolean isIncr = false;

    public XEval()
    {
        x = 0;
    }

    synchronized void incr()
    {
        if (isIncr)
            try
            {
                wait();
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        x++;
        isIncr = true;
        notify();
    }

    synchronized void disp()
    {
        if (!isIncr)
            try
            {
                wait();
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        System.out.println("x: " + x);
        isIncr = false;
        notify();
    }
}

public class Prob6
{
    public static void main(String[] args)
    {
        XEval x = new XEval();

        Thread t2 = new Thread()
        {
            @Override
            public void run()
            {
                while (true)
                {
                    x.incr();
                    try
                    {
                        sleep(1000);
                    } catch (InterruptedException e) {}
                }
            }
        };

        // Incrementing.
        Thread t1 = new Thread()
        {
            @Override
            public void run()
            {
                while (true)
                {
                    x.disp();
                    try
                    {
                        sleep(500);
                    } catch (InterruptedException e) {}
                }
            }
        };

        t1.start();
        t2.start();
    }
}
