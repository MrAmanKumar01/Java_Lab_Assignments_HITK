package _5_interface_and_package.org.shapes;

public class Circle {
	int radius;
	public Circle(int radius){
		this.radius = radius;
	}
	public void area() {
		System.out.println("Area: "+ 3.14*radius*radius);
	}
	public void perimeter() {
		System.out.println("circumference: "+ 3.14*2*radius);
	}
}
