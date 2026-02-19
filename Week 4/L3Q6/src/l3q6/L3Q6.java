/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q6;

import java.util.Scanner;

/**
 *
 * @author shaoern
 */
public class L3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter radius of a circle: ");
        double radius = input.nextDouble();
        
        System.out.print("Enter x coordinate of the point: ");
        double x = input.nextDouble();
        System.out.print("Enter y coordinate of the point: ");
        double y = input.nextDouble();
        
        double distance = Math.sqrt(x * x + y * y);
        
        if (distance < radius)
            System.out.println("The point is inside the circle");
        else if (distance > radius)
            System.out.println("The point is outside the circle");
        else
            System.out.println("The point is on the circle");
    }
    
}
