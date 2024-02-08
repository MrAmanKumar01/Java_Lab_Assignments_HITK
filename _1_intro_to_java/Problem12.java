/*ProblemNo_2.2)Admission to a professional course is subject to the following conditions:
(a) marks in Mathematics >= 60 (b) marks in Physics >=50
(c) marks in Chemistry >=40 (d) Total in all 3 subjects >=200
(Or)
Total in Maths & Physics>=150
Given the marks in the 3 subjects of n (user input) students, write a program to process
the applications to list the eligible candidates.*/

package _1_intro_to_java;

import java.util.Scanner;

public class Problem12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the marks in Mathematics: ");
		int mathMarks = sc.nextInt();
		System.out.print("Enter the marks in Physics: ");
		int physicsMarks = sc.nextInt();
		System.out.print("Enter the marks in Chemistry: ");
		int chemistryMarks = sc.nextInt();
		System.out.println();

		boolean isEligible = false;
		if (mathMarks >= 60 && physicsMarks >= 50 && chemistryMarks >= 40
				&& (mathMarks + physicsMarks + chemistryMarks >= 200 || mathMarks + physicsMarks >= 150)) {
			isEligible = true;
		}

		if (isEligible) {
			System.out.println("The student is eligible for admission to the professional course.");
		} else {
			System.out.println("The student is not eligible for admission to the professional course.");
		}

		sc.close();
	}
}

/*

OUTPUT:
--------
Enter the marks in Mathematics: 69
Enter the marks in Physics: 53
Enter the marks in Chemistry: 87

The student is eligible for admission to the professional course.

*/

