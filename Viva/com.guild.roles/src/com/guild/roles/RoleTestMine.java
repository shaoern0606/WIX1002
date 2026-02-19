package com.guild.roles;

public class RoleTestMine {
    public static void main(String[] args) {
        Role role1 = new Role();
        Role role2 = new Role("Lim", 10, "Human", 20.0);
        Role role3 = new Role("Dorin", null, "Orc", 150.0);
        
        role1.setName("Alaric");
        role1.setAge(120);
        role1.setRace("Elf");
        role1.setMana(250.0);

        role1.performAction();
        role2.performAction();
        role3.performAction();
        
        System.out.println("\nRole 1:");
        System.out.println("Name: " + role1.getName());
        System.out.println("Age: " + role1.getAge());
        System.out.println("Race: " + role1.getRace());
        System.out.println("Mana: " + role1.getMana());
        
        System.out.println("\nRole 2:");
        System.out.println("Name: " + role2.getName());
        System.out.println("Age: " + role2.getAge());
        System.out.println("Race: " + role2.getRace());
        System.out.println("Mana: " + role2.getMana());
        
        System.out.println("\nRole 3:");
        System.out.println("Name: " + role3.getName());
        System.out.println("Age: " + role3.getAge());
        System.out.println("Race: " + role3.getRace());
        System.out.println("Mana: " + role3.getMana());
    }
}
