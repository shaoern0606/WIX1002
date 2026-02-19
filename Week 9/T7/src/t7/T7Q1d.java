package t7;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.EOFException;

public class T7Q1d {
    public static void main(String[] args) {
        int integer, sum = 0, count = 0;
        
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("integer.dat"));
            
            while (true) {
                integer = inputStream.readInt();
                System.out.println(integer);  
                sum += integer;
                count++;
            }

        } catch (EOFException e) {  
            double average = (double) sum / count;
            System.out.printf("Average: %.2f%n", average);
            
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
            
        } catch (IOException e) {
            System.out.println("Problem with file input");
        } 
    }
}
