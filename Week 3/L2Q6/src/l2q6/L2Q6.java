/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q6;

import java.util.Scanner;

/**
 *
 * @author shaoern
 */
public class L2Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in gram: ");
        double M = input.nextDouble() / 1000;
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initialTemp = (input.nextDouble() - 32) / 1.8;
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double finalTemp = (input.nextDouble() - 32) / 1.8;
        double Q = M * (finalTemp - initialTemp) * 4184;
        System.out.printf("The energy needed is %e%n", Q);
    }
    
}
