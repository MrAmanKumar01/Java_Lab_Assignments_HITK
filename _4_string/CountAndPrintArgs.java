package _4_string;
/*Problem 2) Write a Java class called CountAndPrintArgs to print the number of arguments passed on
the command-line as well as the 1st letter of the arguments. For example, if the command
line arguments are: "Mango Cucumber Apple" then the output will be
No. of arguments - 3 MCA
Write a main method to test the class.
*/

public class CountAndPrintArgs {
	public static void main(String args[]) {
		System.out.print("No. of arguments - "+args.length+" ");
		for(int i = 0; i < args.length; i++){
			System.out.print(args[i].charAt(0));

		}
	}
}

/*
OUTPUT:
-------- 
No. of arguments - 3 MCA
*/

