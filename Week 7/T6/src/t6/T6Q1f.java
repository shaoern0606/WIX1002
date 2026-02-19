package t6;

import java.util.Random;

public class T6Q1f {
    public static void generateRandomNum(int[] array) {
        Random rd = new Random ();
        int[] randomNum = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = rd.nextInt(101);
        }
    }
    
    public static void main(String[] args) {
        int[] array = new int[10];
        generateRandomNum(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
