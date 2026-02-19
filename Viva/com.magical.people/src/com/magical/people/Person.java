package com.magical.people;

public class Person {
    private String name;
    private int age;
    
    private static final int DEFAULT_AGE = 18;
    private static int personCount = 0;
    
    public Person() {
        this.name = "Unknown Student";
        this.age =  DEFAULT_AGE;
        personCount++;
    }
    
    public Person(String name, int age) {
        this.name = name;
        this.age =  age;
        personCount++;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
    
    public static int getPersonCount() {
        return personCount;
    }
    
    public boolean compareTo(Person other) {
//        if (other == null) return false;
//        if (name == null || other.name == null) return false;
        return name.equals(other.name) && age == other.age;
    }
    
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) 
//            return true;
//        if (!(obj instanceof Person)) 
//            return false;
//        Person other = (Person) obj;
//        return name.equals(other.name) && age == other.age;
//    }
}
