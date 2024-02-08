package _2_classes_and_objects;
/* Problem 2.4)
Create a class with a private field and a private method. Create an inner class with a method
that modifies the outer class field and calls the outer class method. In a second outer class
method, create an object of the inner class and call it’s method (means you need to create a Driver(Main) class), then show the effect on the
outer class object.
*/
class OuterClass {
    private int field;
    
    public OuterClass() {
        this.field = 0;
    }

    private void privateMethod() {
       // This is a private method in the outer class
    }
    
    public class InnerClass {
        public void modifyField() {
            field += 1;
        }

        public void callOuterMethod() {
            privateMethod();
        }
    }

    public void showEffect() {
        System.out.println("The modified value of the field is: " + field);
    }
}

public class Problem9 {
    public static void main(String[] args) {
    	// Create an object of the outer class
        OuterClass outerClass = new OuterClass();

        // Create an object of the inner class
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        // Call the inner class method to modify the outer class field
        innerClass.modifyField();

        // Call the outer class method to show the effect of the modification
        outerClass.showEffect();
    }
}

/*
 * OUTPUT:
 * -------
 * The modified value of the field is: 1
 */

