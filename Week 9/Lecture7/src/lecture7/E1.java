package lecture7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class E1 {
    public static void main(String[] args) {
        try {
            PrintWriter out = new PrintWriter (new FileOutputStream("currency.txt"));
            
            Map<String, Double> dictionary = new LinkedHashMap<>();
            
//            dictionary.put("USD", 0.245);
//            dictionary.put("EUR", 0.205);
//            dictionary.put("GBP", 0.184);
//            dictionary.put("AUD", 0.332);
//            dictionary.put("THB", 7.41);
//            
//            for (String currency : dictionary.keySet()) {
//                out.println(currency + " " + dictionary.get(currency));
//            }
//            
//            dictionary = new HashMap<>();
//            dictionary.put("USD", 0.245);
//            dictionary.put("EUR", 0.205);
//            dictionary.put("GBP", 0.184);
//            dictionary.put("AUD", 0.332);
//            dictionary.put("THB", 7.41);
//            
//
//            for (String currency : dictionary.keySet()) {
//                out.println(currency + " " + dictionary.get(currency));
//            }
            
            out.println("USD 0.245");
            out.println("EUR 0.205");
            out.println("GBP 0.184");
            out.println("AUD 0.332");
            out.println("THB 7.41");
            
            out.close();
            
            System.out.println("currency.txt created successfully!");

        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
    }
}
