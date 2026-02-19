package lecture7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class E2 {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> exchangeRates = new LinkedHashMap<>();
        
        try {
            BufferedReader in = new BufferedReader (new FileReader("currency.txt"));
            
            String line;
            
            while ((line = in.readLine()) != null) {
                String[] parts = line.split(" ");
                String currency = parts[0];
                double value = Double.parseDouble(parts[1]);
                exchangeRates.put(currency, value);
            }
            
            in.close();
        } catch (IOException e){
            System.out.println("Error reaeding from file");
        }
        
        Map<String, Integer> amountsInRM = new LinkedHashMap<>();
        amountsInRM.put("USD", 1234);
        amountsInRM.put("AUD", 456);
        amountsInRM.put("THB", 999);  
        
        for (Map.Entry<String, Integer> entry : amountsInRM.entrySet()) {
            String currency = entry.getKey();
            int rmAmount = entry.getValue();
            if (exchangeRates.containsKey(currency)) {
                double converted = rmAmount * exchangeRates.get(currency);
                System.out.println("RM " + rmAmount + " = " + currency + " " + converted);
            } else {
                System.out.println("No exchange rate found for " + currency);
            }
        }
    }
}
