/*ProblemNo_1.9)Write a program to obtain the sum of the n terms (n to be taken from the user) of the
following series 1 - 3^2/2 + 5^3/3 - 7^4/4.................................................*/

package _1_intro_to_java;

import java.util.Scanner;

public class Problem9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range for the series: ");
		int n = sc.nextInt();
		int fact;
		float current, sum = 1;

		if (n == 0) {
			System.out.println("Enter valid range value");
		} else if (n == 1) {
			System.out.println("Sum is: " + sum);
		} else {
			for (int i = 2; i <= n; i++) {
				fact = (2 * i) - 1;
				current = (float) ((Math.pow(fact, i)) / i);
				if (i % 2 == 0) {
					sum -= current;
				} else {
					sum += current;
				}
			}
			System.out.println("Sum is: " + sum);
		}
		sc.close();
	}
}

/*

OUTPUT:
--------
Enter the range for the series: 3
Sum is: 38.166668

*/
