package _5_interface_and_package.p4;
import _5_interface_and_package.p2.Sample2;
import _5_interface_and_package.p3.Test;
class Pug extends Test{
	Sample2 m1() {
		Dog d = new Dog();
		return (Sample2) d;
	}
	
}
public class LastClass {

	public static void main(String[] args) {
		Pug dan = new Pug();
		Sample2 s = dan.m1();
		s.sound();

	}

}
