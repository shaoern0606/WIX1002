package viva2;

import java.util.Scanner;

public class Q1myself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        String number = sc.next();
        while (number.length() > 1) {
            int sum = 0;
            for (int i = 0; i < number.length(); i++) {
                char digit = number.charAt(i);
                int numericDigit = Character.getNumericValue(digit);
                sum += numericDigit;
            }
            number = Integer.toString(sum);
        }
        System.out.println("Digital root: " + number);
    }
}
