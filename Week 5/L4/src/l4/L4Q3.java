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
public class L4Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int N = 0;
        double sumX = 0;
        double sumXsquare = 0;
        
        System.out.print("Enter a score [negative score to quit]:");
        int score = sc.nextInt();
        while (score > 0) {
            if (score > max)
                max = score;
            if (score < min)
                min = score;
            sumX += score;
            sumXsquare += score * score;
            N++;      
            System.out.print("Enter a score [negative score to quit]:");
            score = sc.nextInt();
        }

        double S = Math.sqrt((sumXsquare-((sumX*sumX)/N) ) / (N-1));
        double mean = sumX / N;
        
        System.out.println("Minimum Score: " + min);
        System.out.println("Maximum Score: " + max);
        System.out.printf("Average Score: %.2f%n", mean);
        System.out.printf("Standard Deviation: %.2f%n", S);
    }
}
