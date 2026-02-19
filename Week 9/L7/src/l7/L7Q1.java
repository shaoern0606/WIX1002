package l7;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class L7Q1 {
    public static void main(String[] args) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("coursename.dat"));

            out.writeUTF("WXES1116");
            out.writeUTF("Programming I");

            out.writeUTF("WXES1115");
            out.writeUTF("Data Structure");

            out.writeUTF("WXES1110");
            out.writeUTF("Operating System");

            out.writeUTF("WXES1112");
            out.writeUTF("Computing Mathematics I");
            
            out.close();
                
        } catch (IOException e) {
            System.out.println("Problem with file output");
        } 
        
        boolean found = false;
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("coursename.dat"));
                
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a course code: ");
            String courseCode = sc.next();
             
            while (true) {
                String code = in.readUTF();
                String name = in.readUTF();

                if (code.equalsIgnoreCase(courseCode)) {
                    System.out.println("Course Name: " + name);
                    found = true;
                }
            }
            
        } catch (EOFException e) {
            if (!found)
                System.out.println("Course was not found");
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        } catch (IOException e) {
            System.out.println("Problem with file input");
        }
 
    }
}    