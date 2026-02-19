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
public class L4Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double P = sc.nextDouble();
        System.out.print("Enter interest in %: ");
        double i = sc.nextDouble();
        System.out.print("Enter total number of month(s): ");
        double N = sc.nextDouble();
        double M = (P * (i / (12*100))) / (1 - Math.pow((1 + i / (12*100)), -N));
        System.out.printf("%s%22s%16s%15s%21s%22s%n", "Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest");
        double C, L, R, total = 0;
        for (int n = 1; n <= N; n++) {
            C = M * Math.pow(1 + (i/(12*100)), -(1+N-n));
            L = M - C;
            R = L / (i/(12*100)) - C;
            total += L;
            System.out.printf("%-5d%22.2f%16.2f%15.2f%21.2f%22.2f%n",n, M, C, L, R, total);
        }
    }
}
