package _5_interface_and_package.p3;
import _5_interface_and_package.p2.*;
public class Test{
	public class Dog implements Sample2 {
		public Dog() {}
		public void sound() {
			System.out.println("Bark");
		}
		
	}
}
