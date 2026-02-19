package l7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L7Q4 {
    public static void main(String[] args) {
        int numChar = 0, numWord = 0, numLine = 0;
        
        try {
            Scanner in = new Scanner(new FileInputStream("Lab07/lecturer.txt"));
            while (in.hasNextLine()) {
                String line = in.nextLine();
                numChar += line.length();
                
                String[] words = line.split(" ");
                numWord += words.length;
                
                numLine++;
            }
            
            in.close();
            
            System.out.println("Number of characters: " + numChar);
            System.out.println("Number of words: " + numWord);
            System.out.println("Number of lines: " + numLine);
            
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }
        
    }
}
