/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q4;

import java.util.Random;

/**
 *
 * @author shaoern
 */
public class L3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        
        int player1 = 0;
        int player2 = 0;
        
        for (int i = 0; i < 2; i++) {
            int dice1 = random.nextInt(6) + 1;
                player1 += dice1; 
            int dice2 = random.nextInt(6) + 1;
                player2 += dice2; 
        }
        
        System.out.println("Player 1 total score: " + player1);
        System.out.println("Player 2 total score: " + player2);
        
        if (player1 > player2)
            System.out.println("Player 1 wins");
        else if (player2 > player1)
            System.out.println("Player 2 wins");   
        else
            System.out.println("It is tie");
        
    }
    
}
