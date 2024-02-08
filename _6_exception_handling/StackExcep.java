/*
 3. Write a program to create a class called MyStack that includes functions to perform all
operations on a stack as well as raises an exception whenever overflow/underflow error
occurs.
 */


package _6_exception_handling;
class Overflow extends Exception{
    Overflow(String s){
        super(s);
    }
}

class Underflow extends Exception{
    Underflow(String s){
        super(s);
    }
}

class Stack{
    int size;
    int arr[];
    int i;
    Stack(int size) {
        this.size = size;
        arr = new int[size];
        i=0;
    }
    void push(int num) throws Overflow {
        if(i==size)
            throw new Overflow("Stack Overflow");
        arr[i++] = num;
    }
    int pop() throws Underflow {
        if(i==0)
            throw new Underflow("Stack Underflow");
        return arr[--i];
    }
}
public class StackExcep {

    public static void main(String[] args) {
        Stack s = new Stack(4);
        try {
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());

        } catch (Overflow e) {

            e.printStackTrace();
        } catch (Underflow e) {
            e.printStackTrace();
        }

    }

}
