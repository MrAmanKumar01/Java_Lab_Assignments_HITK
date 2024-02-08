package _2_classes_and_objects;
/* Problem 2.3)
Write a program that defines a class with one static variable called cnt. Create two or more
objects of the class. The class also contains a method that increments the cnt variable
whenever a new instance of the class is created. Write a driver class to test the above class.
*/

class Counter {
    private static int count = 0;

    public Counter() {
        incrementCount();
    }

    public static int getCnt() {
        return count;
    }

    private static void incrementCount() {
        count++;
    }
}

public class ObjectCounter {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();
        Counter counter5 = new Counter();

        System.out.println("The number of counter objects created is: " + Counter.getCnt());
    }
}

/*
OUTPUT:
-------
The number of counter objects created is: 5
 */
