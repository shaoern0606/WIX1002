/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author shaoern
 */
public class L5Q1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        System.out.print("Enter N students: ");
        int N = sc.nextInt();
        
        int highest = 0;
        int lowest = 100;
        int sum = 0;
        
        int[] score = new int[N];
        for (int i = 0; i < N; i++) {
            score[i] = rd.nextInt(101);
            if (score[i] > highest)
                highest = score[i];
            if (score[i] < lowest)
                lowest = score[i];
            sum += score[i];
        }
        double average = (double) sum / N;
        
        System.out.println(Arrays.toString(score));
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.printf("Average score %.2f%n", average);
        
    }
    
}
