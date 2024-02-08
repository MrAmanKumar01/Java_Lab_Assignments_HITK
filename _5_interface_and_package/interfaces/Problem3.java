/*
Problem 3) Create a private inner class that implements a public interface. Write a method that
returns a reference to an instance of the private inner class, up cast to the interface. Show
that the inner class is completely hidden by trying to downcast to it.
 */

package _5_interface_and_package.interfaces;

import _5_interface_and_package.p2.Inter;

class Outer{
	private class Inner implements Inter{
		public void message() {
			System.out.println("Hello ");
		}
	}
	Inner create() {
		return new Inner();
	}
}

public class Problem3 {

	public static void main(String[] args) {
		Outer o = new Outer();
		Inter i = (Inter)o.create();
		i.message();
		
		// if we try to downcast the i, we will get an error
//		Inter j = (Inner) i;
	}

}
