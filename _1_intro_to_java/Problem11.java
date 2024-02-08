/*ProblemNo_2.1)Given a list of marks (ranging from 0 to 100) of n (user input) students, write a program to
print the number of students who have obtain marks:
(a) in the range 81 to 100 (b) in the range 61 to 80
(c) in the range 41 to 60  (d) in the range 0 to 40*/

package _1_intro_to_java;

import java.util.Scanner;

public class Problem11 {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter the number of students
		System.out.print("Enter the number of students: ");
		int n = sc.nextInt();

		// Create an array to store the marks of the students
		int marks[] = new int[n];

		// Prompt the user to enter the marks of the students
		System.out.print("Enter the marks of the students: ");
		for (int i = 0; i < n; i++) {
			marks[i] = sc.nextInt();
		}

		// Initialize the counters for each range of marks
		int count81To100 = 0;
		int count61To80 = 0;
		int count41To60 = 0;
		int count0To40 = 0;

		// Iterate over the marks and count the number of students in each range
		for (int i = 0; i < n; i++) {
			if (marks[i] >= 81 && marks[i] <= 100) {
				count81To100++;
			} else if (marks[i] >= 61 && marks[i] <= 80) {
				count61To80++;
			} else if (marks[i] >= 41 && marks[i] <= 60) {
				count41To60++;
			} else {
				count0To40++;
			}
		}

		// Print the number of students in each range of marks
		System.out.println("Number of students with marks in the range 81 to 100: " + count81To100);
		System.out.println("Number of students with marks in the range 61 to 80: " + count61To80);
		System.out.println("Number of students with marks in the range 41 to 60: " + count41To60);
		System.out.println("Number of students with marks in the range 0 to 40: " + count0To40);
		
		sc.close();
	}
}

/*

OUTPUT:
--------
Enter the number of students: 5
Enter the marks of the students: 33 47 69 89 97
Number of students with marks in the range 81 to 100: 2
Number of students with marks in the range 61 to 80: 1
Number of students with marks in the range 41 to 60: 1
Number of students with marks in the range 0 to 40: 1

*/

