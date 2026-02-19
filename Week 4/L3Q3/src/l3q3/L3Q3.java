/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q3;

import java.util.Scanner;

/**
 *
 * @author shaoern
 */
public class L3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double salesVolume = input.nextDouble();
        double commission;
        if (salesVolume <= 100)
            commission = 0.05 * salesVolume;
        else if (salesVolume <= 500)
            commission = 0.075 * salesVolume;
        else if (salesVolume <= 1000)
            commission = 0.1 * salesVolume;
        else
            commission = 0.125 * salesVolume;
        System.out.printf("Commision: %.2f%n", commission);
    }
    
}
