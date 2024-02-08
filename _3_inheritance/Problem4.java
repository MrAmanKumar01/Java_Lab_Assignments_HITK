package _3_inheritance;
/*
Problem 4) An educational institution wishes to maintain a database of its employees. The database is
divided into a number of classes whose hierarchical relationships are shown below. Write all
the classes and define the methods to create the database and retrieve individual information
as and when needed.
 Write a driver program to test the classes.
Staff (code, name)
Teacher (subject, publication) is a Staff
Officer (grade) is a Staff
Typist (speed) is a Staff
RegularTypist (remuneration) is a Typist
CasualTypist (daily wages) is a Typist.
*/
/*
       Staff(Superclass)
           /  |  \
      Teacher | Officer
              |
           Typist
            /    \
     Regular     Casual

*/

class Staff {
    private int code;
    private String name;

    public Staff(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void displayStaffInfo() {
        System.out.println("Staff Code: " + code);
        System.out.println("Staff Name: " + name);
    }
}

class Teacher extends Staff {
    private String subject;
    private String publication;

    public Teacher(int code, String name, String subject, String publication) {
        super(code, name);
        this.subject = subject;
        this.publication = publication;
    }

    public String getSubject() {
        return subject;
    }

    public String getPublication() {
        return publication;
    }

    public void displayTeacherInfo() {
        super.displayStaffInfo();
        System.out.println("Subject: " + subject);
        System.out.println("Publication: " + publication);
    }
}

class Officer extends Staff {
    private int grade;

    public Officer(int code, String name, int grade) {
        super(code, name);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void displayOfficerInfo() {
        super.displayStaffInfo();
        System.out.println("Grade: " + grade);
    }
}

class Typist extends Staff {
    private int speed;

    public Typist(int code, String name, int speed) {
        super(code, name);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void displayTypistInfo() {
        super.displayStaffInfo();
        System.out.println("Typing Speed: " + speed);
    }
}

class RegularTypist extends Typist {
    private double remuneration;

    public RegularTypist(int code, String name, int speed, double remuneration) {
        super(code, name, speed);
        this.remuneration = remuneration;
    }

    public double getRemuneration() {
        return remuneration;
    }

    public void displayRegularTypistInfo() {
        super.displayTypistInfo();
        System.out.println("Remuneration: " + remuneration);
    }
}

class CasualTypist extends Typist {
    private double dailyWages;

    public CasualTypist(int code, String name, int speed, double dailyWages) {
        super(code, name, speed);
        this.dailyWages = dailyWages;
    }

    public double getDailyWages() {
        return dailyWages;
    }

    public void displayCasualTypistInfo() {
        super.displayTypistInfo();
        System.out.println("Daily Wages: " + dailyWages);
    }
}

public class Problem4 {
    public static void main(String[] args) {
        // Create and display information for a Teacher
        Teacher teacher = new Teacher(101, "John Smith", "Mathematics", "Advanced Calculus");
        teacher.displayTeacherInfo();

        // Create and display information for an Officer
        Officer officer = new Officer(202, "Jane Doe", 3);
        officer.displayOfficerInfo();

        // Create and display information for a RegularTypist
        RegularTypist regularTypist = new RegularTypist(303, "Peter Jones", 60, 25000.00);
        regularTypist.displayRegularTypistInfo();

        // Create and display information for a CasualTypist
        CasualTypist casualTypist = new CasualTypist(404, "Mary Brown", 40, 500.00);
        casualTypist.displayCasualTypistInfo();
    }
}

/*
OUTPUT:
---------
Staff Code: 101
Staff Name: John Smith
Subject: Mathematics
Publication: Advanced Calculus
Staff Code: 202
Staff Name: Jane Doe
Grade: 3
Staff Code: 303
Staff Name: Peter Jones
Typing Speed: 60
Remuneration: 25000.0
Staff Code: 404
Staff Name: Mary Brown
Typing Speed: 40
Daily Wages: 500.0

*/