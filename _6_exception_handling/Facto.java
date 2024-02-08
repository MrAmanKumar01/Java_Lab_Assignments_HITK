/*
 6. Write a program that takes a value at the command line for which factorial is to be
computed. The program must convert the string to its integer equivalent. There are three
possible user input errors that can prevent the program from executing normally.
The first error is when the user provides no argument while executing the program and an
ArrayIndexOutOfBoundsException is raised. You must write a catch block for this.
The second error is NumberFormalException that is raised in case the user provides a
non-integer (float double) value at the command line.The third error is IllegalArgument
Exception. This needs to be thrown manually if the value at the command line is 0.
 */


package _6_exception_handling;

public class Facto {
    static int fact(int n) {
        if(n==0) return 1;
        return n*fact(n-1);
    }

    public static void main(String[] args) throws IllegalArgumentException {
        try {
            if(args.length==0)
                throw new ArrayIndexOutOfBoundsException();
            for(String s : args) {
                try {
                    int n = Integer.parseInt(s);
                    if(n<0 || n>=20)
                        throw new IllegalArgumentException("Argument cannot be 0 or more than 19");
                    else
                        System.out.println(fact(n));
                }catch (NumberFormatException e){
                    System.out.println("Number is invalid");
                }catch(ArrayIndexOutOfBoundsException e) {
                    System.out.println("Enter argument");
                }
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("" + e);
        }


    }

}