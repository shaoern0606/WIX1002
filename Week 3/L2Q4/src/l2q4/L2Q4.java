/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q4;

import java.util.Scanner;

/**
 *
 * @author shaoern
 */
public class L2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int input = sc.nextInt();
        int hour = input / 3600;
        int minute = (input % 3600) / 60;
        int second = input % 60;
        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds%n", input, hour, minute, second);
    }
    
}
