package _4_string;
/* 
Problem 6) Write a method (not the entire application) called CountVowels, which takes the input
arguments as character and checks whether it is a vowel; increment the instance variable
called vCnt by 1. 
*/
import java.util.Scanner;

public class Problem6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your string here: ");
		String str = sc.nextLine();
		System.out.print("Number of vowels in the string: " + countVowels(str)+"\n");

		sc.close();
	}

	public static int countVowels(String str) {
		int vCnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'||
					str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' ||
					str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				vCnt++;
			}
		}
		return vCnt;
	}
}

/*
OUTPUT:
--------
Enter your string here: Aman Kumar
Number of vowels in the string: 4
*/