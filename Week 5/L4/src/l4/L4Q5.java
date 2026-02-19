/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l4;

import java.util.Random;

/**
 *
 * @author shaoern
 */
public class L4Q5 {
    public static void main(String[] args) {
        Random random = new Random();
        int player1 = 0;
        int player2 = 0;
       
        while ((player1 <= 100) && (player2 <= 100)) {
            int dice1 = random.nextInt(6) + 1;
            player1 += dice1;
            System.out.println("Player 1 rolls: " + dice1 + " -> Total: " + player1);
            while (dice1 == 6) {
                dice1 = random.nextInt(6) + 1;
                player1 += dice1;
                System.out.println("Player 1 rolls: " + dice1 + " -> Total: " + player1);
            }
            int dice2 = random.nextInt(6) + 1;
            player2 += dice2;
            System.out.println("Player 2 rolls: " + dice2 + " -> Total: " + player2);
            while (dice2 == 6) {
                dice2 = random.nextInt(6) + 1;
                player2 += dice2;
                System.out.println("Player 2 rolls: " + dice2 + " -> Total: " + player2);
            }
        }
        
        System.out.println("Player 1: " + player1);
        System.out.println("Player 2: " + player2);
        if (player1 > player2)
            System.out.println("Player 1 wins");
        else if (player2 > player1)
            System.out.println("Player 2 wins");
        else
            System.out.println("It's a tie");
        
    }
}