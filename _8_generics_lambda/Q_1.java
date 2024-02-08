/*1. Design the Stack Using Generic Class that can contain any type of data. Implement the insertion,
deletion, peek function.
*/

package _8_generics_lambda;
import java.io.*;
class stack<T extends Object>
{
	int top,size;
	T  arr[];
	stack(int size)
	{
		top=-1;
		this.size=size;
		this.arr=(T[])new Object[size];
	}
	public void push(T num)
	{
		if(top==size-1)
			System.out.println("Stack Overflow.");
		else
		{
			arr[++top]=num;
			System.out.println("Number inserted "+num);
		}
		
	}
	public void pop()
	{
		if(top==-1)
			System.out.println("Stack is Empty.");
		else
			System.out.println("Number deleted "+arr[top--]);
	}
	public void peek()
	{
		if(top>=0&&top<=size-1)
		System.out.println("Top most number in stack is "+arr[top]);
		else
			System.out.println("Stack is either empty or full.");
	}
	
}
public class Q_1 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of stack : ");
		int size=Integer.parseInt(br.readLine());
		stack<Integer>st=new stack<Integer>(size);
		while(true)
		{
			System.out.println("Enter your choice....");
			System.out.println("1.Insert");
			System.out.println("2.Delete");
			System.out.println("3.Peek");
			int ch=Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1:
					System.out.println("Enter a number to be inserted : ");
					int num=Integer.parseInt(br.readLine());
					st.push(num);
					break;
				case 2:
					st.pop();
					break;
				case 3:
					st.peek();
					break;
				default:
					System.exit(0);
			}
		}
	}
}
/*
OUTPUT : 
Enter size of stack : 
5
Enter your choice....
1.Insert
2.Delete
3.Peek
1
Enter a number to be inserted : 
7
Number inserted 7
Enter your choice....
1.Insert
2.Delete
3.Peek
1
Enter a number to be inserted : 
8
Number inserted 8
Enter your choice....
1.Insert
2.Delete
3.Peek
1
Enter a number to be inserted : 
6
Number inserted 6
Enter your choice....
1.Insert
2.Delete
3.Peek
1
Enter a number to be inserted : 
0
Number inserted 0
Enter your choice....
1.Insert
2.Delete
3.Peek
2
Number deleted 0
Enter your choice....
1.Insert
2.Delete
3.Peek
3
Top most number in stack is 6
Enter your choice....
1.Insert
2.Delete
3.Peek
	
*/