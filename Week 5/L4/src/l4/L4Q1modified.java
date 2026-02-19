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
public class L4Q1modified {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int integer = sc.nextInt();
        
        System.out.print("Enter the range: ");
        int range = sc.nextInt();
        
        System.out.println("The multiples are: ");
        
        for (int i = 1; integer*i <= range; i++)
            System.out.println(integer*i);
        
//        System. out print ("Enter an integer: ");
//        int num = input nextInt () ;
//        System.out print ("Please input the starting range: ");
//        int start = input.nextInt () ;
//        System.out-print ("Please input the end range: ");
//        int fin = input.nextInt () ;
//        System.out print ("The mutiples are: ");
//        for (int i = start; i <= fin; i++){
//          if (i & num == 0) 
//              System. out print (i + " ");
    }
    }
    
}
