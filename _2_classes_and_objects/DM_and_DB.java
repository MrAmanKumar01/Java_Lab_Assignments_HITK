package _2_classes_and_objects;
/* Problem 2.2)
Create two classes DM and DB which store the value of distances. DM stores distances in
meters and centimeters and DB in feet and inches. Write a program that can read values for
the class objects and add one object of DM with another object of DB. Use method to carry
out the addition operation. The object that stores the result may be a DM object or a DB
object, depending on the units in which the results are required. The display should be done
in the format of feet and inches or meters and centimeters depending on the object on
display.
*/

class DM {
    private double meters;
    private double centimeters;

    public DM(double meters, double centimeters) {
        this.meters = meters;
        this.centimeters = centimeters;
    }

    public double getMeters() {
        return meters;
    }

    public double getCentimeters() {
        return centimeters;
    }

    public DM add(DM dm) {
        DM result = new DM(this.meters + dm.meters, this.centimeters + dm.centimeters);
        return result;
    }

    public DM add(DB db) {
        DM result = new DM(this.meters + (db.getFeet() * 0.3048), this.centimeters + (db.getInches() * 2.54));
        return result;
    }

    public void display() {
        System.out.println(meters + " meters and " + centimeters + " centimeters");
    }
}

class DB {
    private double feet;
    private double inches;

    public DB(double feet, double inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public double getFeet() {
        return feet;
    }

    public double getInches() {
        return inches;
    }

    public DB add(DB db) {
        DB result = new DB(this.feet + db.feet, this.inches + db.inches);
        return result;
    }

    public DB add(DM dm) {
        DB result = new DB((dm.getMeters() / 0.3048), (dm.getCentimeters() / 2.54));
        return result;
    }

    public void display() {
        System.out.println(feet + " feet and " + inches + " inches");
    }
}

public class DM_and_DB {
    public static void main(String[] args) {
    	// Created two DM objects
        DM dm1 = new DM(10, 20);
        DM dm2 = new DM(12.5, 9.23);

        // Create two DB objects
        DB db1 = new DB(5.1, 6.4);
        DB db2 = new DB(6.9, 5.3);

        // Add the two objects
        DM result1 = dm1.add(dm2);
        
        DM result2 = dm1.add(db1);
        
        DB result3 = db1.add(db2);
        
        DB result4 = db1.add(dm1);

        // Display the results
        result1.display();
        System.out.println();
        
        result2.display();
        System.out.println();
        
        result3.display();
        System.out.println();
        
        result4.display();
    }
}

/*
 OUTPUT:
 --------
22.5 meters and 29.23 centimeters

11.55448 meters and 36.256 centimeters

12.0 feet and 11.7 inches

32.808398950131235 feet and 7.874015748031496 inches
 */

