package l10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class ShuffleCipher implements MessageEncoder {
    private String inputFileName;
    private String outputFileName;
    private int N;
    
    public ShuffleCipher(String inputFileName, String outputFileName, int N) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        this.N = N;
    }
    
    public String encode(String plainText) {
        String cipherText = "";
        String temp = plainText;
        for (int n = 0; n < N; n++) {
            int middle = temp.length() / 2;
            String firstPart = temp.substring(0, middle);
            String secondPart = temp.substring(middle);
           
            for (int i = 0; i < plainText.length()/2; i++) {
                cipherText += firstPart.charAt(i);
                cipherText += secondPart.charAt(i);
            }
           
            if (secondPart.length() > firstPart.length()) {
                cipherText += secondPart.charAt(secondPart.length()-1);
            }
            
            temp = cipherText;
            cipherText = ""; 
        }
        return temp.toString();
    }

    public String decode(String cipherText) {
        String firstPart = "";
        String secondPart = "";
        for (int n = 0; n < N; n++) {
            for (int i = 0; i < cipherText.length()-1; i+=2) {
                firstPart += cipherText.charAt(i);
                secondPart += cipherText.charAt(i+1);
            }
           
            if (cipherText.length() % 2 != 0) {
                secondPart += cipherText.charAt(cipherText.length()-1);
            }
            
            cipherText = firstPart + secondPart;
            firstPart = "" ;
            secondPart = "";
        }
        return cipherText.toString();
    }
    
    public void encodeFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName));
            String line;
            while ((line = br.readLine()) != null) {
                String encodedLine = encode(line);
                bw.write(encodedLine);
                bw.newLine();
            }
            br.close();
            bw.close();
        } catch (FileNotFoundException e){
            System.out.println("File was not found");
        } catch (IOException e) {
            System.out.println("Error reading from file");
        }
    }
    
    public void decodeFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName));
            String line;
            while ((line = br.readLine()) != null) {
                String decodedLine = decode(line);
                bw.write(decodedLine);
                bw.newLine();
            }
            br.close();
            bw.close();
        } catch (FileNotFoundException e){
            System.out.println("File was not found");
        } catch (IOException e) {
            System.out.println("Error reading from file");
        }
    }
}

public class L10Q3 {
    public static void main(String[] args) {
        MessageEncoder encrypt = new ShuffleCipher("PlainText3.txt", "EncryptText3.txt", 2);
        encrypt.encodeFile();
        MessageEncoder decrypt = new ShuffleCipher("EncryptText3.txt", "PlainText4.txt", 2);
        decrypt.decodeFile();
    }
}
