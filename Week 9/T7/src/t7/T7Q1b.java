package t7;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class T7Q1b {
    public static void main(String[] args) {
        int integer, largest = Integer.MIN_VALUE;
        
        try {
            Scanner inputStream = new Scanner(new FileInputStream("integer.txt"));
            while (inputStream.hasNextInt()) {
                integer = inputStream.nextInt();
                System.out.println(integer);  
                if (integer > largest) {
                    largest = integer;
                }
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }
        System.out.println("Largest: " + largest);
    }
}
