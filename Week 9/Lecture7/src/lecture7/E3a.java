package lecture7;

import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;

public class E3a {
    public static void main(String[] args) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("number.dat"));
            Random rd = new Random();
            int numRandom = rd.nextInt(11) + 20;
            for (int i = 0; i < numRandom; i++) {
                int number = rd.nextInt(91) + 10;
                out.writeInt(number);
            }
            out.close();   
            
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }    
        
    }
}
