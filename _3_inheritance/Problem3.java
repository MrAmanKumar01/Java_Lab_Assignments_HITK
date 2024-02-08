package _3_inheritance;
/*Problem 3) Write a program to create a class named Vehicle having protected instance variables
regnNumber, speed, color, ownerName and a method showData ( ) to show �This is a vehicle
class�. Inherit the Vehicle class into subclasses named Bus and Car having individual private
instance variables routeNumber in Bus and manufacturerName in Car and both of them
having showData ( ) method showing all details of Bus and Car respectively with content of
the super class�s showData ( ) method.
*/

class Vehicle {
    protected String regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;

    public Vehicle(){} //Default constructor

    public Vehicle(String regnNumber, int speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    public void showData() {
        System.out.println("This is a vehicle class.");
    }
}

class Bus extends Vehicle {
    private String routeNumber;

    public Bus(String regnNumber, int speed, String color, String ownerName, String routeNumber) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
        this.routeNumber = routeNumber;
    }

    //Override
    public void showData() {
        System.out.println("Vehicle Details:");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);

        System.out.println("Bus Details:");
        System.out.println("Route Number: " + routeNumber);
    }
}

class Car extends Vehicle {
    private String manufacturerName;

    public Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
//        this.regnNumber = regnNumber;
//        this.speed = speed;
//        this.color = color;
//        this.ownerName = ownerName;
        super(regnNumber,speed, color,ownerName); //Using super that's why upar ka sab comment out kr diye
        this.manufacturerName = manufacturerName;
    }

    //Override
    public void showData() {
        System.out.println("Vehicle Details:");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);

        System.out.println("Car Details:");
        System.out.println("Manufacturer Name: " + manufacturerName);
    }
}

public class Problem3{
	public static void main(String[] args) {
		Bus bus = new Bus("MH04 AB 1234", 60, "Red", "Anil Sah", "Route 12");
		bus.showData();

        System.out.println("--------------------------------------");

		Car car = new Car("WB03 YJ 1111", 100, "Premium Black", "Aman Kumar", "BMW");
		car.showData();

	}
}

/*
OUTPUT:
---------
Vehicle Details:
Registration Number: MH04 AB 1234
Speed: 60
Color: Red
Owner Name: Anil Sah
Bus Details:
Route Number: Route 12
--------------------------------------
Vehicle Details:
Registration Number: WB03 YJ 1111
Speed: 100
Color: Premium Black
Owner Name: Aman Kumar
Car Details:
Manufacturer Name: BMW

*/