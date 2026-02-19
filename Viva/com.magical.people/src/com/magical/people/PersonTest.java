package com.magical.people;

public class PersonTest {
    public static void main(String[] args) {
        //Create person object using parameterized constructor
        Person p1 = new Person ("Ali", 20);
        Person p2 = new Person ("Lim", 28);
        Person p3 = new Person ("Ali", 20);
        
        //Create person object using no-arg constructor
        Person p4 = new Person () ;
        System.out.println("Age of person 1: "+ p1.getAge ()) ;
        System.out.println("Age of person 2: "+ p2.getAge ()) ;
        System.out.println("Age of person 3: "+ p3.getAge ()) ;
        System.out.println("Age of person 4: "+ p4.getAge ());
        
        //Call setAge () with valid age p4. setAge (20) ;
        System.out.println("\nAfter update age of person 4");
        System.out.println("Age of person 4: "+ p4.getAge ()) ;
        
        //Call setAge() with invalid age tryt
        try {
            p4. setAge(-2);
        } catch(IllegalArgumentException e){
            System.out.println ("\nCaught exception: "+ e.getMessage ()) ;
        }
        
        //Call compareTo ()
        System.out.println ("\nComparison: ");
        System.out.println ("Person1 vs Person2: "+ p1.compareTo(p2)) ;
        System.out.println ("Person1 vs Person3: "+ p1.compareTo(p3)) ;
        System.out.println ("Person1 vs Person4: "+ p3.compareTo(p4)) ;
        System.out.println("\nTotal students: "+ Person.getPersonCount ()) ;
    }
}
