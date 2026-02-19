package l7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person>{
    private String name;
    private int age;
    private char gender; 
    
    public Person (String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    @Override
    public int compareTo(Person another) {
        return this.name.compareTo(another.name);
    }
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public char getGender() {
        return this.gender;
    }
}    
    
public class L7Q5 {
    public static void main(String[] args) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Lab07/person.dat"));
            int numRecord = in.readInt();
            ArrayList<Person> personList = new ArrayList<>();
            
            for (int i = 0; i < numRecord; i++) {
                personList.add(new Person(in.readUTF(), in.readInt(), in.readChar()));
            }
            
            in.close();
            
            System.out.println("Before Sort: ");
            for (Person p : personList) {
                System.out.printf("%-12s%5d%3c%n", p.getName(), p.getAge(), p.getGender());
            }
            
            Collections.sort(personList);
            
            System.out.println("\nAfter Sort: ");
            for (Person p : personList) {
                System.out.printf("%-12s%5d%3c%n", p.getName(), p.getAge(), p.getGender());
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        } catch (IOException e) {
            System.out.println("Problem with file input");
        }
    }
}
