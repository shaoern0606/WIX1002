package viva.pkg2.set.c;

import java.util.Scanner;

public class Q2 {
    public static String getLargestNum(String num) {
        char[] array = new char [num.length()];
        array = num.toCharArray();
        for (int i = 0; i < num.length()-1; i++) {
            for (int j = 0; j < num.length()-i-1; j++) {
                if (array[j+1] > array[j]) {
                    char temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        String largestNum = "";
        for (int i = 0; i < array.length; i++) {
            largestNum += array[i]; 
        }
        return largestNum;
    }
    
    public static String getSmallestNum(String num) {
        char[] array = new char [num.length()];
        array = num.toCharArray();
        for (int i = 0; i < num.length()-1; i++) {
            for (int j = 0; j < num.length()-i-1; j++) {
                if (array[j+1] < array[j]) {
                    char temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        String smallestNum = "";
            for (int i = 0; i < array.length; i++) {
                if (array[i] == '0')
                    continue;
                else 
                    smallestNum += array[i]; 
            }
        return smallestNum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        String line = sc.next();
        String newLine = "";
        for (int i = 0; i < line.length(); i++) {
            if (Character.isDigit(line.charAt(i)))
                newLine += line.charAt(i);
        }       
        System.out.println("Largest number: " + getLargestNum(newLine));
        System.out.println("Smallest number: " + getSmallestNum(newLine));
    }
}
