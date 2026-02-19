/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author shaoern
 */
public class L5Q5 {
    
    public static void main(String[] args) {
        
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("A list of 20 random integer within 0 to 100");
        int[] integer = new int[20];
        for (int i = 0; i < 20; i++) {
            integer[i] = rd.nextInt(101);
            System.out.print(integer[i] + " ");
        }
        
        System.out.println("\nArray in descending order");
        int temp;
        for (int i = 0; i < integer.length - 1; i++) {
            for (int j = 0; j < integer.length - i - 1; j++) {
                if (integer[j+1] > integer[j]) {
                    temp = integer[j];
                    integer[j] = integer[j+1];    
                    integer[j+1] = temp;
                }    
            }
        }
        
        for (int i = 0; i < 20; i++) {
            System.out.print(integer[i] + " ");
        }
        
        System.out.print("\nEnter a number to search: ");
        int search = sc.nextInt();
        
        int numLoop = 0;
        boolean found = false;
        for (int i = 0; i < 20; i++) {
            if (integer[i] == search) {      
                System.out.println(search + " found");
                found = true;
                break;
            }
            numLoop++;
        }
        
        if (!found) 
            System.out.println(search + " not found");
        
        if (found)
            System.out.println("Linear Search - " + numLoop + " loop(s)");
        
        numLoop = 1;
        found = false;
        int low = 0;
        int high = integer.length - 1;
        int middle;
        while (low <= high) {
            middle = (low + high) / 2;
            if (search == integer[middle]) {
                System.out.println(search + " found");
                found = true;
                break;
            }
            else if (search > integer[middle])
                high = middle - 1;
            else
                low = middle + 1;
            numLoop++;
        }
        
        if (!found) 
            System.out.println(search + " not found");
        
        if (found)           
            System.out.println("Binary Search - " + numLoop + " loop(s)");
            
    }
    
}
