/*ProblemNo_2.7)Given are two one-dimensional arrays A & B, which are sorted in ascending order. Write
a program to merge them into single sorted array C that contains every item from arrays.
A & B, in ascending order.*/

package _1_intro_to_java;

public class Problem17 {

	public static void main(String[] args) {
		int[] A = { 1, 3, 5, 7, 9 };
		int[] B = { 2, 4, 6, 8, 10 }; 

		int[] C = mergeArrays(A, B);

		// Print the merged array
		for (int i = 0; i < C.length; i++) {
			System.out.print(C[i] + " ");
		}
	}

	private static int[] mergeArrays(int[] A, int[] B) {
		int[] C = new int[A.length + B.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < A.length && j < B.length) {
			if (A[i] < B[j]) {
				C[k++] = A[i++];
			} else {
				C[k++] = B[j++];
			}
		}

		// Copy the remaining elements from A and B to C
		while (i < A.length) {
			C[k++] = A[i++];
		}
		while (j < B.length) {
			C[k++] = B[j++];
		}

		return C;
	}
}

/* 
OUTPUT: 
--------
1 2 3 4 5 6 7 8 9 10  
 
*/

