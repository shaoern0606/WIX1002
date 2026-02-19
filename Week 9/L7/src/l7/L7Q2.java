package l7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.net.URL;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URLConnection;

public class L7Q2 {
    public static void main(String[] args) {
        try {
            URL u = new URL("https://fsktm.um.edu.my/");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);
            
            PrintWriter out = new PrintWriter(new FileOutputStream("index.htm"));
            while (in.hasNextLine()) {
                out.println(in.nextLine());
            }
            
            in.close();
            out.close();
            
        } catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }
            
    }
}
