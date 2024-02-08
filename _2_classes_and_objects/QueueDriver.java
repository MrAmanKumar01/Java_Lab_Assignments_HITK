package _2_classes_and_objects;
/* Problem 1.2)
Create a class Queue to implement queue data structure with constructors. Define suitable
methods for insertion & deletion of elements to & from the queue. Write a program for this,
clearly specifying the overflow & underflow conditions.
*/

class Queue {
    private int[] elements;
    private int front;
    private int rear;
    private int capacity;

    // Constructor with a specified capacity
    public Queue(int capacity) {
        this.elements = new int[capacity];
        this.front = 0;
        this.rear = 0;
        this.capacity = capacity;
    }

    // Constructor with a default capacity
    public Queue() {
        this(5);
    }
    
    // Inserts an element at the rear of the queue AND
    //OVERFLOW condition is also specified for which it prints "Queue is full"
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        elements[rear] = element;
        rear++;
    }
    
    // Removes an element from the front of the queue
    ////UNDERFLOW condition is also specified for which it prints "Queue is empty"
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int element = elements[front];
        front++;

        return element;
    }

    // Checks if the queue is full
    public boolean isFull() {
        return rear == capacity;
    }

    // Checks if the queue is empty
    public boolean isEmpty() {
        return rear == front;
    }
    
    // Returns the size of the queue
    public int size() {
        return rear - front;
    }

    // Prints the elements of the queue
    public void print() {
        for (int i = front; i < rear; i++) {
            System.out.print(elements[i] + " ");
        }

        System.out.println();
    }
}

public class QueueDriver {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        // Enqueue elements
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        // Print the elements of the queue
        queue.print();

        // Dequeue an element
        int element = queue.dequeue();

        // Print the element
        System.out.println("Dequeued element: " + element);

        // Print the elements of the queue
        queue.print();

        // Try to enqueue an element to a full queue
        queue.enqueue(5);

        // Try to dequeue an element from an empty queue
        element = queue.dequeue();
    }
}


/*
OUTPUT:
--------
1 2 3 4 5 
Dequeued element: 1
2 3 4 5 
Queue is full
*/