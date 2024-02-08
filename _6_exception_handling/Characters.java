/*
 Write a class that keeps a running total of all characters passed to it (one at a time) and
throws an exception if it is passed a non-alphabetic character.
 */


package _6_exception_handling;

class NotAlphabet extends Exception{
    NotAlphabet(String s){
        super(s);
    }
}
class Count{
    static int total;
    void pass(char ch) throws NotAlphabet {
        if((ch >=65 && ch <=90)||(ch >=97 && ch <=122))
            total++;
        else
            throw new NotAlphabet("The character is not a alphabet");
    }

}
public class Characters {

    public static void main(String[] args) throws  NotAlphabet{
        Count c = new Count();
        c.pass('a');
        c.pass('b');
        c.pass('c');
        System.out.println(Count.total);
        c.pass('@');



    }

}
