/*
Problem 1) Create three interfaces, each with two methods. Inherit a new interface from the three,
adding a new method. Create a class by implementing the new interface and also
inheriting from a concrete class. Now write four methods, each of which takes one of the
four interfaces as an argument. In main(), create an object of your class and pass it to
each of the methods.
*/

package _5_interface_and_package.interfaces;

interface A{
	void hi();
	void hello();
}

interface B{
	void display();
	void show();
}

interface C{
	void write();
	void read();
}

interface NewOne extends A, B, C{
	void newMethod();
}

class Concrete{
	void meth() {
		System.out.println("Concrete class");
	}
}

class Last extends Concrete implements NewOne{
	
	public void hi() {
		System.out.println("hi");
	}

	public void hello() {
		System.out.println("Hello");
	}

	public void display() {
		System.out.println("Display");
	}

	public void show() {
		System.out.println("Show");
	}

	public void write() {
		System.out.println("Write");
	}

	public void read() {
		System.out.println("Read");
	}
	public void newMethod() {
		System.out.println("New Method");
	}
	
	void m1(A a) {
		a.hello();
		a.hi();
	}
	
	void m2(B b) {
		b.display();
		b.show();
	}
	
	void m3(C c) {
		c.read();
		c.write();
	}
	
	void m4(NewOne no) {
		no.newMethod();
	}
}

public class Problem1 {

	public static void main(String[] args) {
		Last l = new Last();
		l.m1(l);
		l.m2(l);
		l.m3(l);
		l.m4(l);
	}
}
