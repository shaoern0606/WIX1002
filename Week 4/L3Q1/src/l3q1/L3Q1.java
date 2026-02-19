/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q1;

import java.util.Scanner;

/**
 *
 * @author shaoern
 */
public class L3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.print("Enter two integer number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.print("Enter the operand: ");
        char operator = input.next().charAt(0);
        switch (operator) {
            case '+' -> System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1+num2));
            case '-' -> System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1-num2));
            case '*' -> System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1*num2));
            case '/' -> System.out.println(num1 + " " + operator + " " + num2 + " = " + ((double)num1/(double)num2));
            default -> System.out.println("Invalid operator");
            }
    }
}