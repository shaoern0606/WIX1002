/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l5;

import java.util.Random;

/**
 *
 * @author shaoern
 */
public class L5Q2 {
    
    public static void main(String[] args) {
        
        Random rd = new Random();    
        int[] randomInt = new int[10];
        
        for (int i = 0; i < 10; i++) {
            randomInt[i] = rd.nextInt(21);
            for (int j = 0; j < i; j++) {
                if (randomInt[j] == randomInt[i]) {
                    i--;
                    break;
                }
            }
        }
        
        for (int i = 0; i < 10; i++)
            System.out.println(randomInt[i]);      
    }
    
}
