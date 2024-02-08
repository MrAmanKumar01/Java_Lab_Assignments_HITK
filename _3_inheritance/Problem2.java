package _3_inheritance;
/*
Problem 2) Create a general class ThreeDObject and derive the classes Box, Cube, Cylinder and Cone
from it. The class ThreeDObject has methods wholeSurfaceArea ( ) and volume ( ). Override
these two methods in each of the derived classes to calculate the volume and whole surface
area of each type of three-dimensional objects. The dimensions of the objects are to be taken
from the users and passed through the respective constructors of each derived class. Write a
main method to test these classes.
 */

class ThreeDObject {
	protected double volume;
	protected double surfaceArea;

	public void volume() {
		// Implement volume calculation for the specific object type
	}

	public void wholeSurfaceArea() {
		// Implement surface area calculation for the specific object type
	}

	public double getVolume() {
		return volume;
	}

	public double getSurfaceArea() {
		return surfaceArea;
	}
}

class Box extends ThreeDObject {
	private double length;
	private double width;
	private double height;

	public Box(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	//Override
	public void volume() {
		volume = length * width * height;
	}

	//Override
	public void wholeSurfaceArea() {
		surfaceArea = 2 * (length * width + length * height + width * height);
	}
}

class Cube extends ThreeDObject {
	private double side;

	public Cube(double side) {
		this.side = side;
	}

	//Override
	public void volume() {
		volume = side * side * side;
	}

	//Override
	public void wholeSurfaceArea() {
		surfaceArea = 6 * side * side;
	}
}

class Cylinder extends ThreeDObject {
	private double radius;
	private double height;

	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	//Override
	public void volume() {
		volume = Math.PI * radius * radius * height;
	}

	//Override
	public void wholeSurfaceArea() {
		surfaceArea = 2 * Math.PI * radius * (radius + height);
	}
}

class Cone extends ThreeDObject {
	private double radius;
	private double height;

	public Cone(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	//Override
	public void volume() {
		volume = (1.0 / 3.0) * Math.PI * radius * radius * height;
	}

	//Override
	public void wholeSurfaceArea() {
		double slantHeight = Math.sqrt(radius * radius + height * height);
		surfaceArea = Math.PI * radius * radius + Math.PI * radius * slantHeight;
	}
}

public class Problem2 {
	public static void main(String[] args) {
		// Create a Box object
		Box box = new Box(5, 4, 3);

		// Calculate and display volume and surface area
		box.volume();
		box.wholeSurfaceArea();

		System.out.println("Box volume: " + box.getVolume());
		System.out.println("Box surface area: " + box.getSurfaceArea());

		// Create a Cube object
		Cube cube = new Cube(10);

		// Calculate and display volume and surface area
		cube.volume();
		cube.wholeSurfaceArea();

		System.out.println("Cube volume: " + cube.getVolume());
		System.out.println("Cube surface area: " + cube.getSurfaceArea());

		// Create a Cylinder object
		Cylinder cylinder = new Cylinder(5, 8);

		// Calculate and display volume and surface area
		cylinder.volume();
		cylinder.wholeSurfaceArea();

		System.out.println("Cylinder volume: " + cylinder.getVolume());
		System.out.println("Cylinder surface area: " + cylinder.getSurfaceArea());

		// Create a Cone object
		Cone cone = new Cone(3, 6);

		// Calculate and display volume and surface area
		cone.volume();
		cone.wholeSurfaceArea();

		System.out.println("Cone volume: " + cone.getVolume());
		System.out.println("Cone surface area: " + cone.getSurfaceArea());
	}
}

/*
OUTPUT:
---------
Box volume: 60.0
Box surface area: 94.0
Cube volume: 1000.0
Cube surface area: 600.0
Cylinder volume: 628.3185307179587
Cylinder surface area: 408.4070449666731
Cone volume: 56.548667764616276
Cone surface area: 91.49766646167468

*/