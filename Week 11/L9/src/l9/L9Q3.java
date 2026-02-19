package l9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class CourseLecturer {
    private String courseCode;
    private String courseName;
    private int session;
    private int semester;
    private double creditHour;
    private int numStudent;

    public CourseLecturer() {
        this.courseCode = null;
        this.courseName = null;
        this.session = 0;
        this.semester = 0;
        this.creditHour = 0;
        this.numStudent = 0;
    }
    
    public CourseLecturer(String courseCode, String courseName, int session, int semester, int creditHour, int numStudent) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.session = session;
        this.semester = semester;
        this.creditHour = creditHour;
        this.numStudent = numStudent;
    }
    
    public double getCreditHour() {
        double updatedCreditHour = creditHour;
        if (numStudent >= 150) updatedCreditHour *= 3;
        else if (numStudent >= 100) updatedCreditHour *= 2;
        else if (numStudent >= 50) updatedCreditHour *= 1.5;
        return updatedCreditHour;
    }
    
    public void display() {
        System.out.println(courseCode + " - " + courseName);
        System.out.println("Session " + session + " Semester " + semester);
        System.out.printf("Number of Student: %d   CreditHour: %.2f%n%n", numStudent, getCreditHour());
    }
}

class Lecturer extends PersonProfile {
    private ArrayList <CourseLecturer> courses;
    
    public Lecturer() {
        super();
    }
    
    public Lecturer(String name, String gender, String dateOfBirth, String fileName) {
        super(name, gender, dateOfBirth);
        courses = new ArrayList<>();
        readFile(fileName);
    }
            
    public void readFile(String fileName) {
        try {
            Scanner in = new Scanner(new FileInputStream(fileName));
            while (in.hasNextLine()) {
                String courseCode = in.nextLine();
                String courseName = in.nextLine();
                int session = Integer.parseInt(in.nextLine());
                int semester = Integer.parseInt(in.nextLine());
                int creditHour = Integer.parseInt(in.nextLine());
                int numStudent = Integer.parseInt(in.nextLine());
                courses.add(new CourseLecturer(courseCode, courseName, session, semester, creditHour, numStudent));
            }
            
            in.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }
        
    }
    @Override
    public void display() {
        super.display();
        System.out.println();
        for (CourseLecturer c : courses) {
            c.display();
        }
    } 
}
public class L9Q3 {
    public static void main(String[] args) {
        Lecturer lecturer1 = new Lecturer("Lim", "Male", "01-01-1990", "Lab09/lecturer.txt");
        lecturer1.display();
    }
}
