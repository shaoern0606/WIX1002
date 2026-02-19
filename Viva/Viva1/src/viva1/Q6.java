package viva1;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of compressed log: ");
        int T = sc.nextInt();
        
        //Tips 1： Validate number of logs (must be between 1 and 100)
        while (T < 1 || T > 100){
            System.out.println("Number of logs should be between 1 and 100. Please enter again: ");
            T = sc.nextInt();
        }
        
        // Loop for each compressed log input
        for (int i = 0; i < T; i++) {
            System.out.println("Enter compressed log " + (i+1));
            String log = sc.next();
            
            // Validate each character in the log
            for (int j = 0; j < log.length(); j++) {
                //Tips 2: Check for uppercase letters
                if (Character.isUpperCase(log.charAt(j))) {
                    System.out.println("The compressed log string will only contain lowercase English letters. Please enter again:");
                    log = sc.next();
                }
                //Tips 3: Check string length
                else if (log.length() < 1||log.length() > 50) {
                    System.out.println("The length of the compressed string will be between 1 and 50 characters. Please enter again: ");
                    log = sc.next();
                }
            }
//            String log;
//            while (true) {
//                System.out.print("Enter compressed log " + (i + 1) + ": ");
//                log = sc.next();
//
//                // Length check
//                if (log.length() < 1 || log.length() > 50) {
//                    System.out.println("Length must be 1–50. Enter again.");
//                    continue;
//                }
//
//                // Character check
//                boolean hasUpper = false;
//                for (int j = 0; j < log.length(); j++) {
//                    if (Character.isUpperCase(log.charAt(j))) {
//                        hasUpper = true;
//                        break;
//                    }
//                }
//
//                if (hasUpper) {
//                    System.out.println("Only lowercase letters allowed. Enter again.");
//                    continue;
//                }
//
//                break;  // valid log
//            }

            // Call method
            decompress(log);
        }
    }
    
    public static void decompress (String log) {
        boolean invalid = false; // Mark invalid logs
        String message = ""; // Store decompressed message
        // Loop through each character of the compressed string
        for (int i = 0; i < log.length(); i++) {
            char ch = log.charAt(i);
            // Case 1: Character is a letter
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch); // ??????
                message+=ch;
            } 
            // Case 2: Character is a digit
            else if (Character.isDigit(ch)) {
                // Digits 0 and 1 are invalid
                if (ch == '0' || ch == '1') {
                    invalid = true;
                    break;
                }  
                // A digit cannot appear continuously
                // digit appears at index 0 OR digit follows another digit
                else if (i == 0 || Character.isDigit(log.charAt(i - 1))) {  
                    invalid = true;
                    break;
                } 
                
                else {
                    int numRepeat = (ch - '0') - 1;
                    for (int j= 0; j < numRepeat; j++) {
                        message+=(log.charAt (i - 1)) ;  // repeat letter in front
                    }
                }
                
            // Case 3: Any other symbol = invalid
            } else { 
                invalid = true;
                break; 
            }
        }
        // Final validation before printing
        if (invalid || message.length() > 200) {
            System.out.println ("Invalid Log");
        } else {
            // Tips 4: Final decompressed string must be <= 200 characters
            System.out.println (message.length());
        }
    }
}