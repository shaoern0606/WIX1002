package viva1;

import java.util.Scanner;

public class Q4version2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        
        while (true) {
            System.out.print("Enter a word: ");
            word = sc.next();

            if (word.length() <= 50) {
                break;
            } else {
                System.out.println("The word must not be longer than 50 characters. Please try again.");
            }
        }

        word = word.toLowerCase();
        
        System.out.print("Enter gem length (length of substring): ");
        int k = sc.nextInt();
        
        String firstWhisper = word.substring(0, k);
        String lastEcho = word.substring(0, k);
        String coreValue = word.substring(0, k);
        int maxAsciiSum = -1;
        
        for (int i = 0; i <= word.length() - k; i++) {
            String substring = word.substring(i, i + k);

            if (substring.compareTo(firstWhisper) < 0) {
                firstWhisper = substring;
            }

            if (substring.compareTo(lastEcho) > 0) {
                lastEcho = substring;
            }

            int sum = 0;
            for (int j = 0; j < substring.length(); j++) {
                sum += (int) substring.charAt(j);
            }

            if (sum > maxAsciiSum) {
                maxAsciiSum = sum;
                coreValue = substring;
            }
        }

        System.out.println("First Whisper: " + firstWhisper);
        System.out.println("Last Echo: " + lastEcho);
        System.out.println("Core Value: " + coreValue);
        
    }
}
