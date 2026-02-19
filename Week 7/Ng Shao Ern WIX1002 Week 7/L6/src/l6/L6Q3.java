package l6;

import java.util.Arrays;

public class L6Q3 {
    public static int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int rev = 0;
            while (arr[i] != 0) {
                rev = rev * 10 + arr[i] % 10; 
                arr[i] /= 10;
            }
            arr[i] = rev;        
        }
        return arr;
    }
    
    public static void main(String[] args) {
        int[] array = {1234, 5687, 34, 54, 8769, 103, 293, 2193, 250, 941};
        int[] reverse = reverse(array);
        for (int n : reverse)
            System.out.println(n);
    }
}
