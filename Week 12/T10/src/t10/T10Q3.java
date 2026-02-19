package t10;

import java.util.Arrays;

class Person implements Comparable<Person> {
    private String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void display() {
        System.out.println("Name: " + name);
    }
    
    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }
}

public class T10Q3 {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Person("Elvy");
        people[1] = new Person("Alice");
        people[2] = new Person("Charlie");
        people[3] = new Person("Bob");
        people[4] = new Person("Daniel");

        System.out.println("Before sorting: ");
        for (Person p : people) {
            p.display();
        }
        
        Arrays.sort(people); 
        
        System.out.println("\nAfter sorting:");
        for (Person p : people) {
            p.display();
        }
    }
}
