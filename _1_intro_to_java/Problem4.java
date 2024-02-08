/*ProblemNo_1.4)Write a program for determining whether a number is a Perfect number or not. (e.g. 28 is a
Perfect Number because Sum of the Divisor of 28 = 1+2+4+7+14 = 28.)*/

package _1_intro_to_java;

import java.util.Scanner;


public class Problem4{
	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		for(int i=1;i<=n/2;i++){
			if(n%i==0){
				sum=sum+i;	
			}		
		}
		if(sum==n){
			System.out.println("Perfect number");
		}else{
			System.out.println("Not a Perfect number");
		}
		sc.close();
	}
}

/*
 OUTPUT:
----------
Enter a number: 28
Perfect number

*/
