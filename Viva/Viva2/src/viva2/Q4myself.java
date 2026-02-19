package viva2;

import java.util.Scanner;

public class Q4myself {
    public static char checkWinner(char[][] board) {
        char[] players = {'X', 'O'};

        for (char p : players) {

            // Check rows and columns
            for (int i = 0; i < 3; i++) {
                if ((board[i][0] == p && board[i][1] == p && board[i][2] == p) ||
                    (board[0][i] == p && board[1][i] == p && board[2][i] == p)) {
                    return p;
                }
            }

            // Check diagonals
            if ((board[0][0] == p && board[1][1] == p && board[2][2] == p) ||
                (board[0][2] == p && board[1][1] == p && board[2][0] == p)) {
                return p;
            }
        }

        return '.';
    }
    
    public static int countMoves(char[][] board, char player) {
        int count = 0;
        for (char[] board1 : board) {
            // board.length = num of rows
            for (int j = 0; j < board1.length; j++) {
                if (board1[j] == player) {
                    count++;
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];
        
        for (int i = 0; i < 3; i++) {
            String row = "";
            boolean validRow = false;
            // loop continuously until we get a valid row
            while (!validRow) {
                System.out.print("Enter row " + (i+1) + ": ");
                row = sc.next().trim();
                if (row.length() != 3) {
                   System.out.println("You are only allowed to enter 3 character in a row");
                   continue;
                }
                validRow = true;
                stop: 
                for (int j = 0; j < 3; j++) {
                    char result = row.charAt(j);
                    // loop through the row to check every characters
                    while (result != 'X' && result != 'O' && result != '.') {
                        System.out.println("You enter an invalid character. Please enter X/O/.:");
                        validRow = false;
                        // stop checking this string and repeat again
                        break stop;
                    } 
                }
            }
            for (int j = 0; j < 3; j++) {
                board[i][j] = row.charAt(j);
            }
        }
        int countX = countMoves(board, 'X');
        int countO = countMoves(board, 'O');
        if ((countO > countX) || ((countX - countO) > 1))
            System.out.println("Invalid board: number of moves is not valid.");
        else {
            if (checkWinner(board) == '.')
                System.out.println("No Winner");
            else
                System.out.println("Winner: " + checkWinner(board));
        }
    }
}
