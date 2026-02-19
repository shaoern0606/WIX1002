/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l4;

import java.util.Scanner;

/**
 *
 * @author shaoern
 */
public class L4Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                sum += j;
        }
        System.out.println("The sum is "+ sum);
    }
    
//    int sum1 = 0;
//    int sum2 = 0;
//    for (int j = 1; j <= n; j++) {
//        sum1 += j;
//        sum2 += sum1;
//    }
//    System.out.print("Sum: " + sum2);
}
