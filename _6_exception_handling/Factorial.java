
/*
 1. Write a program called Factorial.java that computes factorials and catches the result in an
array of type long for reuse. The long type of variable has its own range. For example 20!
Is as high as the range of long type. So check the argument passes and “throw an
exception”, if it is too big or too small. If x is less than 0 throw an IllegalArgument
Exception with a message “Value of x must be positive”.If x is above the length of the
array throw an IllegalArgumentException with a message “Result will overflow”.
Here x is the value for which we want to find the factorial.
 */


package _6_exception_handling;
import java.util.Scanner;

class IllegalArgumentException extends Exception{
    IllegalArgumentException(String s){
        super(s);
    }
    IllegalArgumentException(Exception e){
        super("Result will overflow");
    }
}
public class Factorial {
    static int fact(int n) {
        if(n==0) return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) throws IllegalArgumentException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range : ");
        long arr [] = new long[sc.nextInt()];
        int i =0;
        while(true) {
            try {
                System.out.println("Enter the number : ");
                int n = sc.nextInt();
                if(i==arr.length)
                    throw new IllegalArgumentException("array Index outof bound");
                long x;
                if(n<0)
                    throw new IllegalArgumentException("Value of x must be positive");
                else if(n>=20)
                    throw new IllegalArgumentException("Result will overflow exceeds 20");
                else
                    arr[i] = fact(n);
                System.out.println("Factorial of "+n+" is : "+arr[i]);
                i++;

            }catch(IllegalArgumentException e) {
                System.out.println("Exception "+ e);
                break;
            }


        }

    }
}