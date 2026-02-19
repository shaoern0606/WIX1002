package l6;

import java.util.Random;
import java.util.Scanner;

public class L6Q5 {
    public static boolean isEqual(int a, int b, int c) {
        return a * b == c;
    }
    
    public static void main(String[] args) {
        int score = 0;
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        do {
            num1 = rd.nextInt(13);
            num2 = rd.nextInt(13);
            System.out.println("Enter negative number to quit.");
            System.out.print(num1 + " x " + num2 + " = ");
            num3 = sc.nextInt();  
            if (isEqual(num1, num2, num3)) {
                score++;
            }
        } while (num3 >= 0);
        System.out.println("Your Score is " + score);
    }
}
