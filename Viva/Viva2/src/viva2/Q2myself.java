package viva2;

import java.util.Scanner;

public class Q2myself {
    public static boolean isBalanced(String s) {
        int open = 0;
        int close = 0;
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (character == '(')
                open++;
            if (character == ')')
                close++;
        }
        return open == close;
    }
    
    public static int countBracket(String s ,char type) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (character == type)
                count++;
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String expression = sc.nextLine();

        if (isBalanced(expression))
            System.out.println("Balanced");
        else 
            System.out.println("Not balanced");
        
        System.out.println("(:" + countBracket(expression, '('));
        System.out.println("):" + countBracket(expression, ')'));
    }
}
