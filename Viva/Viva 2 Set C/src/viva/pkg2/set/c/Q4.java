package viva.pkg2.set.c;

import java.util.Scanner;

public class Q4 {
    public static int wordCount(String str) {
        int count = 0;
        char[] strArray = new char[str.length()];
        strArray = str.toCharArray();
        for (char c : strArray) {
            if (c == ' ')
                count++;
        }
        return count+1;
    }
    
    public static int characterCount(String str) {
        return str.length();
    }
    
    public static int characterCountWithoutSpaces(String str) {
        int count = 0;
        char[] strArray = new char[str.length()];
        strArray = str.toCharArray();
        for (char c : strArray) {
            if (c == ' ')
                continue;
            count++;
        }
        return count;
    }
    
    public static int sentenceCount(String str) {
        int count = 0;
        char[] strArray = new char[str.length()];
        strArray = str.toCharArray();
        for (char c : strArray) {
            if (c == '.')
                count++;
        }
        return count;
    }
    
    public static String mostFrequentWord(String str) {
        String[] wordArray = new String[wordCount(str)];
        wordArray = toWordArray(str);
        
        String mostFrequentWord = wordArray[0];
        int highestFrequency = 0;
        for (int i = 0; i < wordArray.length; i++) {
            int frequency = 0;
            for (int j = i+1; j < wordArray.length; j++) {
                if (wordArray[j].equalsIgnoreCase(wordArray[i])){
                    frequency++;
                }
            }
            if (frequency > highestFrequency) {
                highestFrequency = frequency;
                mostFrequentWord = wordArray[i];
            } 
        }
        return mostFrequentWord;
    }
    
    public static String longestWord(String str) {
        String[] wordArray = new String[wordCount(str)];
        wordArray = toWordArray(str);
        String longestWord  = wordArray[0];
        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].length() > longestWord.length()) {
                longestWord = wordArray[i];
            }
        } 
        return longestWord;   
    }
    
    public static String[] toWordArray(String str) {
        String[] wordArray = new String[wordCount(str)];
        wordArray = str.split(" ");
        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].charAt(wordArray[i].length()-1) == ',' || wordArray[i].charAt(wordArray[i].length()-1) == '.') {
                wordArray[i] = wordArray[i].substring(0, wordArray[i].length()-1);   
            }
        }
        return wordArray;  
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentences: ");
        String line = sc.nextLine();
        System.out.println("Word Count: " + wordCount(line));
        System.out.println("CharacterCount: " + characterCount(line));
        System.out.println("Character Count without Space: " + characterCountWithoutSpaces(line));
        System.out.println("Sentence Count: " + sentenceCount(line));
        System.out.println("Most Frequent Word: " + mostFrequentWord(line));
        System.out.println("Longest Word: " + longestWord(line));
    }
}
