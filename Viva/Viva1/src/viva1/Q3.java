package viva1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        int height = 0;
        char style;
        do {
            System.out.print("Enter number of queries(1-50): ");
            T = sc.nextInt();
        } while (T<1 || T>50);
        
        for (int t = 0; t < T; t++) {
            do {
                System.out.print("Enter the height(1-9) and style(A/P): ");
                height = sc.nextInt();
                style = sc.next().charAt(0); // char style = sc.next().toUpperCase().charAt(0);
            } while ((height<1 || height>9) || (style!='A' && style!='P'));
                
            if (style == 'A') {
                for (int h = 1; h <= height; h++) { //Each row number increases from 1 until height.
                    for (int i = 1; i <= h; i++) { //In each row, I print the row number h, repeated h times.
                        System.out.print(h);
                    }
                    System.out.println();
                }
            } else if (style == 'P') {
                for (int h = 1; h <= height; h++) {
                    for (int i = 1; i <= height - h; i++) {
                        System.out.print(" "); //Print spaces to centre the pyramid
                    }
                    for (int j = 1; j <= h; j++) {
                        System.out.print(j); //Print numbers increasing from 1 to h
                    }
                    for (int k = h-1; k > 0; k--) {
                        System.out.print(k); //Print numbers decreasing from h−1 back to 1
                    }
                    System.out.println();
                }
            }
        }    
    }
}
