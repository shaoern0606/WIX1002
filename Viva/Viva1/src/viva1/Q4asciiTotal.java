package viva1;

import java.util.Scanner;

public class Q4asciiTotal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        
        // Input word and validate
        while (true) {
            System.out.print("Enter a word: ");
            word = sc.next();

            // check the word length
            if (word.length() > 50) {
                System.out.println("The word must not be longer than 50 characters. Please try again.");
                continue;
            }
            
            // check each character is a letter
            boolean validLetters = true;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                    validLetters = false;
                    break;
                }
            }

            if (!validLetters) {
                System.out.println("The word must contain only English alphabetic letters (A–Z or a–z). Please try again.");
            } else {
                break;
            }
            
        }

        word = word.toLowerCase();
        
        // input k and validate
        int k;
        while (true) {
            System.out.print("Enter gem length (length of substring): ");
            k = sc.nextInt();

            if (k <= 0) {
                System.out.println("Gem length must be greater than 0. Please try again.");
            } else if (k > word.length()) {
                System.out.println("Gem length cannot be greater than the word length. Please try again.");
            } else {
                break;
            }
        }
        
        // initialise firstWhisper manually using loop
        String firstWhisper = "";
        for (int i = 0; i < k; i++) {
            firstWhisper += word.charAt(i);
        }
        String lastEcho = firstWhisper;
        String coreValue = firstWhisper;
        int maxAsciiSum = -1;
        
        // loop through all possible starting points
        for (int i = 0; i <= word.length() - k; i++) {
            
            // build substring manually using inner loop
            String substring = "";
            for (int j = i; j < i + k; j++) {
                substring += word.charAt(j);
            }

            // compare for First Whisper
            if (substring.compareTo(firstWhisper) < 0) {
                firstWhisper = substring;
            }

            // compare for Last Echo
            if (substring.compareTo(lastEcho) > 0) {
                lastEcho = substring;
            }
            
            // calculate ASCII sum manually
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += (int) substring.charAt(j);
            }
            //System.out.println(substring + ": " + sum);    
            // update Core Value if larger sum is found
            if (sum > maxAsciiSum) {
                maxAsciiSum = sum;
                coreValue = substring;
            }
        }

        // Print the output
        System.out.println("First Whisper: " + firstWhisper);
        System.out.println("Last Echo: " + lastEcho);
        System.out.println("Core Value: " + coreValue);
        //System.out.println("Max ASCII Sum: " + maxAsciiSum);
    }
}