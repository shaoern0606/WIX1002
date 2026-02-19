package viva.pkg2.set.c;

import java.util.Scanner;

public class Q6 {
    public static void moveLeft(int[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length - 1; j++) {
//                for (int k = 0; k < input[i].length - j - 1; k++) {
//                    if (input[i][k] == 0) {
//                        input[i][k] =
//                        input[i][k] = input[i][k+1];
//                    }
//                }
                if (input[i][j] == 0) {
                    input[i]
                }
            }
        }
        displayBoard(input);
    }
    
    public static void moveRight(int[][] input) {
        
    }
    
    public static void moveUp(int[][] input) {
        
    }
    
    public static void moveDown(int[][] input) {
        
    }
    
    public static void displayBoard(int[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            String line = sc.nextLine();
            String[] lineArray = new String[4];
            lineArray = line.split(" ");
            for (int j = 0; j < 4; j++) {
                board[i][j] = Integer.parseInt(lineArray[j]);
            }
        }
        
        String direction = sc.nextLine();
        if (direction.equalsIgnoreCase("left"))
            moveLeft(board);
        else if (direction.equalsIgnoreCase("right"))
            moveRight(board);
        else if (direction.equalsIgnoreCase("up"))
            moveUp(board);
        else if (direction.equalsIgnoreCase("down"))
            moveDown(board);
    }
}
