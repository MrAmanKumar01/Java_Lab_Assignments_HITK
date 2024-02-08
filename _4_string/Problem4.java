package _4_string;
/*
Problem 4) Write a program to accept a string from the user and find out the following statistics:
(a) Count of uppercase character
(b) Count of lowercase character
(c) Count of digits
(d) Count of spaces
*/

import java.util.Scanner;
public class Problem4 {
	public static void main(String args[]) {
		int i, up=0, low=0, dig=0, space=0;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your string: ");
		str = sc.nextLine();
		sc.close();
		
		for(i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z'){
				up++;
			} else if(ch >= 'a' && ch <= 'z'){
				low++;
			} else if(str.charAt(i) >= 48 && str.charAt(i) <= 57){
				dig++; 
			} else if(str.charAt(i) == 32) {
				space++;
			}
		}
		System.out.println("No. of uppercase character: "+up);
		System.out.println("No. of lowercase character: "+low);
		System.out.println("No. of digits: "+ dig);
		System.out.println("No. of spaces: "+ space);
	}
}

/*
OUTPUT:
--------
Enter your string: I am Aman Kumar from MCA dept having roll no. 2382009
No. of uppercase character: 6
No. of lowercase character: 29
No. of digits: 7
No. of spaces: 10
*/
