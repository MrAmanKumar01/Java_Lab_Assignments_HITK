/*ProblemNo_1.2)Write a program to find the roots (real and imaginary) of the quadratic equation of the form
ax^2+ bx + c = 0.*/

package _1_intro_to_java;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the coefficients a, b, and c of the quadratic equation: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            // The roots are real and different
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("The roots of the quadratic equation are: ");
            System.out.println(root1);
            System.out.println(root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);

            System.out.println("The root of the quadratic equation is: ");
            System.out.println(root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);

            System.out.println("The roots of the quadratic equation are complex: ");
            System.out.println(realPart + "+" + imaginaryPart + "i");
            System.out.println(realPart + "-" + imaginaryPart + "i");
        }

		sc.close();
    }
}

/*

 OUTPUT:
 --------
 Enter the coefficients a, b, and c of the quadratic equation: 
2 8 4
The roots of the quadratic equation are: 
-0.5857864376269049
-3.414213562373095

***************************
Enter the coefficients a, b, and c of the quadratic equation:
1 0 1
The roots of the quadratic equation are complex:
-0.0+1.0i
-0.0-1.0i

***************************
Enter the coefficients a, b, and c of the quadratic equation:
2 0 -1          ------------->> eske liye imaginary aana chahiye tha, but real and equal roots aa raha kyun ??
The roots of the quadratic equation are:
0.7071067811865476
-0.7071067811865476

*/
