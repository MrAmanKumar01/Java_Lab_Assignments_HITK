/*
 2. Design the Queue Using Generic Class that can contain any type of data. Implement the
insertion, deletion methods.
*/
package _8_generics_lambda;
import java.io.*;
class Queue<T extends Object>
{
	int front,rear,size;
	T arr[];
	Queue(int size)
	{
		front=rear=-1;
		this.size=size;
		arr=(T[])new Object[size];
	}	
	public void insert(T num)
	{
		if(rear+1==size)
			System.out.println("Overflow");
		else
		{
			if(front==-1&&rear==-1)
			{
				front=rear=0;
			}
			else 
				rear=rear+1;
			arr[rear]=num;
			System.out.println("Number inserted is "+arr[rear]);
		}
	}
	public void delete()
	{
		if(front==-1||front>rear)
		System.out.println("Underflow");
		else
		{
			System.out.println("Number deleted is "+arr[front]);
			if(front==rear)
			{
				front=rear=-1;
			}
			else 
				front=front+1;
		}
	}
}
public class Q_2 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter size of queue : ");
		int size=Integer.parseInt(br.readLine());
		Queue<Integer> q=new Queue<Integer>(size);
		while(true)
		{
			System.out.println("Enter your choice.....");
			System.out.println("1.Insertion");
			System.out.println("2.Deletion");
			int ch=Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1:
					System.out.println("Enter element to be inserted in queue : ");
					int num=Integer.parseInt(br.readLine());
					q.insert(num);
					break;
				case 2:
					q.delete();
					break;
				default:
					System.exit(0);				
			}
		}
	}
}
/*
OUTPUT :
Enter size of queue : 3
Enter your choice.....
1.Insertion
2.Deletion
1
Enter element to be inserted in queue : 
7
Number inserted is 7
Enter your choice.....
1.Insertion
2.Deletion
1
Enter element to be inserted in queue : 
8
Number inserted is 8
Enter your choice.....
1.Insertion
2.Deletion
1
Enter element to be inserted in queue : 
6
Number inserted is 6
Enter your choice.....
1.Insertion
2.Deletion
1
Enter element to be inserted in queue : 
2
Overflow
Enter your choice.....
1.Insertion
2.Deletion
2
Number deleted is 7
Enter your choice.....
1.Insertion
2.Deletion
2
Number deleted is 8
Enter your choice.....
1.Insertion
2.Deletion
2
Number deleted is 6
Enter your choice.....
1.Insertion
2.Deletion
2
Underflow
Enter your choice.....
1.Insertion
2.Deletion
*/