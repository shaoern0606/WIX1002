package lecture7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class E3b {
    public static void main(String[] args) {
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        
        try {
            ObjectInputStream in = new ObjectInputStream (new FileInputStream("number.dat"));
            while (true) {
                int number = in.readInt();
                System.out.print(number + " ");
                if (number > maximum)
                    maximum = number;
                if (number < minimum)
                    minimum = number;
            }
            
        } catch (EOFException e) {
            System.out.println("\nThe Maximum number is " + maximum);
            System.out.println("The Minimum number is " + minimum);
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        } catch(IOException e) {
            System.out.println("Problem with file input");
        }
        
    }
}
