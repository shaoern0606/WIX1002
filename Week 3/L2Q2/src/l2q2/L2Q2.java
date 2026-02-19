/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q2;

import java.util.Scanner;

/**
 *
 * @author shaoern
 */
public class L2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter the price of the car: RM");
        double P = input.nextDouble();
        System.out.print("Enter down payment: RM");
        double D = input.nextDouble();
        System.out.print("Enter interest rate in %: ");
        double R = input.nextDouble();
        System.out.print("Enter loan duration in years: ");
        double Y = input.nextDouble();
        
        double M = (P - D) * (1 + R * Y / 100) / (Y * 12);
        System.out.printf("Monthly payment: RM%.2f%n", M);
    }
    
}
