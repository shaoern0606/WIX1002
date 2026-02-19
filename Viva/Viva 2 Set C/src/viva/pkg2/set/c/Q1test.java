package viva.pkg2.set.c;

import java.util.Scanner;

public class Q1test {
    private static int uniqueCount;
    
    public static boolean isAnagram(String a, String b){
        String shorter = "";
        String longer = "";
        if (a.length() <= b.length()){
            shorter = a;
            longer = b;
        } else {
            shorter = b;
            longer = a;
        }
        
        char[] shorterArray = new char[shorter.length()];
        shorterArray = shorter.toCharArray();
        char[] longerArray = new char[longer.length()];
        longerArray = longer.toCharArray();
        
        boolean[] used = new boolean[longer.length()];
        int count = 0;
        for (int i=0; i<shorterArray.length; i++) {
            for (int j=0; j<longerArray.length;j++) {
                if ((shorterArray[i] == longerArray[j]) && !used[j]) {
                    used[j] = true;
                    count++;
                    break;
                }
            }
        }
        
        return count == shorterArray.length;
        
    }
    
    public static int countChar(String str) {
        return str.length();
    }
    
    public static String[] removeDuplicates(String list[]){
        uniqueCount = 0;
        String[] newList = new String[list.length];
        
        for (int i = 0; i < list.length; i++){
            boolean found = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (list[i].equals(newList[j])) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                newList[uniqueCount] = list[i];
                uniqueCount++;
            }
        }
        
        String[] noDuplicateList = new String[uniqueCount];
        for (int i = 0; i < uniqueCount; i++){
            noDuplicateList[i] = newList[i];    
        }
        return noDuplicateList;
    }
    
    public int getUniqueCount() {
        return uniqueCount;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of words: ");
        int num = sc.nextInt();
        sc.nextLine();
        String[] wordList = new String [num];
        for (int i = 0; i < num; i++){
            wordList[i]= sc.nextLine();
        }
        
        String[] noDuplicateList = new String[uniqueCount];
        noDuplicateList = removeDuplicates(wordList);
//        for (String s : noDuplicateList) {
//            System.out.println(s);
//        }
        

        String[][] anagramList = new String[uniqueCount][uniqueCount];
        boolean[] used = new boolean[uniqueCount];
        for(int i=0; i<uniqueCount; i++){
            for(int j=i+1; j<uniqueCount; j++){
                if(isAnagram(noDuplicateList[i], noDuplicateList[j]) && !used[j]) {
                    anagramList[i][i] = noDuplicateList[i];
                    anagramList[i][j] = noDuplicateList[j];
                    used[j] = true;
                }
                
            }
        }
        
        for(int i=0; i<uniqueCount; i++){
            if (anagramList[i] != null){
                System.out.print("Anagram group " + (i+1) + ": ");
            }
            for(int j=0; j<uniqueCount; j++){
                if (anagramList[i][j] != null){
                    System.out.print(anagramList[i][j] + " ");
                }
            }
        }
        
    }
}