package _9_collection;

import java.util.HashSet;
import java.util.Set;


//5. Write a program to find elements which are present in first array and not in second array.

public class SetDiff {

	public static void main(String[] args) {
		int A[] = {1,2,3,4,5};
		int B[] = {1,2,6,7,8};
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		for(int i : A) {
			set1.add(i);
		}
		
		for(int i : B) {
			set2.add(i);
		}
		set1.removeAll(set2);
		System.out.println(set1);
	}

}

/*
Output:
---------
[3, 4, 5]
*/