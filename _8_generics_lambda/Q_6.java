/*
6. Write a methods [double operation(double a, double b)]; ] that return a lambda expression implement a
calculator perform Addition, Subtraction, Division, Multiplication operation.
*/

package _8_generics_lambda;
import java.io.*;
interface Calculator
{
	double operation(double a,double b);
}
class PerformOperation
{
	public static double result(Calculator c,double a,double b)
	{
		return c.operation(a, b);
	}
	public Calculator addition() {
		return(a,b)->{
			return (a+b);
		};
	}
	public Calculator subtraction() {
		return(a,b)->{
			return (a-b);
		};
	}
	public Calculator multiplication()
	{
		return(a,b)->{
			return a*b;
		};
	}
	public Calculator division()
	{
		return(a,b)->{
			return a/b;
		};
	}
}
public class Q_6 
{
	public static void main(String[] args)throws IOException 
	{
		PerformOperation po=new PerformOperation();
		Calculator calc;
		double res=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two numbers : ");
		double a=Double.parseDouble(br.readLine());
		double b=Double.parseDouble(br.readLine());
		System.out.println("Press 1 for addition\nPress 2 for subtraction\nPress 3 for multiplication\nPress 4 for division\nEnter your choice.....");
		int ch=Integer.parseInt(br.readLine());
		switch(ch)
		{
			case 1:
				calc=po.addition();
				res=po.result(calc,a, b);
				break;
			case 2:
				calc=po.subtraction();
				res=po.result(calc,a, b);
				break;
			case 3:
				calc=po.multiplication();
				res=po.result(calc,a, b);
				break;
			case 4:
				calc=po.division();
				res=po.result(calc,a, b);
				break;		
		}
		System.out.println(res);
	}
}
/*
OUTPUT :
Enter two numbers :
21
9
Press 1 for addition
Press 2 for subtraction
Press 3 for multiplication
Press 4 for division
Enter your choice.....
1
30.0

Enter two numbers : 
21
9
Press 1 for addition
Press 2 for subtraction
Press 3 for multiplication
Press 4 for division
Enter your choice.....
2
12.0

Enter two numbers : 
21
9
Press 1 for addition
Press 2 for subtraction
Press 3 for multiplication
Press 4 for division
Enter your choice.....
3
189.0

Enter two numbers : 
21
9
Press 1 for addition
Press 2 for subtraction
Press 3 for multiplication
Press 4 for division
Enter your choice.....
4
2.3333333333333335
*/