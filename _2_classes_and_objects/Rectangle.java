package _2_classes_and_objects;
/* Problem 1.3)
Write a program to print the area of a rectangle by creating a class named 'Area' having two
methods. First method named as 'setDim' takes length and breadth of rectangle as parameters
and the second method named as 'getArea' returns the area of the rectangle. Length and breadth
of rectangle are entered through keyboard.
*/

import java.util.Scanner;
class Area {
    private int length;
    private int breadth;

    public void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea() {
        return length * breadth;
    }
}

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");
        int length = sc.nextInt();

        System.out.println("Enter the breadth of the rectangle: ");
        int breadth = sc.nextInt();

        // Create an object of the Area class
        Area area = new Area();

        // Set the dimensions of the rectangle
        area.setDim(length, breadth);

        // Get the area of the rectangle
        int areaOfRectangle = area.getArea();

        System.out.println("The area of the rectangle is: " + areaOfRectangle);
        
        sc.close();
    }
}

/*
OUTPUT:
--------
Enter the length of the rectangle: 
15
Enter the breadth of the rectangle: 
7
The area of the rectangle is: 105
*/

