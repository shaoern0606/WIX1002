package viva1;

import java.util.Scanner;

public class Q6printlog {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of compressed log: ");
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String log = sc.next().trim();
            decompress(log);
        }
    }
    
    public static void decompress (String log) {
        boolean invalid = false;
        String message = "";
        for (int i = 0; i < log.length(); i++) {
            char ch = log.charAt(i);
            if (Character.isLetter(ch)) {
                message+=ch;
            } else if (Character.isDigit(ch)) {
                if (ch == '0' || ch == '1') {
                    invalid = true;
                    break;
                // digit appears at index 0 OR digit follows another digit
                } else if (i == 0 || Character.isDigit(log.charAt(i - 1))) {  
                    invalid = true;
                    break;
                } else {
                    int numRepeat = (ch - '0') - 1;
                    for (int j= 0; j < numRepeat; j++) {
                        message+=(log.charAt (i - 1)) ;
                    }
                }
            // not letter or digit
            } else { 
                invalid = true;
                break; 
            }
        }
        
        if (invalid) {
            System.out.println ("Invalid Log");
        } else {
            System.out.println (message.length());
            if (message.length() <= 25)
                System.out.print(message);
            else {
                for (int i = 0; i < 10; i++)
                    System.out.print(message.charAt(i));
                System.out.print(" ... ");
                for (int i = message.length() - 10; i < message.length(); i++)
                    System.out.print(message.charAt(i));
            }
            System.out.println();
        }
    }
}
       
            

//public static void decompress(String log) {
//    boolean invalid = false;
//    String message = "";
//    
//    for (int i = 0; i < log.length(); i++) {
//        char ch = log.charAt(i);
//
//        // If letter (and not after a digit)
//        if (Character.isLetter(ch)) {
//            // If previous was a digit, skip because digit logic handles it
//            if (i > 0 && Character.isDigit(log.charAt(i - 1))) {
//                continue;
//            }
//            message += ch;
//        }
//
//        // If digit → repeat NEXT letter
//        else if (Character.isDigit(ch)) {
//
//            int repeat = ch - '0';
//
//            // repeat cannot be 0 or 1
//            if (repeat <= 1) {
//                invalid = true;
//                break;
//            }
//
//            // digit cannot be last char (needs next char)
//            if (i == log.length() - 1) {
//                invalid = true;
//                break;
//            }
//
//            char nextChar = log.charAt(i + 1);
//
//            // next char must be a letter
//            if (!Character.isLetter(nextChar)) {
//                invalid = true;
//                break;
//            }
//
//            // repeat nextChar
//            for (int r = 0; r < repeat; r++) {
//                message += nextChar;
//            }
//        }
//
//        else {
//            invalid = true;
//            break;
//        }
//    }
//
//    if (invalid) {
//        System.out.println("Invalid Log");
//    } else {
//        System.out.println(message.length());  // your original requirement
//    }
//}
       
            