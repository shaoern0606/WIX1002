/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q3;

import java.util.Random;

/**
 *
 * @author shaoern
 */
public class L2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        int num1 = random.nextInt(41) + 10;
        int num2 = random.nextInt(41) + 10;
        int num3 = random.nextInt(41) + 10;
        int sum = num1 + num2 + num3;
        double average = (double)sum / 3;
        System.out.printf("The three numbers: %d, %d, %d%n", num1, num2, num3);
        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Average: %.2f%n", average);
                
    }
    
}
