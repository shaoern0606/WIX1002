/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l5;

import java.util.Scanner;

/**
 *
 * @author shaoern
 */
public class L5Q6 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int row = sc.nextInt();
        System.out.println("The Pascal Triangle with " + row + " row(s)");
        
        int[][] pascalTriangle = new int[row][row];
        
        for (int i = 0; i < row; i++) {
            pascalTriangle[i][0] = 1;
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < row; j++) {
                pascalTriangle[i][j] = pascalTriangle[i-1][j-1] + pascalTriangle[i-1][j];
            }   
        }
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.printf("%-4d", pascalTriangle[i][j]);
            }
            System.out.println();
        }
        
    }
    
}

//2,1 = 1,0 + 1,1
//2,2 = 1,1 + 1,2
//
//3,1 = 2,0 + 2,1
//3,2 = 2,1 + 2,2
//3,3 = 2,2 + 2,3