package t9;

public class T9Q1 {
    public static boolean compare(Object s, Object t) {
        return s.getClass() == t.getClass();
    }
    
    public static boolean isClass(Object s) {
        return s instanceof Person;
    }
    
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Teacher teacher = new Teacher();

        System.out.println("Student 1 and Teacher same class? " + compare(student1, teacher));
        System.out.println("Student 1 and Student 2 same class? " + compare(student1, student2));
        System.out.println("Student 1 is descendant of Person? " + isClass(student1));
        System.out.println("Teacher is descendant of Person? " + isClass(teacher));
    }
    
}

class Person{}
class Student extends Person{}
class Teacher extends Person{}
