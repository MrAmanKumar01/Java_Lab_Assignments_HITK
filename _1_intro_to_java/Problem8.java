/*ProblemNo_1.8)Write a Program in Java to find the sum of all the Prime numbers between a given range of numbers.*/

package _1_intro_to_java;

import java.util.Scanner;

public class Problem8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter start of your range: ");
		int start = sc.nextInt();
		System.out.print("Enter end of your range: ");
		int end = sc.nextInt();
		
		int sum = 0;

		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				sum += i;
			}
		}

		System.out.println("The sum of all the prime numbers between " + start + " and " + end + " is: " + sum);
		sc.close();
	}

	private static boolean isPrime(int number) {
		if (number == 1) {

			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;  //for number == 2, it will neither enter in if statement nor in the for loop and will return "true" perfectly well
	}
}

/*

OUTPUT:
--------
Enter start of your range: 1
Enter end of your range: 11
The sum of all the prime numbers between 1 and 11 is: 28

*/