/*ProblemNo_2.4)The formula for resistors connected in parallel is a little more complex. Given two
resistors with resistances R1 and R2 connected in parallel the equivalent resistance is
given by the inverse of the sum of the inverses, i.e. * If there are more than two resistors
you continue to invert the sum of their inverses;* Write a program that calculates the resistance of a group of resistors arranged in parallel.*/

package _1_intro_to_java;

import java.util.Scanner;

public class Problem14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of resistors: ");
		int numberOfResistors = sc.nextInt();

		double[] resistorValues = new double[numberOfResistors];
		for (int i = 0; i < numberOfResistors; i++) {
			System.out.print("Enter the resistance of resistor " + (i + 1) + ": ");
			resistorValues[i] = sc.nextDouble();
			
		}
		System.out.println();
		double equivalentResistance = calculateEquivalentResistance(resistorValues);

		System.out.print("The equivalent resistance of the group of resistors is: " + equivalentResistance);

		sc.close();
	}

	private static double calculateEquivalentResistance(double[] resistorValues) {
		double equivalentResistance = 0.0;
		for (double resistorValue : resistorValues) {
			equivalentResistance += 1 / resistorValue;
		}
		equivalentResistance = 1 / equivalentResistance;
		return equivalentResistance;
	}
}

/*

OUTPUT:
--------
Enter the number of resistors: 3
Enter the resistance of resistor 1: 10
Enter the resistance of resistor 2: 20
Enter the resistance of resistor 3: 30

The equivalent resistance of the group of resistors is: 5.454545454545454

*/

