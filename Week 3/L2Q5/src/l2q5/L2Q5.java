/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q5;

import java.util.Random;

/**
 *
 * @author shaoern
 */
public class L2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        int number = random.nextInt(10001);
        int sum = 0;
        int num = number;
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }
        
        System.out.println("Number: "+ number); 
        System.out.println("Sum of all the digits: " + sum);
    }
    
}
