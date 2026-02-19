/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author shaoern
 */
public class L5Q5alternative {
    public static void main(String[] args) {
        System.out.println("A list of 20 random integers within 0 and 100");
        int[] arr = new Random().ints(20, 0, 100).toArray();
        printArray(arr);
        
        System.out.println("Array is descending order");
        reverse(arr);
        printArray(arr);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int x = scanner.nextInt();
        scanner.close();
        
        Arrays.sort(arr);
        linearSearch(arr, x);
        binarySearch(arr, x);
    }
}
