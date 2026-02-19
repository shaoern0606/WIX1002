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
public class L4Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter first day of the year: (0 for Sunday, 1 for Monday, 2 for Tuesday, 3 for Wednesday, 4 for Thursday, 5 for Friday, 6 for Saturday): ");
        int firstYear = sc.nextInt();
                
        int Feb;        
        if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0))
            Feb = 29;
        else
            Feb = 28;       
        
        System.out.println("\n\t  May " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        
        int firstMay = (firstYear + (31 + Feb + 31 + 30)) % 7;
        
        for (int i = 0; i < firstMay; i++)
            System.out.print("    ");    
        for (int day = 1; day <= 31; day++, firstMay++) {
            if (firstMay == 0)
                System.out.printf("%-4d", day);
            else if (firstMay % 7 == 0)
                System.out.printf("%n%-4d", day);
            else
                System.out.printf("%-4d", day);
        }
        
        System.out.println("\n\n\tAugust " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        
        int firstAug = (firstYear + (31 + Feb + 31 + 30 + 31 + 30 + 31)) % 7;
        
        for (int i = 0; i < firstAug; i++)
            System.out.print("    ");    
        for (int day = 1; day <= 31; day++, firstAug++) {
            if (firstAug == 0)
                System.out.printf("%-4d", day);
            else if (firstAug % 7 == 0)
                System.out.printf("%n%-4d", day);
            else
                System.out.printf("%-4d", day);
        }
    }
}