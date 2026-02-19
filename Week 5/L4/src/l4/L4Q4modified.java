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
public class L4Q4modified {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int Feb, dayPreviousMonth = 0, firstMonth;   
        
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter first day of the year: (0 for Sunday, 1 for Monday, 2 for Tuesday, 3 for Wednesday, 4 for Thursday, 5 for Friday, 6 for Saturday): ");
        int firstYear = sc.nextInt();
        System.out.print("Enter month: ");
        int month = sc.nextInt();
        
        String[] monthList = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}; 
     
        if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0))
            Feb = 29;
        else
            Feb = 28;    
        
        int[] numDayList = {31, Feb, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < (month-1); i++)
            dayPreviousMonth += numDayList[i];
        firstMonth = (firstYear + dayPreviousMonth) % 7;
        
        System.out.println("\n\t" + monthList[month-1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        
        for (int i = 0; i < firstMonth; i++)
                System.out.print("    ");  
        int daysInMonth = numDayList[month-1];
        for (int day = 1; day <= daysInMonth; day++, firstMonth++) {
            if (firstMonth == 0)
                System.out.printf("%-4d", day);
            else if (firstMonth % 7 == 0)
                System.out.printf("%n%-4d", day);
            else
                System.out.printf("%-4d", day);
        }
        
    }
    
}
