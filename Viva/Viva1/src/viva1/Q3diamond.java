package viva1;

import java.util.Scanner;

public class Q3diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of queries: ");
        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++) {
            System.out.print("Enter the height and style: ");
            int height = sc.nextInt();
            if (height < 1 || height > 9) {
                System.out.println("Invalid height. Height must be between 1 and 9.");
                continue; 
            }
            
            char style = sc.next().charAt(0); // char style = sc.next().toUpperCase().charAt(0);
            if (style == 'A') {
                for (int h = 1; h <= height; h++) {
                    for (int i = 1; i <= h; i++) {
                        System.out.print(h);
                    }
                    System.out.println();
                }
            } else if (style == 'P') {
                for (int h = 1; h <= height; h++) {
                    for (int i = 1; i <= height - h; i++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= h; j++) {
                        System.out.print(j);
                    }
                    for (int k = h-1; k > 0; k--) {
                        System.out.print(k);
                    }
                    System.out.println();
                }
            } else if (style == 'D') { 
                for (int h = 1; h <= height; h++) {
                    for (int i = 1; i <= height - h; i++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= h; j++) {
                        System.out.print(j);
                    }
                    for (int k = h-1; k > 0; k--) {
                        System.out.print(k);
                    }
                    System.out.println();
                }
                for (int h = height - 1; h>=1; h--) {
                    for (int i = 1; i <= height - h; i++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= h; j++) {
                        System.out.print(j);
                    }
                    for (int k = h-1; k > 0; k--) {
                        System.out.print(k);
                    }
                    System.out.println();
                }
            } else if (style == 'R') { 
                for (int h = height; h >= 1; h--) {
                    for (int i = 1; i <= h; i++) {
                        System.out.print(h);
                    }
                    System.out.println();
                }
                
            } else
                System.out.println("Please enter valid character for Style"); 
        }    
    }
}
//  1
// 121
//12321
// 121
//  1
//
//1
//121
//12321
//1234321
//12321
//121
//1

// 
// 
//  1234321
// 123454321
//12345654321