package week10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Week10Myself {
    public static void main(String[] args) {
        int numLine = 0;
        
        try {
            Scanner in = new Scanner(new FileInputStream("book.txt"));
            while (in.hasNextLine()) {
                in.nextLine();
                numLine++;
            }
            in.close();
            
            String [] details = new String[numLine];
            Book [] b = new Book[numLine];
            int i = 0;
            Scanner in2 = new Scanner(new FileInputStream("book.txt"));
            while (in2.hasNextLine()) {
                details = in2.nextLine().split(",");
                b[i] = new Book(details[0], details[2], Integer.parseInt(details[1]), Double.parseDouble(details[3]));
                i++;
            }
            in2.close();
            System.out.println("The book details are :");
            for (i = 0; i < numLine; i++) {
                System.out.println(b[i].toString());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");    
        }

    }
}
