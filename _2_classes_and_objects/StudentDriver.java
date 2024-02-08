package _2_classes_and_objects;
/* Problem 1.4)
The annual examination results of N students are tabulated as follows:
Roll No. Subject 1 Subject 2 Subject 3
------------------------------------------------------
.....
.....
------------------------------------------------------
Write a program to read the data and determine the following:
(a) Total marks obtain by each student
(b) The highest marks in each subject and the roll no of the student who secured it
(c) The student who obtained the highest total marks
*/

import java.util.Scanner;
class Student {
    private int rollNo;
    private int[] marks;
    
    //CONSTRUCTOR
    public Student(int rollNo, int[] marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }
    

    public int getRollNo() {
		return rollNo;
	}


	public int[] getMarks() {
		return marks;
	}

	public int getTotalMarks() {
        int sum = 0;
        //Using for-each loop to iterate over all the marks scored by a student and keep summing it up in sum variable
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    public String toString() {
        return "Student [rollNo=" + rollNo + ", marks=" + marks + "]";
    }
}

//Another class for Exam Results ***
class ExamResults {
    private int[] totalMarks;
    private int[] highestMarksInEachSubject;
    private int rollNoWithHighestTotalMarks;
    private int[] rollNoWithHighestMarksInEachSubject; // ** CHANGED **

    public ExamResults(int n) {
        this.totalMarks = new int[n]; // "n" baar total marks calculate ho ke ess array mei store hoga
        this.highestMarksInEachSubject = new int[3];
        this.rollNoWithHighestTotalMarks = 1;
        this.rollNoWithHighestMarksInEachSubject = new int[3];
    }

    //All major details and calculations for a student
    public void addStudent(Student student) { //examResults.addStudent(new Student(i + 1, marks));
        int rollNo = student.getRollNo();
        int[] marks = student.getMarks();

        // Calculate the total marks obtained by the student
        totalMarks[rollNo - 1] = student.getTotalMarks();

        // Update the highest marks in each subject
        for (int i = 0; i < 3; i++) {
            if (marks[i] > highestMarksInEachSubject[i]) {
                highestMarksInEachSubject[i] = marks[i];
//                rollNoWithHighestTotalMarks = rollNo; //finding each subject's highest and not Total's highest roll no
                rollNoWithHighestMarksInEachSubject[i] = rollNo; //	Now, Correct
            }
        }
        
        //** ATTENTION here !! 
        // Update the student who obtained the highest total marks
        if (student.getTotalMarks() > totalMarks[rollNoWithHighestTotalMarks - 1]) {     //** checking from 0th index
        	rollNoWithHighestTotalMarks = rollNo; 
        }
    }

    //* ALL good **
    public void printTotalMarks() {
        System.out.println("Total marks obtained by each student:");
        for (int i = 0; i < totalMarks.length; i++) {
            System.out.println("Roll No. " + (i + 1) + ": " + totalMarks[i]);
        }
    }

  //** Needs Attention **
    public void printHighestMarksInEachSubject() {
        System.out.println("The highest marks in each subject and the roll no of the student who secured it:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Subject " + (i + 1) + ": " + highestMarksInEachSubject[i] + " (Roll No. " + rollNoWithHighestMarksInEachSubject[i] + ")");
        }
    }

  //** ALL good **
    public void printStudentWithHighestTotalMarks() {
        System.out.println("The student who obtained the highest total marks:");
        System.out.println("Roll No. " + rollNoWithHighestTotalMarks);
    }
}

public class StudentDriver{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int n = scanner.nextInt();

		ExamResults examResults = new ExamResults(n);

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the marks of student " + (i + 1) + ": ");
			int[] marks = new int[3];
			for (int j = 0; j < 3; j++) {
				marks[j] = scanner.nextInt();
			}

			examResults.addStudent(new Student(i + 1, marks));
		}

		examResults.printTotalMarks();
		examResults.printHighestMarksInEachSubject();
		examResults.printStudentWithHighestTotalMarks();
		
		scanner.close();
	}
}

/*
 OUTPUT:
 --------
Enter the number of students: 3
Enter the marks of student 1: 
98
56
45
Enter the marks of student 2: 
95
97
56
Enter the marks of student 3: 
75
59
99
Total marks obtained by each student:
Roll No. 1: 199
Roll No. 2: 248
Roll No. 3: 233
The highest marks in each subject and the roll no of the student who secured it:
Subject 1: 98 (Roll No. 1)
Subject 2: 97 (Roll No. 2)
Subject 3: 99 (Roll No. 3)
The student who obtained the highest total marks:
Roll No. 2
 */