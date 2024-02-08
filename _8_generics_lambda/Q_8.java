/*
8. Write a program to create a thread using a lambda expression.
*/
package _8_generics_lambda;
public class Q_8
{
	public static void main(String[] args) 
	{
		Runnable r=()->{
			System.out.println("Thread is running...");
     };
     Thread t=new Thread(r);
     t.start();
	}
}
/*
OUTPUT :
Thread is running...
*/