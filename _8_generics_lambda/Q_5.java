/*
 5. Write the following methods that return a lambda expression performing a specified action:
isOdd(): The lambda expression must return true if a number is odd or false if it is even.
isPrime(): The lambda expression must return true if a number is prime or false if it is composite.
isPalindrome(): The lambda expression must return true if a number is a palindrome or false if it is not.
*/
package _8_generics_lambda;
import java.io.*;
//Defining an interface with one abstract method check
interface performaction
{
	boolean check(int num);
}
class ArithmeticOperation
{
	public static boolean checking(performaction p,int num)
	{
		return p.check(num);
	}
	public performaction isOdd()
	{
		return(num)->{
			return (num%2==1);
		};
	}
	public performaction isPrime()
	{
		return(num)->{
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
					return false;
			}
			return true;
		};
	}
	public performaction isPalindrome()
	{
		return(num)->{
			int d,rev=0,copy=num;
			while(copy!=0)
			{
				d=copy%10;
				rev=(rev*10)+d;
				copy=copy/10;
			}
			return rev==num;
		};
	}
}
public class Q_5 {

	public static void main(String[] args) throws IOException
	{
		ArithmeticOperation ob=new ArithmeticOperation();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of test cases : ");
		int t=Integer.parseInt(br.readLine());
		performaction pa;
		boolean r=false;
		String a=null;
		while(t-->0)
		{
			System.out.println("Enter your choice then enter number : \nPress 1 to check odd...\nPress 2 to check prime...\nPress 3 to check palindrome...");
			int ch=Integer.parseInt(br.readLine());
			int n=Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1:
					pa=ob.isOdd();
					r=ob.checking(pa,n);
					a=(r)?"ODD":"NOT ODD";
					break;
				case 2:
					pa=ob.isPrime();
					r=ob.checking(pa, n);
					a=(r)?"PRIME":"NOT PRIME";
					break;
				case 3:
					pa=ob.isPalindrome();
					r=ob.checking(pa, n);
					a=(r)?"PALINDROME":"NOT PALINDROME";
			}
			System.out.println(a);
		}
	}
}
/*
OUTPUT :
Enter number of test cases : 
3
Enter your choice then enter number :
Press 1 to check odd...
Press 2 to check prime...
Press 3 to check palindrome...
1
69
ODD
Enter your choice then enter number :
Press 1 to check odd...
Press 2 to check prime...
Press 3 to check palindrome...
2
5
PRIME
Enter your choice then enter number :
Press 1 to check odd...
Press 2 to check prime...
Press 3 to check palindrome...
3
88
PALINDROME
*/