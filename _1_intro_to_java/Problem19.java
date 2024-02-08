/*ProblemNo_2.9)Write a program to find the elements, a [i, j] in a two-dimensional array which are
maximum element to the ith row and jth column.*/

package _1_intro_to_java;

import java.util.Scanner;

public class Problem19
{
	public static void main(String args[])
	{
		int i,j,max;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int r=in.nextInt();
		System.out.print("Enter the number of coloumns: ");
		int c=in.nextInt();
		int a[][]=new int[r][c];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.println("Enter the (" + i + "," + j + ")th term");
				a[i][j]=in.nextInt();
			}
		}
		System.out.println();
		System.out.println("The 2D matrix is: ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println();
		for(i=0;i<r;i++)
		{
			max=a[i][0];
			for(j=0;j<c;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
			System.out.println("Maximum element of " + "row " + i + " is " + max);
		}
		System.out.println();
		for(i=0; i<c; i++)
		{
			max=a[0][i];
			for(j=0; j<r; j++)
			{
				if(a[j][i]>max)
				{
					max=a[j][i];
				}
			}
			System.out.println("Maximum element of "+ "column " + i + " is " + max);
		}
	}
}

/*INPUT:
---------
 * Enter the number of rows: 2
Enter the number of coloumns: 3
Enter the (0,0)th term
10
Enter the (0,1)th term
20
Enter the (0,2)th term
30
Enter the (1,0)th term
40
Enter the (1,1)th term
50
Enter the (1,2)th term
60

OUTPUT:
--------
The 2D matrix is: 
10  20  30  
40  50  60  

Maximum element of row 0 is 30
Maximum element of row 1 is 60

Maximum element of column 0 is 40
Maximum element of column 1 is 50
Maximum element of column 2 is 60*/
