package _4_string;
/*
Problem 3) Write a program that takes a String from the user on the command-line and print it in reverse.
“This is a test” must be printed as: “test a is This”.
*/

public class Problem3 {
	public static void main(String[] args) {
		for(int i = args.length-1; i >= 0; i--) {
			System.out.print(args[i]+" ");
		}
	}
}

/* OUTPUT:
 ---------
 test a is This  
 */

