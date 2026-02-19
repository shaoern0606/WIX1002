package viva1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        while (true) {
            T = sc.nextInt();
            if (T >= 1 && T <= 200) {
                break;
            }
            System.out.println("Invalid! Please enter a number between 1 and 200!");
        }
         
        String [] message = new String [T];
        
        for (int i = 0; i < T; i++) {
            int N;
            while (true) {
                N = sc.nextInt();
                if (N >= 0 && N <= 2000000000) {
                    break;
                }
                System.out.println("Invalid N! Please enter a number between 0 and 2,000,000,000!");
            }
            
            int L;
            
            while(true) {
                L = sc.nextInt();
                if (L>=0 && L<10) {
                    break;
                }
                System.out.println("Please enter a lucky digit between 0 to 9!");
            }
            
            int zeroCount = 0;
            int luckyCount = 0;
            int evenCount = 0;
            int oddCount = 0;
            
            if (N == 0) {
                if (L == 0)
                    message[i] = "LUCKY";
                else
                    message[i] = "NEUTRAL";
            } else {
                while (N > 0) {
                    int digit = N % 10;
                    N = N / 10;
                    
                    if (L == 0) {
                        zeroCount = 0;
                        if (digit == 0)
                            luckyCount++;
                        else if (digit % 2 == 0)
                            evenCount++;
                        else
                            oddCount++;
                    } else if (digit == L) {
                        luckyCount++;
                    } else if (digit == 0) {
                        zeroCount++;
                    } else if (digit % 2 == 0) {
                        evenCount++;
                    } else {
                        oddCount++;
                    }
                }
                if (luckyCount>evenCount && luckyCount>oddCount && luckyCount>zeroCount)
                    message[i] = "LUCKY";
                else if (evenCount>oddCount && evenCount>luckyCount && evenCount>zeroCount)
                    message[i] = "BALANCED";
                else if (oddCount>luckyCount && oddCount>evenCount && oddCount>zeroCount)
                    message[i] = "ENERGETIC";
                else
                    message[i] = "NEUTRAL";
            }      
        }
        System.out.println(" ");
        for (int i = 0; i < T; i++)
            System.out.println(message[i]);
    }        
}