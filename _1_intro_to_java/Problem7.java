/*ProblemNo_1.7)Write a program to find all Armstrong numbers in the range 1 to M, where M is taken as input.*/
/*
An Armstrong number, also known as a narcissistic number or plenary number, is a special type of number in mathematics.
It's defined as a number that is equal to the sum of its digits, each raised to the power of the number of digits it has.
*/
package _1_intro_to_java;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the upper limit of the range: ");
        int M = scanner.nextInt();

		// Iterate over the range and check if each number is an Armstrong number
        for (int i = 1; i <= M; i++) {
			if (isArmstrongNumber(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }

	private static boolean isArmstrongNumber(int number) {
        int sum = 0;
		int originalNumber = number;

        while (number > 0) {
			int remainder = number % 10;
			sum += Math.pow(remainder, 3);
			number /= 10;
        }

		return sum == originalNumber;  //Returns "true" if the sum of the cubed digits equals the original number
    }
}

/*

OUTPUT:
--------
Enter the upper limit of the range: 1000
1
153
370
371
407

*/