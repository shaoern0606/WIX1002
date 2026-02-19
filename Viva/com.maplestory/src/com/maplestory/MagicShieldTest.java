package com.maplestory;

public class MagicShieldTest {
    public static void main(String[] args) {

        // Create objects using different constructors
        MagicShield shield1 = new MagicShield();
        MagicShield shield2 = new MagicShield(2.5, 7.0, "Fire");
        MagicShield shield3 = new MagicShield(3, 6, "Ice");
        
        // Test setters with valid values
        try {
            shield2.setRadius(3.5);
            shield2.setThickness(0);
            shield2.setElementType("Light");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Test setters with invalid values
        try { 
            shield3.setRadius(-1.0); 
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        try { 
            shield3.setThickness(-8); 
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        //shield2.setRadius(-1.0); 

        // Calculate and print defense power and mana cost
        System.out.println("\nShield 1: ");
        System.out.println(shield1);
        System.out.println("\nShield 2: ");
        System.out.println(shield2);
        System.out.println("\nShield 3: ");
        System.out.println(shield3);

        // Use static methods to calculate shield properties for arbitary parameter combinations
        double defensePower = MagicShield.calculateDefensePower(4, 5, "Dark");
        double manaCost = MagicShield.calculateManaCost(4, 5);
        
        System.out.println("\nUsing static methods: ");
        System.out.println("Defense Power: " + defensePower);
        System.out.println("Mana Cost: " + manaCost);

        // Output total number of shields created
        System.out.println("\nTotal Shields Created: " + MagicShield.getShieldCount());

        // Test edge cases (null, 0, negative values)
        MagicShield shield4 = new MagicShield(0, 0, null);
        System.out.println("\nShield 4: ");
        System.out.println(shield4);
        
        MagicShield shield5 = new MagicShield(0, -8, null);
        System.out.println("\nShield 5: ");
        System.out.println(shield5);
        
    }
}


