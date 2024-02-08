/*ProblemNo_1.5)Write a program to find the prime factors of the given number . (e.g. Input : 315 Output: 3 3
5 7)*/

package _1_intro_to_java;

import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 2; i <= Math.sqrt(number); i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }

        if (number > 1) {   //After the loops, if the number is still greater than 1, it means there's a remaining prime factor that hasn't been divided out yet.
            System.out.print(number);  //prints the remaining factor
        }
        sc.close();
    }
}

/*

OUTPUT:
--------
Enter a number: 56
2 2 2 7

*/