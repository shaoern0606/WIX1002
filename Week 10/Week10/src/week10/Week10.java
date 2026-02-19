package week10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Week10 {

    public static void passbyReference(Restaurant a) {
        a.setName("New Name");
    }
    
    public static void main(String[] args) {
        // Tester class - class with main method
        // System.out.println("Encapsulation - Class");
/*
        // create objects from the class
        // object without argument, 
        Restaurant a = new Restaurant();
        Restaurant b = new Restaurant();
        // set value using mutator
        a.setName("ABC");
        a.setAddress("KL");
        a.setNumOfEmployee(10);
        b.setName("CDE");
        b.setAddress("PJ");
        b.setNumOfEmployee(5);
        
        // get value using accessor
        // System.out.println(a.getName() + " " + a.getAddress());
        // System.out.println(b.getName()); 
        
        // display the object profile
        System.out.println(a.toString());
        System.out.println(b.toString());
                
        // create objects from the class
        // object with argument 
        Restaurant c = new Restaurant("AAA", "Melaka", 20);
        Restaurant d = new Restaurant("MMM", "", 10);
        d.setAddress("Kepong");
        
        // display the object profile
        System.out.println(c.toString());
        System.out.println(d.toString());
        
        // object is reference data type
        // method with the object argument
        Restaurant f = c;
        f.setName("KKK");
        System.out.println(c.getName());
        
        passbyReference(f);
        System.out.println(c.getName());
        
        // array of object
        Restaurant[] r = new Restaurant[3]; 
        r[0] = new Restaurant("M", "PJ", 12);
        r[1] = new Restaurant("N", "KL", 15);
        r[2] = new Restaurant("W", "Perak", 22);
        
        System.out.println(r[1].toString());
        
        */

        // write a program to create the Book class
        // the attribute values of the class is stored 
        // in a text file named book.txt
        int cnt=0;
        Book[] b=null;
        try {
            Scanner in = new Scanner(new FileInputStream("book.txt"));
            while (in.hasNextLine()) {
               in.nextLine();
               cnt++;
            }
            in.close();      
            b = new Book[cnt];
            in = new Scanner(new FileInputStream("book.txt"));
            int i=0;
            while (in.hasNextLine()) {
               String[] data = in.nextLine().split(",");
               b[i]=new Book(data[0], data[2], Integer.parseInt(data[1])
                    , Double.parseDouble(data[3]));
               i++;
            }
            in.close();  
            for(i=0; i<b.length; i++) {
                System.out.println(b[i].toString());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File was not found"); 
        }
       
        
        // object with static variable
        // calling static method in class
        b[2].setUNI("UKM");
        b[1].setUNI("USM");
        System.out.println(Book.getUNI());
        
        int[] num = new int[10];
        int[] num1 =num.clone();
        
        // Book b1 = b[2]; - reference data type, 
        
        // usage of copy constructor, create a new copy of object b[2]
        Book b1 = new Book(b[2]);
        b1.setPublisher("Ang");
        System.out.println(b[2].getPublisher());
    }
    
}

/*

    //copy constructor
    public Restaurant(Restaurant a) {
        if (a!=null) {
            name = a.getName();
            address = a.getAddress();
            numOfEmployee=a.getNumOfEmployee();
        }
    }
    
        



*/