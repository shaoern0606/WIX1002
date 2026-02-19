package t6;

import java.util.Random;

public class T6Q1h {
    public static int firstRepeated() {
        Random rd = new Random();
        int[] array = new int[11];
        while (true) {
            int num = rd.nextInt(11);
            if (array[num] > 0) {
                return num;
            } else {
                array[num] = 1;
            }
        }
    }
            
    public static void main(String[] args) {
        System.out.println(firstRepeated());
    }
}
