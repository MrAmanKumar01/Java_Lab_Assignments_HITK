/*
4. Write a program to find whether an array is subset of another array or not.
 */

package _9_collection;

import java.util.HashSet;
import java.util.Set;

public class SubSet {

	public static void main(String[] args) {
		int A[] = {1,2,3,4,5,6};
		int B[] = {1,2,3,4,5,6,7,8,9};
		Set<Integer> setA = new HashSet<Integer>();
		Set<Integer> setB = new HashSet<Integer>();
		
		for(int i : A) {
			setA.add(i);
		}
		
		for(int i : B) {
			setB.add(i);
		}
		
		if(setB.containsAll(setA)) {
			System.out.println("A is subset of B");
		}else {
			System.out.println("A is not subset of B");
		}
	}

}

/*
Output:
----------
A is subset of B
*/
