/*
Problem 5) Create two Thread subclasses, one with a run( ) that starts up, captures the
reference of the second Thread object and then calls wait( ). The other class’
run( ) should call notifyAll( ) for the first thread after some number of seconds
have passed, so the first thread can print a message.
*/

package _7_multithreading;
class Resource
{
    synchronized void waiter()
    {
        try
        {
            wait();
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    synchronized void notifier()
    {
        notifyAll();
    }
}

class Waiter extends Thread
{
    Thread t;
    Resource r;

    public Waiter(Thread t, Resource r)
    {
        this.t = t;
        this.r = r;
    }

    @Override
    public void run()
    {
        t.start();
        System.out.println("Waiting to be notified");
        r.waiter();
        System.out.println("Waiting Over");
    }
}

class Notifier extends Thread
{
    Resource r;

    public Notifier(Resource r)
    {
        this.r = r;
    }

    public void run()
    {
        try
        {
            sleep(2000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("To be notified now");
        r.notifier();
    }
}

public class Prob5
{
    public static void main(String[] args)
    {
        // Resource object creation.
        Resource r = new Resource();

        // Notifier thread.
        Notifier ntfr = new Notifier(r);

        // Calling waiter thread.
        new Waiter(ntfr, r).start();
    }
}
/*
 OUTPUT :
Waiting to be notified
To be notified now
Waiting Over
*/
