
/*
 2. Write a program that uses a StringTokenizer to tokenize a line of text input by the user and places
each token in a treeSet. Print the elements of the treeSet. [Note: This should cause the elements to be
printed in ascending sorted order.]
 */

package _9_collection;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Token {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a line : ");
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		TreeSet<String> ts = new TreeSet<String>();
		while(st.hasMoreTokens()) {
			ts.add(st.nextToken());
		}
		
		System.out.println(ts);
		for(String i : ts) {
			System.out.println(i);
		}
		sc.close();
	}

}

/*
Output:
---------
Enter a line :
Trying to learn and grasp concepts of Core Java ASAP
[ASAP, Core, Java, Trying, and, concepts, grasp, learn, of, to]
ASAP
Core
Java
Trying
and
concepts
grasp
learn
of
to
 */
