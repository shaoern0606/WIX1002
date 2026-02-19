package viva1;

import java.util.*;

public class Q1highestLowest {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int q = 0;
        int a = 51;
        int b = 51;
        int n = 0;
        
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        
        int sum = 0;
        int count = 0;
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
            } while(b > 50 || b < 0 || b <= a);
            
            do{
                System.out.print ("Enter charm length : ");
                n = input.nextInt();
            }while(n > 15 || n == 0) ;
            
            for (int j = 0; j < n; j++){
                int digit = (int) (a + (b * Math.pow(2, j)));
                if (digit > 100) {
                    System.out.print("\nStop because next value " + digit + " is > 100");
                    break;
                }
                
                System.out.print (digit + " ");
                
                if (digit > highest)
                    highest = digit;
                if (digit < lowest)
                    lowest = digit;
                sum+=digit;
                count++;
                
            }
        double average = (count > 0) ? (double) sum / count : 0;  
        System.out.println();
        System.out.println("Highest: " + highest + ", Lowest: " + lowest);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        }
    }   
}
