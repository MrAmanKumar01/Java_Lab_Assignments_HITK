package _7_multithreading;

/*Problem 3) Write a program to sort a list of strings using multithreading. Create one of the
threads that take a string as input from the user, another thread that sorts the
strings and finally another thread that displays the sorted list of strings. Each of
the input, sort, and display methods is to be synchronized.
*/

import java.util.Scanner;

class SortStrings
{
    String str[];
    boolean sorted = false;
    static Scanner sc;

    SortStrings()
    {
        str = null;
        sc = new Scanner(System.in);
    }

    synchronized void input()
    { //Taking input
        System.out.print("Enter number of string inputs to be taken : ");
        str = new String[sc.nextInt()];
        System.out.println("Enter the Strings : ");
        for (int i = 0; i < str.length; i++)
            str[i] = sc.next();
    }

    synchronized void sort()
    { // Sorting
        for (int i = 0; i < str.length; i++)
        {
            int j;
            String t = str[i];
            for (j = i - 1; j >= 0 && (str[j].compareToIgnoreCase(t) > 0); j--)
                str[j + 1] = str[j];
            str[j + 1] = t;
        }
        sorted = true;
        notify(); // Notifies once string array is sorted.
    }

    synchronized void display()
    {
        if (!sorted)
        {
            try {
                wait(); // Waits for the string array to be sorted.
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

        for (String i : str)
            System.out.println(i);
    }
}
class InputStrings extends Thread
{
    SortStrings ob;

    public InputStrings(SortStrings ob)
    {
        this.ob = ob;
    }
    public void run()
    { // Thread for input.
        ob.input();
    }
}

class Sort extends Thread
{
    SortStrings ob;

    public Sort(SortStrings ob)
    {
        this.ob = ob;
    }
    public void run()
    { // Thread for sort.
        ob.sort();
    }
}

class DisplayStrings extends Thread
{
    SortStrings ob;

    public DisplayStrings(SortStrings ob)
    {
        this.ob = ob;
    }
    public void run()
    {
        ob.display();
    }
}

public class Prob3
{
    public static void main(String[] args)
    {
        SortStrings ob = new SortStrings();
        new InputStrings(ob).start();
        new Sort(ob).start();
        new DisplayStrings(ob).start();
    }
}
/*
OUTPUT :
---------
Enter number of string inputs to be taken : 5
Enter the Strings :
Meta
Apple
Amazon
Netflix
Google
Amazon
Apple
Google
Meta
Netflix
*/