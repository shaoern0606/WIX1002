package viva2;

import java.util.Scanner;

public class Test {
    
    public static String mostFrequentWord(String str) {
        String[] sentence = str.trim().split("\\s+");
        int most = 0;
        String mostFrequentWord = "";
        for (int i = 0; i < sentence.length; i++) {
            int temp = 1;
            for (int j = i+1; j< sentence.length; j++) {
                if (sentence[i].equalsIgnoreCase(sentence[j]))
                    temp++;
            }
            if (temp > most) {
                most = temp;
                mostFrequentWord = sentence[i];
            }
        }
        return mostFrequentWord;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");
        String string = sc.nextLine();
        String frequent = mostFrequentWord(string);
        System.out.println(frequent);
    }
}
