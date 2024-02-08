package _4_string;
/*
Problem 7) Write a program to determine if a string has all Unique Characters.[remove white space]
Given a string, determine if the string has all unique characters.
*/
import java.util.Scanner;

public class UniqueCharacters {
	boolean hasAllUniqueCharacters(String str){
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					return false;    /* If duplicate character is found, return false */
				}
			}
		}    
		return true;  /* If all characters are unique, return true */
	}

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your string here: ");
		str = sc.nextLine();
		str = str.replaceAll(" ","");  /* remove all white spaces */
		UniqueCharacters obj = new UniqueCharacters();
		if(obj.hasAllUniqueCharacters(str)) {
			System.out.println("\"String has all unique characters\"");
		} else {
			System.out.println("\"String has duplicate characters\"");
		}
		sc.close();
	}
}

/* 
OUTPUT:
--------
Enter your string here: WB 40 AY 5678
String has all unique characters
*/