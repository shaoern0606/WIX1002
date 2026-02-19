/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l4;

import java.util.Random;

/**
 *
 * @author shaoern
 */
public class L4Q8 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(101);
        System.out.printf("Random integer: %d%n", n);
        
        int count = 0;
        int num = 2;
        
        System.out.print("First " + n + " prime numbers: ");
        
        while (count < n) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
       
            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }
    }
}
