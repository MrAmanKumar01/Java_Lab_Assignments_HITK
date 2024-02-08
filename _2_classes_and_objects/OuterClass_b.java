package _2_classes_and_objects;
/* Problem 2.5)
(a)Create a class containing an inner class that itself contains an inner class. (b)Repeat this using
static inner class. What are the names of the .class files produced by the compiler?
*/

//*** ANSWER: ****

//(a) Non-Static Inner classes

//public class OuterClass_a {
//    private class InnerClass1 {
//        private class InnerClass2 {
//            // ...
//        }
//
//        // ...
//    }
//
//    // ...
//}

/*
The compiler will generate the following .class files for this code:

OuterClass_a.class
OuterClass_a$InnerClass1.class
OuterClass_a$InnerClass1$InnerClass2.class
 */

//(b) Static Inner classes

public class OuterClass_b {
    private static class InnerClass1 {
        private static class InnerClass2 {
            // ...
        }

        // ...
    }

    // ...
}

/*
The compiler will generate the following .class files for this code:

OuterClass_b.class
OuterClass_b$InnerClass1.class
OuterClass_b$InnerClass1$InnerClass2.class
*/

/* 
*** CRUX from above ***
------------------------------------------------------------------------------------
Static inner classes are compiled into their own .class files 
and can be accessed without creating an instance of the outer class.
Whereas,
Non-static inner classes are compiled into the same .class file as the outer class
and can only be accessed through an instance of the outer class.
*/
