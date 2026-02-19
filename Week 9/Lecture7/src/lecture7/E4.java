package lecture7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        // Creates a File object pointing to a folder named FilesFolder
        File folder = new File("FilesFolder");
        // Gets an array of all files and directories inside FilesFolder
        File[] listOfFiles = folder.listFiles();
        
        // Checks whether the folder exists and is not empty
        if (listOfFiles != null) {
            // Loops through each file or folder inside FilesFolder
            for (File file : listOfFiles) {
                
                if (file.isFile()) {
    
                    if (file.getName().endsWith(".txt") || file.getName().endsWith(".csv")) {
                        System.out.println("Reading file: " + file.getName());
                        try {
                            Scanner sc = new Scanner(file);
                            while (sc.hasNextLine()) {
                                String line = sc.nextLine();
                                System.out.println(line); // Print each line
                            }
                            sc.close();
                            
                        } catch (FileNotFoundException e) {
                            System.out.println("Cannot read file: " + file.getName());
                        }
                    }
                }
            }
        } else {
            System.out.println("The directory is empty or not a directory.");
        }
    }
}
