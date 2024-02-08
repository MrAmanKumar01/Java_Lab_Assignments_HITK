package _4_string;
/*Problem 5) Write a Java class called ArrayExample to declare an array of String objects called
Products of the size 10, assign values to each element while declarations and print and sort them.
*/

import java.util.Arrays;

public class ArrayExample {
	public static void main(String[] args) {
		String[] products = new String[10];

		// Assign values to each element
		products[0] = "Apple";
		products[1] = "Banana";
		products[2] = "Orange";
		products[3] = "Grape";
		products[4] = "Watermelon";
		products[5] = "Mango";
		products[6] = "Pineapple";
		products[7] = "Strawberry";
		products[8] = "Kiwi";
		products[9] = "Coconut";

		// Print the original array
		System.out.println("Original Array:");
		for (String product : products) {
			System.out.print(product + " ");
		}

		// Sort the array using Arrays.sort()
		Arrays.sort(products);

		// Print the sorted array
		System.out.println("\n\nSorted Array:");
		for (String product : products) {
			System.out.print(product + " ");
		}
	}
}

/* OUTPUT:
 -----------
Original Array:
Apple Banana Orange Grape Watermelon Mango Pineapple Strawberry Kiwi Coconut 

Sorted Array:
Apple Banana Coconut Grape Kiwi Mango Orange Pineapple Strawberry Watermelon 
*/