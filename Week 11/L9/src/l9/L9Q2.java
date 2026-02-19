package l9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class CourseStudent {
    private String courseCode;
    private String courseName;
    private int session;
    private int semester;
    private double mark;
    
    public CourseStudent() {
        this.courseCode = null;
        this.courseName = null;
        this.session = 0;
        this.semester = 0;
        this.mark = 0;
    }
    
    public CourseStudent(String courseCode, String courseName, int session, int semester, double mark) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.session = session;
        this.semester = semester;
        this.mark = mark;
    }
    
    public String getGrade() {
        if (mark >= 85) return "A";
        else if (mark >= 75) return "A-";
        else if (mark >= 70) return "B+";
        else if (mark >= 65) return "B";
        else if (mark >= 60) return "B-";
        else if (mark >= 55) return "C+";
        else if (mark >= 50) return "C";
        else if (mark >= 45) return "D";
        else if (mark >= 35) return "E";
        else return "F";
    }
    
    public void display() {
        System.out.println(courseCode + " - " + courseName);
        System.out.println("Session " + session + " Semester " + semester);
        System.out.println("Mark: " + mark + "   Grade: " + getGrade());
        System.out.println();
    }
}

class Student extends PersonProfile {
    private ArrayList<CourseStudent> courses;
    
    public Student() {
        super();
    }
    
    public Student(String name, String gender, String dateOfBirth, String fileName) {
        super(name, gender, dateOfBirth);
        courses = new ArrayList<>();
        readFile(fileName);
    }
    
    public void readFile(String fileName){
        try {
            Scanner in = new Scanner(new FileInputStream(fileName));
            while (in.hasNextLine()) {
                String courseCode = in.nextLine();
                String courseName = in.nextLine();
                int session = Integer.parseInt(in.nextLine());
                int semester = Integer.parseInt(in.nextLine());
                double mark = Double.parseDouble(in.nextLine());
                courses.add(new CourseStudent(courseCode, courseName, session, semester, mark));
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
        for (CourseStudent c : courses) {
            c.display();
        }
    } 
}

public class L9Q2 {
    public static void main(String[] args) {
        Student student1 = new Student("Ali", "Male", "01-01-2000", "Lab09/course.txt");
        student1.display();
    }
}