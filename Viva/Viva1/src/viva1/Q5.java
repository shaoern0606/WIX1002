package viva1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int T;
        // Ask for number of words, which must be between 1 and 100
        while(true) {
            System.out.print("Enter number of words to test: ");
            T = sc.nextInt();
            if (T>=1 && T<=100)
                break;
            else
                System.out.println("Number of words must be between 1 and 100, please try again. ");
        }    

        // Loop to process each word
        for (int i=1; i <= T; i++) {
            String word;
            while (true) {
                System.out.print("Word " + i + ": ");
                // Convert input to lowercase to handle uppercase vowels properly
                word = sc.next().toLowerCase();
                if (word.length()>=1 && word.length()<=50)
                    break;
                else
                    System.out.println("Length of each word must be between 1 and 50 characters. Please try again");
            }
            
            System.out.print("Result: ");
            if (isChaos(word))
                System.out.println("Chaos \n");
            else
                System.out.println("Harmony \n");
        }
            
    }
    
    public static boolean isVowel (char v){
        return v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u';
    }
    
    public static boolean isChaos (String word) {
        char lastLetter = word.charAt(word.length () - 1);
        if (isVowel(lastLetter)) {
            return true;
        }
        
        for (int i=0; i < word.length()-1; i++){
            char currentLetter = word.charAt(i);
            char nextLetter = word.charAt (i+1);
            
            if (isVowel(currentLetter) && isVowel(nextLetter)){
                return true;
            }
        }
        return false;
    }
    
}
