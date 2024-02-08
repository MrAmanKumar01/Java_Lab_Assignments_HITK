/*
Problem 5)Complete the following:
i) Create a package named org.shapes.
ii) Create some classes in the package representing some common geometric shapes like
Square, Triangle, Circle and so on. The classes should contain area and perimeter
methods in them.
iii) Compile the package.
iv) Use this package to find area and perimeter of different shapes as chosen by the user.
*/

package _5_interface_and_package.interfaces;
import java.util.Scanner;

import _5_interface_and_package.org.shapes.*;
public class Problem5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Circle ");
		System.out.println("2. Square ");
		System.out.println("3. triangle ");
		System.out.print("Enter any option: ");
		int op = sc.nextInt();
		
		switch(op) {
		case 1:
			System.out.print("Enter the radius: ");
			Circle c1 = new Circle(sc.nextInt());
			c1.area();
			c1.perimeter();
			break;
		case 2:
			System.out.print("Enter the side: ");
			Square s= new Square(sc.nextInt());
			s.area();
			s.perimeter();
			break;
		case 3:
			System.out.print("Enter the sides space seperated: ");
			Triangle t= new Triangle(sc.nextInt(),sc.nextInt(),sc.nextInt());
			t.area();
			break;
		default:
			System.out.println("Invaild input");
		}
		sc.close();
	}

}

/*
OUTPUT:
----------
1. Circle 
2. Square 
3. triangle 
Enter any option: 2
Enter the side: 5
Area: 25
Perimeter : 20
 */
