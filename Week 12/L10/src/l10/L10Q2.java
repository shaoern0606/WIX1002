package l10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class SubstitutionCipher implements MessageEncoder{
    private String inputFileName;
    private String outputFileName;
    private int shift;
    
    public SubstitutionCipher(String inputFileName, String outputFileName, int shift) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        this.shift = shift;
    }
    
    public String encode(String plainText) {
        StringBuilder cipherText = new StringBuilder();
        for (char c : plainText.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                cipherText.append((char)((c - 'a' + shift) % 26 + 'a'));
            } else if (c >= 'A' && c <= 'Z') {
                cipherText.append((char)((c - 'A' + shift) % 26 + 'A'));
            } else {
                cipherText.append(c);
            }
        }
        return cipherText.toString();
    }

    public String decode(String cipherText) {
        StringBuilder plainText = new StringBuilder();
        for (char c : cipherText.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                plainText.append((char)((c - 'a' + (26 - shift)) % 26 + 'a'));
            } else if (c >= 'A' && c <= 'Z') {
                plainText.append((char)((c - 'A' + (26 - shift)) % 26 + 'A'));
            } else {
                plainText.append(c);
            }
        }
        return plainText.toString();
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

public class L10Q2 {
    public static void main(String[] args) {
        MessageEncoder encrypt = new SubstitutionCipher("PlainText1.txt", "EncryptText1.txt", 4);
        encrypt.encodeFile();
        MessageEncoder decrypt = new SubstitutionCipher("EncryptText1.txt", "PlainText2.txt", 4);
        decrypt.decodeFile();
    }
}
