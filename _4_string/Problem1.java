package _4_string;
/*
Problem 1) Write a Java program to pass the string "Have a nice day!"from the command line, and
display each word in a new line. Use proper import statement for this program.
*/

public class Problem1 {
	public static void main(String[] args) {
		for(int i=0; i<args.length; i++){
			System.out.println(args[i]);
		}
	}
}

/*
OUTPUT:
-------
Have
a
nice
day!
*/
