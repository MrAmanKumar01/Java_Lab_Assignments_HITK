/*ProblemNo_2.2)Admission to a professional course is subject to the following conditions:
(a) marks in Mathematics >= 60 (b) marks in Physics >=50
(c) marks in Chemistry >=40 (d) Total in all 3 subjects >=200
(Or)
Total in Maths & Physics>=150
Given the marks in the 3 subjects of n (user input) students, write a program to process
the applications to list the eligible candidates(i.e., list the student number).*/
package _1_intro_to_java;

import java.util.Scanner;

public class CorrectedQ12 {
    public static void main(String[] args) {
        System.out.print("Enter the number of students who applied: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Create an array to store the marks of the students for 3 subjects
        int[][] marksInSubject = new int[n][3]; //for n students 3 subjects are there for each

        // Prompt the user to enter the marks of the students
        System.out.println("Enter marks of "+n+" students: ");
        for(int i=0; i<n; i++){
            System.out.print("Enter marks of student "+ (i+1)+": ");
            for(int j=0; j<3; j++){
                marksInSubject[i][j] = sc.nextInt();
//                marksInSubject[x][0] --> marks in Mathematics
//                marksInSubject[x][1] --> marks in Physics
//                marksInSubject[x][2] --> marks in Chemistry
//                "x" represents any student(candidate)
            }
        }
        System.out.println(); //printing extra line for aesthetics

        //Listing down the eligible studnets
        for(int i=0; i<n; i++){
                if(marksInSubject[i][0] >= 60 && marksInSubject[i][1] >=50 && marksInSubject[i][2] >= 40 &&
                        ((marksInSubject[i][0] + marksInSubject[i][1] + marksInSubject[i][2]) >= 200) ||
                        ((marksInSubject[i][0] + marksInSubject[i][1]) >=150)){
                System.out.println("Student "+(i+1)+" is eligible");
            }
//                marksInSubject[x][0] --> marks in Mathematics
//                marksInSubject[x][1] --> marks in Physics
//                marksInSubject[x][2] --> marks in Chemistry
//                "x" represents any student(candidate)
        }

    }
}

/*
Output:
---------
Enter the number of students who applied: 3
Enter marks of 3 students:
Enter marks of student 1: 78 55 88
Enter marks of student 2: 63 53 43
Enter marks of student 3: 89 95 41

Student 1 is eligible
Student 3 is eligible
*/
