package _2_classes_and_objects;
/* Problem 2.1)
Create a class called Time that has separate data member for hours, minutes and seconds.
Define member functions to perform the following tasks:
(a) to display the time in the format hh: mm: ss.
(b) to add times passed as arguments.
(c) to check which among two times passed as arguments is greater.
Write a program to test the class and its functions. Use constructor to initialize the instance
variables of the class Time.
*/

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void display() {
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
    
    /*addTime() method takes a Time object as its argument and 
	adds the time represented by that object to the current time */
    public void addTime(Time time) {
        this.seconds += time.seconds;
        this.minutes += time.minutes;
        this.hours += time.hours;

        if (this.seconds >= 60) {
            this.minutes++;
            this.seconds -= 60;
        }

        if (this.minutes >= 60) {
            this.hours++;
            this.minutes -= 60;
        }
    }

    public boolean isGreaterThan(Time time) {
        if (this.hours > time.hours) {
            return true;
        } else if (this.hours == time.hours && this.minutes > time.minutes) {
            return true;
        } else if (this.hours == time.hours && this.minutes == time.minutes && this.seconds > time.seconds) {
            return true;
        } else {
            return false;
        }
    }
}

public class TimeKeeping {
    public static void main(String[] args) {
    	// Created two Time objects
        Time time1 = new Time(13, 30, 20);
        Time time2 = new Time(10, 15, 30);

        // Display the times
        time1.display();
        time2.display();

        // Check which time is greater
        boolean isTime1Greater = time1.isGreaterThan(time2);
        
        if (isTime1Greater) {
        	System.out.println("Time 1 is greater than Time 2");
        } else {
        	System.out.println("Time 1 is not greater than Time 2");
        }
        
        // Add the times
        time1.addTime(time2);
        System.out.print("Time1" + " + " + "Time2: ");
        time1.display();

    }
}

/*
OUTPUT:
--------
13:30:20
10:15:30
Time 1 is greater than Time 2
Time1 + Time2: 23:45:50
*/
