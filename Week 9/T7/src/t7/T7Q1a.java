package t7;

import java.util.Random;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class T7Q1a {
    public static void main(String[] args) {
        Random rd = new Random();
        int randomInt;
        
        try {
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("integer.txt"));
            for (int i = 0; i < 10; i++) {
                randomInt = rd.nextInt(1001);
                outputStream.println(randomInt); 
            } 
            
            outputStream.close();
            System.out.println("Random integers written to integer.txt");
            
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }   
    }
}
