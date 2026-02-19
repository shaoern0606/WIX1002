package viva2;

import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Mode (C / D) : ");
        char mode = input.next().charAt(0);
        input.nextLine(); // consume leftover newline
        
        System.out.print("Text : ");
        String text = input.nextLine();
        
        switch (mode) {
            case 'C' -> System.out.println("Result :" + compress(text));   
            case 'D' -> System.out.println("Result :" + decompress(text));
            default -> System.out.println("Invalid Mode");
        }
    }
    
    public static String compress(String s){
        if (s.isEmpty()) {
            return "";
        }
        
        String result = "";
        
        // Convert string to char array for easier processing
        char[] list = s.toCharArray();
        
        // Check if string contains any digits, which are invalid for compression
        for(char c : list){
            if (Character.isDigit(c)){
                return "Invalid Text";  // Return immediately if digits found
            }
        }
        
        // Initialize counter and current character
        int count = 1;
        char current = list[0];
        
        // Loop through characters starting from second character
        for(int i = 1; i < list.length; i++){
            if(list[i] == current){
                count++;  // Increment count if same as current
            } else {
                // Append count and character to result
                result += count;
                result += current;
                
                // Reset current character and counter
                current = list[i];
                count = 1;
            }
        }
        // Append the last sequence
        result += count;
        result += current;
        
        return result;
    }
    
    public static String decompress(String s){
        if (s.isEmpty()) {
            return "";
        }
        
        String result = "";
        char[] list = s.toCharArray();
        
        // Validation: first char must be digit, last char cannot be digit
        if(!Character.isDigit(list[0]) || Character.isDigit(list[list.length - 1])){
            return "Invalid Encoding";
        }
        
        int count = 0;
        boolean prevDigit = false; // Tracks if previous char was a digit
        
        for(int i = 0; i < list.length; i++){
            if(Character.isDigit(list[i])){
                if(prevDigit){  // Two consecutive digits not allowed
                    return "Invalid Encoding";
                }
                count = list[i] - '0'; // Convert char digit to int
                prevDigit = true;       // Mark that we just saw a digit
            } else {
                if(!prevDigit){  // A non-digit without preceding digit is invalid
                    return "Invalid Encoding";
                }
                
                // Append character 'count' times
                for(int j = 0; j < count; j++){
                    result += list[i];
                }
                prevDigit = false; // Reset for next sequence
            }
        }
        return result;
        
//        String decompressed = "";
//        for (int i = 0; i < s.length(); i+=2) {
//            if (!Character.isDigit(s.charAt(i)) || i == s.length() - 1 || Character.isDigit(s.charAt(i+1)))
//                return "Invalid encoding.";
//            for (int j = 0; j < s.charAt(i) - '0'; j++)
//                decompressed += s.charAt(i+1);
//        }
//        return decompressed;
    }
}