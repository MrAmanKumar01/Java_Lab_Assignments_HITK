/*
6. Write a java program to check the number where the difference between every adjacent digit should be 1
using ArrayList.
 */

package _9_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnePunchMan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> lst = new ArrayList<Integer>();
		while(n>0) {
			lst.add(n%10);
			n/=10;
		}
		System.out.println(lst);
		boolean flag = true;
		for(int i =0,j=1; j<lst.size(); i++,j++) {
			if(Math.abs(lst.get(i)-lst.get(j))!=1) {
				flag = false;
				break;
			}
		}
		System.out.println(flag);
		sc.close();
	}

}

/*
987654321
[1, 2, 3, 4, 5, 6, 7, 8, 9]
true
*/