package viva2;

import java.util.Scanner;

public class Q6myself {
    public static boolean isMirror(int[] a, int[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] != b[b.length - 1 - i])
                return false;
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
        System.out.print("Array A: ");
        String stringA = sc.nextLine();
        int[] arrayA = parseArray(stringA);
        
        System.out.print("Array B: ");
        String stringB = sc.nextLine();
        int[] arrayB = parseArray(stringB);
        
        boolean mirror = isMirror(arrayA, arrayB);
        
        System.out.println("Mirror pattern: " + mirror);
    }
}
