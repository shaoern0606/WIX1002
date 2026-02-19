/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week10;

    // instance varibale
    // constructor
    // methods

public class person {
    private String name;
    private int age;
    private char gender;
    
    public person() {
        this.name = "Saw";
        this.age = 10;
        this.gender ='F';
    }
    
    public person(String n, int a, char g) {
        this.name = n;
        this.age = a;
        this.gender = g;
    }
    
    public person(person p) {
        if (p==null)
            System.exit(0);
        
        name = p.getName();
        age = p.getAge();
        gender = p.getGender();
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public char getGender() {
        return gender;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public void setAge(int a) {
        age = a;
    }
    
    public void setGender(char g) {
        gender = g;
    }
    
    public String toString() {
        return "Name is " + this.name + ". Age is "+ this.age;
    }
}