/*
Problem 4) Create an interface Department containing attributes deptName and deptHead. It also
has abstract methods for getting data and printing the attributes. Create a class hostel
containing hostelName, hostelLocation and numberofRooms. The class contains methods
for getting and printing the attributes. Then write Student class extending the Hostel
class and implementing the Department interface. This class contains attributes
studentName, regdNo, electiveSubject and avgMarks. Write suitable getData and
printData methods for this class. Also implement the abstract methods of the Department
interface. Write a driver class to test the Student class. The program should be menu
driven containing the options:
i) Admit new student
ii) Migrate a student
iii) Display details of a student
For the third option a search is to be made on the basis of the entered registration number.
 */

package _5_interface_and_package.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Department{
	String DeptName = "MCA";
	String deptHead = "SVB";
	void display();
}

class Hostel{
	String hostelName;
	String hostelLocation;
	int numberofRooms;
	Hostel(String hostelName, String hostelLocation, int numberOfRooms){
		this.hostelName = hostelName;
		this.hostelLocation = hostelLocation;
		this.numberofRooms = numberOfRooms;
	}
	void print() {
		System.out.println(""+ hostelName + " "+ hostelLocation +" " + numberofRooms);
	}
}

class Student extends Hostel implements Department{
	String studentName;
	int regdNo;
	String electiveSubject;
	int avgMarks;
	public void display() {
		System.out.println("name "+studentName);
		System.out.println("Registration number "+regdNo);
		System.out.println("Elective subject "+electiveSubject);
		System.out.println("Average marks "+avgMarks);
		
	}
	
	Student(String studentName,int regdNo,String electiveSubject,int avgMarks,String hostelName, String hostelLocation, int numberOfRooms) {
		super(hostelName,hostelLocation,numberOfRooms);
		this.studentName = studentName;
		this.regdNo = regdNo;
		this.electiveSubject = electiveSubject;
		this.avgMarks = avgMarks;
	}
	
	static Student find(int no, List<Student> l) {
		for(int i =0; i<l.size();i++) {
			if(l.get(i).regdNo == no) return l.get(i);
		}
		return null;
	}
	
	
}

public class Problem4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List <Student> students= new ArrayList<Student>();
		while(true) {
			System.out.println("1. Admit");
			System.out.println("2. Migrate");
			System.out.println("3. Display");
			System.out.println("4. exit");
			
			System.out.println("Enter a option");
			int op = sc.nextInt();
			switch(op) {
				case 1:
					System.out.print("name: ");
					String studentName = sc.next();
					System.out.print("reg no: ");
					int regdNo=sc.nextInt();
					System.out.print("elective: ");
					String electiveSubject = sc.next();
					System.out.print("average: ");
					int avgMarks = sc.nextInt();
					System.out.print("hostel: ");
					String hostelName = sc.next();
					System.out.print("location: ");
					String hostelLocation = sc.next();
					System.out.print("rooms: ");
					int numberOfRooms=sc.nextInt();
					students.add(new Student(studentName, regdNo, electiveSubject, avgMarks,hostelName,hostelLocation,numberOfRooms));
					break;
				case 2:
					System.out.println("Migrated ");
					break;
				case 3:
					System.out.print("Enter reg no. :  ");
					Student s = Student.find(sc.nextInt(),students);
					if(s!=null)
						s.display();
					else
						System.out.println("Not found");
					break;
				case 4:
					break;
				default:
					System.out.println("Invalid option");
			}
		}
	}

}


/*
OUTPUT:
--------
1. Admit
2. Migrate
3. Display
4. exit
Enter a option
1
name: AMAN
reg no: 1234
elective: Statistics
average: 93
hostel: Satyam
location: Kolkata
rooms: 100
1. Admit
2. Migrate
3. Display
4. exit
Enter a option
2
Migrated 
1. Admit
2. Migrate
3. Display
4. exit
Enter a option
3
Enter reg no. :  1234
name AMAN
Registration number 1234
Elective subject Statistics
Average marks 93
1. Admit
2. Migrate
3. Display
4. exit
Enter a option
4
1. Admit
2. Migrate
3. Display
4. exit
Enter a option
 */
