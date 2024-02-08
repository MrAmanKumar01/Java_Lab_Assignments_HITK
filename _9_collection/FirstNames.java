
/*
 1. Write a program that reads in a series of first names and stores them in a LinkedList. Do not store
duplicate names. Allow the user to search for a first name.
 */

package _9_collection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FirstNames {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> s = new HashSet<String>();
		while(true) {
			System.out.println("Enter \"out\" to exit ");
			System.out.println("Enter the name : ");
			String str = sc.next();
			if(str.equals("out"))
				break;
			s.add(str);
		}
		
		List<String> lst = new LinkedList<String>(s);
		System.out.println(lst);
		System.out.println("Enter a first name to search : ");
		String str1 = sc.next();
		boolean flag = false;
		for(String st : lst) {
			if(st.equals(str1)) {
				flag = true;
				break;
			}
		}
		if(flag)
			System.out.println("Name Found");
		else
			System.out.println("Name Not found !!");
		sc.close();
	}
	
}

/*
Output:
-------
Enter "out" to exit
Enter the name :
Aman
Enter "out" to exit
Enter the name :
Prince
Enter "out" to exit
Enter the name :
Naveen
Enter "out" to exit
Enter the name :
Nikita
Enter "out" to exit
Enter the name :
Swati
Enter "out" to exit
Enter the name :
Ujjwal
Enter "out" to exit
Enter the name :
out
[Prince, Naveen, Nikita, Aman, Swati, Ujjwal]
Enter a first name to search :
Swati
Name Found
*/
