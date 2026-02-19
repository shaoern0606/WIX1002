package viva2;

import java.util.Scanner;

public class Q6 {
    public static boolean isMirror (int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[a.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
    
    public static int[] parseArray(String line) {
        String[] parts = line.split(",");
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i].trim());
        }
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       int[] arrayA;
       int[] arrayB;
        
        do {
            System.out.print("Array A: ");
            String inputA = sc.nextLine();
            arrayA = parseArray(inputA);
            
            System.out.print("Array B: ");
            String inputB = sc.nextLine();
            arrayB = parseArray(inputB);
            
            if (arrayA.length != arrayB.length) {
                System.out.println("Please enter arrays with the same length.");
            }
            
        } while (arrayA.length != arrayB.length);
        
        System.out.println("Mirror pattern: " + isMirror(arrayA, arrayB));
    }
}