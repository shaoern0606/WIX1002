package viva1;

import java.util.Scanner;

public class Q5endingY {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter number of words to test: ");
        int T = sc.nextInt();
        
        for (int i=1; i <= T; i++) {
            System.out.print("Word " + i + ": ");
            String word = sc.next().toLowerCase();
            
            System.out.print("Result: ");
            int length = word.length();
            if (word.charAt(length-1) == 'y')
                System.out.println("Harmony \n");
            else if (isChaos(word))
                System.out.println("Chaos \n");
            else
                System.out.println("Harmony \n");
        }
            
    }
    
    public static boolean isVowel (char v){
        return v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u';
    }
    
    public static boolean isChaos (String word) {
        char lastLetter = word. charAt (word.length () - 1);
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
