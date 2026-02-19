package t7;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class T7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream("data.txt"));
            for (int i = 0; i < sentence.length(); i++) {
                int decimal = sentence.charAt(i);
                String binary = "";
                int bit;
                for (int j = 0; j < 8; j++) {
                    bit = decimal % 2;
                    decimal = decimal / 2;
                    binary = bit + binary;
                }
                out.println(binary);
            }
            out.close();
            System.out.println("Binary data written to data.txt");

        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
        
        try {
            Scanner in = new Scanner(new FileInputStream("data.txt"));
            String recovered = "";
            while (in.hasNextLine()) {
                String bin = in.nextLine();
                int ascii = Integer.parseInt(bin, 2);
                recovered = recovered + (char)ascii;
                
            }
            
            in.close();
            System.out.println("Recovered sentence: " + recovered);
            
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }
        
    }
}
