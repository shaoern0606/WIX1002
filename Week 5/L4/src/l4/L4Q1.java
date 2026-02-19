/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4;

import java.util.Scanner;

/**
 *
 * @author shaoern
 */
public class L4Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int integer = sc.nextInt();
        System.out.print("The factors are: ");
        for (int i = 1; i <= integer; i++) {
            if (integer % i == 0)
                if (integer != i)
                    System.out.print(i + ", ");
                else
                    System.out.println(i);
        }
                
    }
    
}
