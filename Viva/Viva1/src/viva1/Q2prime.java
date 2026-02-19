package viva1;

import java.util.Scanner;

public class Q2prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String [] message = new String [T];
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int L = sc.nextInt();
            int zeroCount = 0; // 0
            int luckyCount = 0; 
            int evenCount = 0; // 4,6,8
            int oddCount = 0; // 1,9
            int primeCount = 0; //2,3,5,7
                
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
                        else if (digit == 2 || digit == 3 || digit == 5 || digit == 7)
                            primeCount++;
                        else if (digit % 2 == 0)
                            evenCount++;
                        else
                            oddCount++;
                    } else if (digit == L) {
                        luckyCount++;
                    } else if (digit == 0) {
                        zeroCount++;
                    } else if ((digit == 2 || digit == 3 || digit == 5 || digit == 7) && digit != L) {
                        primeCount++;
                    } else if (digit % 2 == 0) {
                        evenCount++;
                    } else {
                        oddCount++;
                    }
                }
                if (luckyCount>evenCount && luckyCount>oddCount && luckyCount>zeroCount && luckyCount>primeCount)
                    message[i] = "LUCKY";
                else if (evenCount>oddCount && evenCount>luckyCount && evenCount>zeroCount && evenCount>primeCount)
                    message[i] = "BALANCED";
                else if (oddCount>luckyCount && oddCount>evenCount && oddCount>zeroCount && oddCount>primeCount)
                    message[i] = "ENERGETIC";
                else if (primeCount>oddCount && primeCount>evenCount && primeCount>zeroCount && primeCount>luckyCount)
                    message[i] = "PRIME";
                else
                    message[i] = "NEUTRAL";
            }      
        }
        System.out.println(" ");
        for (int i = 0; i < T; i++)
            System.out.println(message[i]);
    }        
}

