package com.magical.people;

public class PersonTestMine {
    public static void main(String[] args) {
        Person student1 = new Person();
        Person student2 = new Person();

        Person student3 = new Person("Alice", 20);
        Person student4 = new Person("Bob", 22);
        Person student5 = new Person("Alice", 20);

        System.out.println("Student 1: ");
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println();

        student2.setAge(25);
        System.out.println(student2.getName() + " new age: " + student2.getAge());

        // Test setAge with invalid age
        try {
            student4.setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Compare students
        System.out.println("student3 vs student5 same? " + student3.compareTo(student5)); // true
        System.out.println("student1 vs student4 same? " + student1.compareTo(student4)); // false

        // Get total student count
        System.out.println("Total students in academy: " + Person.getPersonCount());
    }
}
