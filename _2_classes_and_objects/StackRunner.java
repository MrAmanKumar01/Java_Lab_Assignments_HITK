package _2_classes_and_objects;
/* Problem 1.1)
Create a class Stack that declares a stack and the methods to perform push ( ), pop ( ) and
display( ) operations on the stack. Create two stacks and write a menu-driven program to
perform operations on the two stacks. Whenever the number of elements in the two stacks
becomes equal, a message should automatically be generated displaying the number of elements
in each stack.
*/

import java.util.Scanner;
class Stack {

    private int[] elements;
    private int top;

    public Stack(int size) {
        elements = new int[size];
        top = -1;
    }

    public void push(int element) {
        if (top == elements.length - 1) {
            System.out.println("Stack is full.");
            return;
        }

        elements[++top] = element;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        }

        return elements[top--];
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(elements[i]);
        }
    }

    public int size() {
        return top + 1;
    }
}

public class StackRunner {

    public static void main(String[] args) {
        Stack stack1 = new Stack(10);
        Stack stack2 = new Stack(10);

        int choice;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Push element to stack 1");
            System.out.println("2. Pop element from stack 1");
            System.out.println("3. Display stack 1");
            System.out.println("4. Push element to stack 2");
            System.out.println("5. Pop element from stack 2");
            System.out.println("6. Display stack 2");
            System.out.println("7. Check if stacks are equal");
            System.out.println("8. Exit");

            System.out.println("\nEnter your choice: ");
            /*Used a single Scanner object to read input from the user, instead of 
             creating a new Scanner object each time the user makes a choice*/

            //This static method of the Integer class takes a string as input and attempts to parse it into an integer.
            choice = Integer.parseInt(new Scanner(System.in).nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Enter the element to push into Stack 1: ");
                    int element = Integer.parseInt(new Scanner(System.in).nextLine());
                    stack1.push(element);
                    break;
                case 2:
                    stack1.pop();
                    break;
                case 3:
                    stack1.display();
                    break;
                case 4:
                    System.out.println("Enter the element to push into Stack 2: ");
                    element = Integer.parseInt(new Scanner(System.in).nextLine());
                    stack2.push(element);
                    break;
                case 5:
                    stack2.pop();
                    break;
                case 6:
                    stack2.display();
                    break;
                case 7:
                    if (stack1.size() == stack2.size()) {
                        System.out.println("The two stacks are equal.");
                        System.out.println("Number of elements in each stack: " + stack1.size());
                    } else {
                        System.out.println("The two stacks are not equal.");
                    }
                    break;
                case 8:
                	System.out.println("You have ended the Stack Opeartions.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 8);
    }
}

/*
 OUTPUT:
 --------
 
Menu
1. Push element to stack 1
2. Pop element from stack 1
3. Display stack 1
4. Push element to stack 2
5. Pop element from stack 2
6. Display stack 2
7. Check if stacks are equal
8. Exit

Enter your choice: 
1
Enter the element to push into Stack 1: 
1

Menu
1. Push element to stack 1
2. Pop element from stack 1
3. Display stack 1
4. Push element to stack 2
5. Pop element from stack 2
6. Display stack 2
7. Check if stacks are equal
8. Exit

Enter your choice: 
1
Enter the element to push into Stack 1: 
2

Menu
1. Push element to stack 1
2. Pop element from stack 1
3. Display stack 1
4. Push element to stack 2
5. Pop element from stack 2
6. Display stack 2
7. Check if stacks are equal
8. Exit

Enter your choice: 
1
Enter the element to push into Stack 1: 
3

Menu
1. Push element to stack 1
2. Pop element from stack 1
3. Display stack 1
4. Push element to stack 2
5. Pop element from stack 2
6. Display stack 2
7. Check if stacks are equal
8. Exit

Enter your choice: 
3
3
2
1

Menu
1. Push element to stack 1
2. Pop element from stack 1
3. Display stack 1
4. Push element to stack 2
5. Pop element from stack 2
6. Display stack 2
7. Check if stacks are equal
8. Exit

Enter your choice: 
6

Menu
1. Push element to stack 1
2. Pop element from stack 1
3. Display stack 1
4. Push element to stack 2
5. Pop element from stack 2
6. Display stack 2
7. Check if stacks are equal
8. Exit

Enter your choice: 
4
Enter the element to push into Stack 2: 
4

Menu
1. Push element to stack 1
2. Pop element from stack 1
3. Display stack 1
4. Push element to stack 2
5. Pop element from stack 2
6. Display stack 2
7. Check if stacks are equal
8. Exit

Enter your choice: 
4
Enter the element to push into Stack 2: 
5

Menu
1. Push element to stack 1
2. Pop element from stack 1
3. Display stack 1
4. Push element to stack 2
5. Pop element from stack 2
6. Display stack 2
7. Check if stacks are equal
8. Exit

Enter your choice: 
4
Enter the element to push into Stack 2: 
6

Menu
1. Push element to stack 1
2. Pop element from stack 1
3. Display stack 1
4. Push element to stack 2
5. Pop element from stack 2
6. Display stack 2
7. Check if stacks are equal
8. Exit

Enter your choice: 
6
6
5
4

Menu
1. Push element to stack 1
2. Pop element from stack 1
3. Display stack 1
4. Push element to stack 2
5. Pop element from stack 2
6. Display stack 2
7. Check if stacks are equal
8. Exit

Enter your choice: 
7
The two stacks are equal.
Number of elements in each stack: 3

Menu
1. Push element to stack 1
2. Pop element from stack 1
3. Display stack 1
4. Push element to stack 2
5. Pop element from stack 2
6. Display stack 2
7. Check if stacks are equal
8. Exit

Enter your choice: 
8
You have ended the Stack Opeartions. 
 */
