/*ProblemNo_1.1)Write a program that reads three coordinate and calculate the side of triangle. Check whether
these numbers can be considered as the three sides of a triangle. If so, find the type
(isosceles, equilateral or right-angled) and area of the triangle.*/

package _1_intro_to_java;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the three coordinates: ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();

        // Calculate the side lengths of the triangle
        int side1 = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        int side2 = (int) Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        int side3 = (int) Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));

        // Check if the three side lengths can form a triangle
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            // Calculate the area of the triangle
            double area = 0.5 * (side1 + side2 + side3) * Math.sqrt((side1 + side2 - side3) * (side2 + side3 - side1) * (side3 + side1 - side2));

            // Find the type of triangle
            String type = "";
            if (side1 == side2 && side2 == side3) {
                type = "equilateral";
            } else if (side1 == side2 || side2 == side3 || side3 == side1) {
                type = "isosceles";
            } else {
                type = "scalene";
            }

            // Print the results
            System.out.println("The triangle is a " + type + " triangle with an area of " + area);
        } else {
            System.out.println("The three side lengths cannot form a triangle.");
        }

		sc.close();
    }
}

/*OUTPUT 1:
-------------
Enter the three coordinates: 
0 0 4 5 8 0
The triangle is a isosceles triangle with an area of 160.0

OUTPUT 2:
------------
Enter the three coordinates: 
0 0 4 6 8 2
The triangle is a scalene triangle with an area of 154.91933384829667

*/

