
package l10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public interface MessageEncoder {
    public abstract String encode(String plainText);
    public abstract String decode(String cipherText);
    
    public void encodeFile();
    public void decodeFile();        
}
