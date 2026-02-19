# Tutorial 7
## Question 1
### a.
```java
import java.util.Random;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

Random rd = new Random();
int randomInt;

try {
    PrintWriter outputStream = new PrintWriter(new FileOutputStream("integer.txt"));
    for (int i = 0; i < 10; i++) {
        randomInt = rd.nextInt(1001);
        outputStream.println(randomInt); 
    } 

    outputStream.close();
    System.out.println("Random integers written to integer.txt"); 

} catch (IOException e) {
    System.out.println("Problem with file output");
}
```
### b.
```java
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

int integer, largest = Integer.MIN_VALUE;

try {
    Scanner inputStream = new Scanner(new FileInputStream("integer.txt"));
    while (inputStream.hasNextInt()) {
        integer = inputStream.nextInt();
        System.out.println(integer);  
        if (integer > largest) {
            largest = integer;
        }
    }
    inputStream.close();
} catch (FileNotFoundException e) {
    System.out.println("File was not found");
}
System.out.println("Largest: " + largest);
```
### c.
```java
import java.util.Random;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

Random rd = new Random();
        int randomInt;
        
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("integer.dat"));
            for (int i = 0; i < 10; i++) {
                randomInt = rd.nextInt(1001);
                outputStream.writeInt(randomInt); 
            } 
            
            outputStream.close();
            System.out.println("Random integers written to integer.dat");
            
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }   
```
### d.
```java
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.EOFException;

int integer, sum = 0, count = 0;

try {
    ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("integer.dat"));
    
    while (true) {
        integer = inputStream.readInt();
        System.out.println(integer);  
        sum += integer;
        count++;
    }

} catch (EOFException e) {  
    double average = (double) sum / count;
    System.out.printf("Average: %.2f%n", average);
    
} catch (FileNotFoundException e) {
    System.out.println("File was not found");
    
} catch (IOException e) {
    System.out.println("Problem with file input");
} 
```

## Question 2
### a.
```java
PrintWriter out = new PrintWriter(new FileOutputStream("d:\\data\\matrix.txt"));
```
#### Sample Answer
```java
PrintWriter out = new PrintWriter(new FileOutputStream ("d:/data/matrix.txt"));
```
### b.
```java
try {
    PrintWriter out = new PrintWriter(new FileOutputStream("data.txt"));
    out.close();
} catch (IOException e) {
    System.out.println("Problem with file output");
}
```
### c.
```java
int num;
ObjectInputStream a = new ObjectInputStream(new FileInputStream("data.dat"));
num = a.readInt();
a.close();
```
### d.
```java
ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("data.dat"));
o.writeChar('A');
o.close();
```

## Question 3
```java
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class T7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream("data.txt"));
            for (int i = 0; i < sentence.length(); i++) {
                int decimal = sentence.charAt(i);
                String binary = "";
                int bit;
                for (int j = 0; j < 8; j++) {
                    bit = decimal % 2;
                    decimal = decimal / 2;
                    binary = bit + binary;
                }
                out.println(binary);
            }
            out.close();
            System.out.println("Binary data written to data.txt");

        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
        
        try {
            Scanner in = new Scanner(new FileInputStream("data.txt"));
            String recovered = "";
            while (in.hasNextLine()) {
                String bin = in.nextLine();
                int ascii = Integer.parseInt(bin, 2);
                recovered = recovered + (char)ascii;
                
            }
            
            in.close();
            System.out.println("Recovered sentence: " + recovered);
            
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }
        
    }
}
```
#### Sample Answer
```java
String str = "Introduction to Java Programming!";
byte[] bytes = str.getBytes();
try {
    PrintWriter outputStream3 = new PrintWriter(new FileOutputStream("data.txt"));
    for (byte b : bytes) {
        int val = b;
        for (int i = 0; i < 8; i++) {
            if ((val & 128) == 0) {
                outputStream3.print("0");
            } else {
                outputStream3.print("1");
            }
            val <<= 1;
        }
    }
    outputStream3.close();
} catch (IOException e) {
    System.out.println("Problem with file output");
}

System.out.print("The sentence is :");

try {
    Scanner inputStream3 = new Scanner(new FileInputStream("data.txt"));
    String temp, str1 = "";
    if (inputStream3.hasNext()) {
        temp = inputStream3.next();
        for (int i = 0; i < temp.length() / 8; i++) {
            int a = Integer.parseInt(temp.substring(8 * i, (i + 1) * 8), 2);
            str1 += (char) (a);
        }
        System.out.println(str1);
    }
    inputStream3.close();
} catch (FileNotFoundException e) {
    System.out.println("File was not found");
}
```