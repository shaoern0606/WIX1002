/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l5;

/**
 *
 * @author shaoern
 */
public class L5Q4 {
    
    public static void main(String[] args) {
        
        System.out.println("3 by 3 matrix");
        int[][] matrix = {{1, 5, 7}, {3, 6, 9}, {5, 3, 8}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("");
        int[][] rotatedMatrix = new int[3][3];
        System.out.println("After rotates 90 degrees clockwise");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                rotatedMatrix[i][j] = matrix[2-j][i];
                System.out.print(rotatedMatrix[i][j] + "  ");
            }
            System.out.println("");
        }
        
        /* 
        0,0 to 0,2
        0,1 to 1,2
        0,2 to 2,2
        
        1,0 to 0,1
        1,1 to 1,1
        1,2 to 2,1
        
        2,0 to 0,0
        2,1 to 1,0
        2,2 to 2,0
        */
    }
    
}
