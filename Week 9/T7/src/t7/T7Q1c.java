package t7;

import java.util.Random;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

public class T7Q1c {
    public static void main(String[] args) {
        Random rd = new Random();
        int randomInt;
        
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("integer.dat"));
            for (int i = 0; i < 10; i++) {
                randomInt = rd.nextInt(1001);
                outputStream.writeInt(randomInt); 
            } 
            
            outputStream.close();
            System.out.println("Random integers written to integer.dat");
            
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }   
    }
}
