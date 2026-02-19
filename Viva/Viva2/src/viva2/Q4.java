package viva2;

import java.util.Scanner;

public class Q4 {
    public static char checkWinner(char[][] board) {
        char player1 = 'X', player2 = 'O';
        for (int i = 0; i < board.length; i++) {
            if ((board[i][0] == 'X' && board[i][1] == 'X'  && board[i][2] == 'X') || (board[0][i] == 'X' && board[1][i] == 'X'  && board[2][i] == 'X'))
                return player1;
            else if ((board[i][0] == 'O' && board[i][1] == 'O'  && board[i][2] == 'O') || (board[0][i] == 'O' && board[1][i] == 'O'  && board[2][i] == 'O'))
                return player2;
        }
        
        if ((board[0][0] == 'X' && board[1][1] == 'X'  && board[2][2] == 'X') || (board[0][2] == 'X' && board[1][1] == 'X'  && board[2][0] == 'X'))
            return player1;
        else if ((board[0][0] == 'O' && board[1][1] == 'O'  && board[2][2] == 'O') || (board[0][2] == 'O' && board[1][1] == 'O'  && board[2][2] == 'O'))
            return player2;
        
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
