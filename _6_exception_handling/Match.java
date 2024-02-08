/*
 2. Define an exception called “NoMatchFoundException” that is thrown when a string is
not equal to “University”. Write a program that uses this exception.
 */

package _6_exception_handling;

import java.util.Scanner;

class NoMatchFoundException extends Exception{
    NoMatchFoundException(String s){
        super(s);
    }
}
public class Match {

    public static void main(String[] args) throws NoMatchFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        sc.close();
        if(s.equals("University"))
            System.out.println(s);
        else
            throw new NoMatchFoundException("Miss Match");

    }

}
