package l7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class L7Q3 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new FileInputStream("Lab07/order.txt"));
            PrintWriter out = new PrintWriter(new FileOutputStream("reverse.txt"));
            while (in.hasNextLine()) {
                String line = in.nextLine();
                StringBuilder reversedBuilder = new StringBuilder(line);
                String reversed = reversedBuilder.reverse().toString();
                out.println(reversed);
            } 
            
            in.close();
            out.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
            
        } catch (IOException e) {
            System.out.println("Error reading from file");
        }
    }
}
