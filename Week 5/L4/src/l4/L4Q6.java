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
public class L4Q6 {
    public static void main(String[] args) {
        Random random = new Random();
        int integer = random.nextInt(Integer.MAX_VALUE);
        int i;
        int digit = 0;
        for (i = integer; i > 0; i/=10) {
            digit++;
        }
        System.out.println("Integer: " + integer);
        System.out.println("Number of digit: " + digit);
//        String strInteger = String.valueOf(integer);
//        System.out.println("Integer: " + integer);
//        System.out.println("Number of digit: " + strInteger.length());
    }
}
