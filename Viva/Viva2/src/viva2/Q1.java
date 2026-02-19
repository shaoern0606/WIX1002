package viva2;

import java.util.Scanner;

public class Q1 {
    public static int digitalRoot(int n) {
        // Outer loop continues until a single digit remains
        while (n >= 10) {
            int sum = 0;
            // Inner loop sums each digit
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            
            // Print immediate sum
            // System.out.println(sum);
            
            // Update n with sum of digits
            n = sum;
        }
        return n;
        //if (n == 0) return 0;
        //return 1 + (n - 1) % 9;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        
        System.out.println("Digital root: " + digitalRoot(num));
    }
}
