package com.guild.roles;

public class RoleTest {

    public static void main(String[] args) {
        // Requirement 1: Create Role objects using both constructors
        
        // Object 1: Using No-Argument Constructor
        Role role1 = new Role();
        
        // Requirement 2: Use setter methods to modify attributes for Object 1
        role1.setName("Alvin");
        role1.setAge(120);
        role1.setRace("Elf");
        role1.setMana(300.5);
        
        // Object 2: Using Parameterized Constructor
        Role role2 = new Role("Tharok", 45, "Orc", 50.0);
        
        // Requirement 3: Call performAction() for each object
        role1.performAction();
        role2.performAction();
        
        System.out.println("\n--- Role Details ---");
        
        // Requirement 4: Print out all role details
        printDetails(role1);
        printDetails(role2);
    }
    
    // Helper method to print details cleanly
    public static void printDetails(Role r) {
        System.out.println("Name: " + r.getName());
        System.out.println("Age: " + r.getAge());
        System.out.println("Race: " + r.getRace());
        System.out.println("Mana: " + r.getMana());
        System.out.println("-----------------");
    }
    
}

