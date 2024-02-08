/*ProblemNo_1.6)Write a program for determining whether a number is a Peterson number or not.
(e.g. 145 is a Peterson number because 1! + 4! + 5! =145.)*/

package _1_intro_to_java;

import java.util.Scanner;

public class Problem6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");

		int num = sc.nextInt();
		int temp = num;
		int fact = 1, sum = 0;

		while (num != 0) {
			fact = 1;
			int remainder = num % 10;

			for (int i = 1; i <= remainder; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			num = num / 10;
		}

		if (sum == temp) {
			System.out.println("Peterson number");
		} else {
			System.out.println("Not a Peterson number");
		}
		sc.close();
	}
}

/*

OUTPUT:
--------
Enter a number: 145
Peterson number

*/
