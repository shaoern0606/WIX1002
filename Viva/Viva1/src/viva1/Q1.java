package viva1;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int q = 0;
        int a = 51;
        int b = 51;
        int n = 0;
        while (q > 500 || q < 1){
            System.out.print ("Enter number of inquiries : ");
            q = input.nextInt () ;
        }
        for (int i = 0; i < q; i++){
            do{
                System.out.print ("Enter initial value : ");
                a = input.nextInt();
            }while(a > 50 || a < 0);
            
            do{
                System.out.print ("Enter multiplier seed : ");
                b = input.nextInt();
            } while(b > 50 || b < 0);
            
            do{
                System.out.print ("Enter charm length : ");
                n = input.nextInt();
            }while(n > 15 || n <= 0) ;
            
            for (int j = 0; j < n; j++){
                int digit = (int) (a + (b * Math.pow(2, j)));
                System.out.print(digit + " ");
            }
            System.out.println();
        }
    }   
}
