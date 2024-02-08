/*ProblemNo_1.3)The nos. in the sequence 0 1 1 2 3 5 8 13 21............. are called Fibonacci nos. Write a
program to print the first n (to be taken as input) Fibonacci nos.*/

package _1_intro_to_java;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci numbers you want to print: ");
		int n = sc.nextInt();

        int first = 0;
        int second = 1;

        System.out.print(first + " ");
        System.out.print(second + " ");

        for (int i = 3; i <= n; i++) {
            int next = first + second;

            System.out.print(next + " ");

            first = second;
            second = next;
        }

		sc.close();
    }
}

/*
 
 OUTPUT:
------------
Enter the number of Fibonacci numbers you want to print: 7
0 1 1 2 3 5 8 

*/