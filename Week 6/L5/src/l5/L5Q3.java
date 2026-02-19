/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author shaoern
 */
public class L5Q3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        System.out.print("Enter N employee: ");
        int N = sc.nextInt();
        
        int[][] workHour = new int[N][7];
        int total[] = new int[N];
        
        for (int i = 0; i < N; i++) {
            for (int day = 0; day < 7; day++) {
                workHour[i][day] = rd.nextInt(8) + 1;
                total[i] += workHour[i][day];
            }
        }
        
        System.out.println("Work hours of each employee in seven days & total hours for each employee");
        for (int i = 0; i < N; i++) {
            System.out.print("Employee " + (i+1) + ": ");
            for (int day = 0; day < 7; day++) {
                System.out.print(workHour[i][day] + " "); 
            }
            System.out.println("\tTotal: " + total[i]); 
        }
        
    }
    
}
