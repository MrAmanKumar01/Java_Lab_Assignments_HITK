/*
 3. Write a program that inputs the names of people into different array list, A and B. Array A has N
number of names while array B has M number of names, with no duplicates in either of them. Merge
arrays A and B into a single array list C, such that the resulting array list is sorted alphabetically.
Display all the three arrays list, A, B and C, stored alphabetically.
 */

package _9_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NameList {
	public static void main(String [] args) {
		List<String> A = new ArrayList<String>();
		List<String> B = new ArrayList<String>();
		A.add("Aman");
		A.add("Raman");
		A.add("Raghav");
		
		B.add("Ram");
		B.add("Rahim");
		B.add("Kabir");
		B.add("Sawant");
		B.add("Sameer");
		
		List<String>C = new ArrayList<String>();
		
		for(String str : A) {
			C.add(str);
		}
		for(String str : B) {
			C.add(str);
		}
		
		Collections.sort(A);
		Collections.sort(B);
		Collections.sort(C);
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
	}
}

/*
[Aman, Raghav, Raman]
[Kabir, Rahim, Ram, Sameer, Sawant]
[Aman, Kabir, Raghav, Rahim, Ram, Raman, Sameer, Sawant]
 */
