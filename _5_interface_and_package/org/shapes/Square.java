package _5_interface_and_package.org.shapes;

public class Square {
	int side;
	public Square(int side){
		this.side = side;
	}
	public void area() {
	System.out.println("Area: "+ side*side);
	}
	public void perimeter() {
		System.out.println("Perimeter : "+side*4);
	}
}
