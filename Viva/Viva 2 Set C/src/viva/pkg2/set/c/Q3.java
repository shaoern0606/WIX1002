package viva.pkg2.set.c;

import java.util.Scanner;

public class Q3 {
    
    static char[][] basePairs = {
        {'A','A'}, {'H','H'}, {'I','I'}, {'M','M'}, {'O','O'},
        {'T','T'}, {'U','U'}, {'V','V'}, {'W','W'}, {'X','X'},
        {'Y','Y'}, {'o','o'}, {'u','u'}, {'v','v'}, {'w','w'},
        {'b','d'}, {'d','b'}, {'p','q'}, {'q','p'}
    };

    static char[][] additionalPair = new char[39][2];
    
    public static String getLongestPalindrome(String str){
        String sub;
        int longestCount = 0;
        String longestWord = "";
        for (int start=0; start<str.length(); start++){
            
            for (int end=str.length(); end>start; end--){
                int count=0;
                sub = str.substring(start, end);
                for (int j = 0; j<sub.length()/2; j++) {
                    
                    if(sub.toLowerCase().charAt(j) == sub.toLowerCase().charAt(sub.length()-j-1)){
                        count++;
                    }
                }

                if (count == sub.length()/2) {
                    if (count > longestCount) {
                        longestWord = sub;
                        longestCount = count;
                    }
                }
            }
            
        }
        if (longestWord.length()>=2)
            return longestWord;
        else
            return "-";
    }
    
    public static String getLongestMirrorWord(String str){
        String sub;
        int longestCount = 0;
        String longestWord = "";
        for (int start=0; start<str.length(); start++){
            
            if (!isPairChar(str.charAt(start)))
                continue;
            
            for (int end=str.length(); end>start; end--){
                int count=0;

                sub = str.substring(start, end);
                
                for (int j = 0; j<sub.length()/2; j++) {
                    
                    if ( isPairChar(sub.charAt(j)) && isPairChar(sub.charAt(sub.length()-j-1)) ) {
                        int pairCharIndex = getPairCharIndex(sub.charAt(j));
                        if(sub.charAt(sub.length()-j-1) == additionalPair[pairCharIndex][1]){
                            count++;
                        }
                    }
                    
                }

                if (count == sub.length()/2 && checkMiddle(sub)) {
                    if (count > longestCount) {
                        longestWord = sub;
                        longestCount = count;
                    }
                }
            }
            
            
        }
        if (longestWord.length()>=2)
            return longestWord;
        else
            return "-";
    }
    
    public static boolean isPairChar(char c){
        for (int i=0; i < additionalPair.length; i++) {
            if (c == additionalPair[i][0]) {
                return true;
            }
        }
        return false;
    }
    
    public static int getPairCharIndex(char c){
        for (int i=0; i < additionalPair.length; i++) {
            if (c == additionalPair[i][0]) {
                return i;
            }
        }
        return -1;
    }
    
    public static boolean checkMiddle(String str){
        char[] selfMirror = {'A','H','I','M','O','T','U','V','W','X','Y','o','u','v','w'};
        if (str.length() % 2 == 0)
            return true;
        else {
            for (char c : selfMirror) {
                int middle = (str.length()-1)/2;
                if (str.charAt(middle) == c)
                    return true;
            }
            return false;
        }          
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < basePairs.length; i++) {
            additionalPair[i] = basePairs[i];
        }

        System.out.println("Enter additional pairs: ");
        int i = 0;
        while (i < 20) {                     // limit to 10 extra pairs
            String customPair = sc.nextLine();

            if (customPair.isEmpty()) {      // stop condition
                break;
            }

            if (customPair.length() != 2) {  // input validation
                System.out.println("Please enter exactly 2 characters");
                continue;
            }

            additionalPair[19 + i][0] = customPair.charAt(0);
            additionalPair[19 + i][1] = customPair.charAt(1);
            additionalPair[19 + i + 1][0] = customPair.charAt(1);
            additionalPair[19 + i + 1][1] = customPair.charAt(0);
            i+=2;
        }
        
        System.out.println((i/2) + " pair(s) entered.");
        System.out.print("Enter word: ");
        String word = sc.nextLine();
        
        System.out.println("Longest palindrome substring: " + getLongestPalindrome(word));
        System.out.println("Longest mirrorable substring: " + getLongestMirrorWord(word));
        
    }
}
