/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q2;

import java.util.Random;

/**
 *
 * @author shaoern
 */
public class L3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        int randomInt = random.nextInt(6);
        switch(randomInt){
            case 0:
                System.out.println(randomInt + " is zero.");
                break;
            case 1:
                System.out.println(randomInt + " is one.");
                break;
            case 2:
                System.out.println(randomInt + " is two.");
                break;
            case 3:
                System.out.println(randomInt + " is three.");
                break;
            case 4:
                System.out.println(randomInt + " is four.");
                break;
            case 5:
                System.out.println(randomInt + " is five.");  
                break;
        }
        
    }
    
}
