package viva2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter expression: ");
        String input = sc.nextLine();
        
        // Call the method and print the result
        if (isBalanced(input)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not balanced");
        }
    }
    
    // Method to check if parentheses are balanced
    public static boolean isBalanced(String s) {
        int count = 0;
        // Iterate over the string length
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(') {
                count++;
            } else if (ch == ')') {
                count--;
                
                // If count becomes negative, closing comes before opening
                if (count < 0) {
                    return false;
                }
            }
        }    
        
        // Return true only if count returns to exactly zero
        return count == 0;
    }
}
