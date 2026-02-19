# Tutorial 8
## Question 1
### a.
```java
class Student {

}
```
### b.
```java
private String contactNumber;
```
### c.
```java
public Student() {
    contactNumber = null;
}
```
### d.
```java
public Student(String contactNumber) {
    this.contactNumber = contactNumber;
}
```
### e.
```java
public String getContactNumber() {
    return contactNumber;
}

public void setContactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
}
```
### f.
```java
public void printContactNumber {
    System.out.println("Contact Number: " + contactNumber);
}
```
### g.
```java
Student student1 = new Student();
```
### h.
```java
student1.setContactNumber("0123456789");
```
### i.
```java
Animal animal1 = new Animal();
```
#### Sample Answer
```java
Animal obj = new Animal();
```
### j.
```java
Animal cat = new Animal();
```
#### Sample Answer
```java
Animal obj = new Animal("Cat");
```
### k.
```java
Number number1 = new Number(20);
Number number2 = new Number(40);
```
#### Sample Answer
```java
Number obj = new Number(20, 40);
```

## Question 2
### a.
```java
class Digit {

}
```
### b.
```java
private int number;
```
### c.
```java
public Digit(int number) {
    this.number = number;
}
```
### d.
```java
public int digitMultiplication() {
    int n = number;
    int product = 1;
    while (n > 0) {
        product = product * (n % 10);
        n = n / 10;
    }
    return product;
}
```
### e.
```java
public void printDigitMultiplication() {
    System.out.println(digitMultiplication());
}
```
### f.
```java
public class Tester {
    public static void main(String[] args) {
        Digit digit = new Digit(4567);
        digit.printDigitMultiplication();
    }
}
```

## Question 3
```java
class Coordinate {
    private int x;
    private int y;

    public Coordinate() {
        this.x = 0;
        this.y = 0;
    }

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void printCoordinate() {
        System.out.println("(" + x + ", " + y + ")");
    }
}
```

## Question 4
```java
package t8;

class Payment {
    public void pay(double amount) {
        System.out.printf("Cash Payment: RM%.2f%n" ,amount);
    }
    
    public void pay(double amount, String chequeNumber) {
        System.out.printf("Cheque Payment: RM%.2f%n", amount);
        System.out.println("Cheque Number: " + chequeNumber);
    }
    
    public void pay(double amount, String cardHolderName, String cardType, String expirationDate, String validationCode) {
        System.out.printf("Credit Card Payment: RM%.2f%n" , amount);
        System.out.println("Card Holder Name: " + cardHolderName);
        System.out.println("Card Type: " + cardType);
        System.out.println("Expiration Date: " + expirationDate);
        System.out.println("Validation Code: " + validationCode);
    }
}
```
#### Sample Answer
```java
public class Payment {

   private double amount;
   private String chequeNumber, cardHolderName, cardType;
   private int validationCode;

   public void payBy(double a) {
       amount = a;
       System.out.println("Total pay by cash is " + amount);
   }

   public void payBy(double a, String c) {
       amount = a;       
       chequeNumber = c;
       System.out.println("Total pay by cheque is " + amount);
       System.out.println("Cheque number : " + chequeNumber);
   }


   public void payBy(double a, String c, String ct, int vc) {
       amount = a; 
       cardHolderName = c;
       cardType = ct; 
       validationCode = vc;
       
       System.out.println("Total pay by credit card is " + amount);
       System.out.println("Credit Card number : " + chequeNumber);
       System.out.println("Card Type : " + cardType);
       System.out.println("Validation Code : " + validationCode);
   }
}
```
```java
System.out.println("Answer for Question 4:");
// Create Payment object
Payment pay = new Payment();

// 1. Pay by cash
pay.payBy(500.0);
System.out.println();

// 2. Pay by cheque
pay.payBy(750.0, "CHQ123456");
System.out.println();

// 3. Pay by credit card
pay.payBy(1200.0, "John Doe", "VISA", 987);
System.out.println();
```

## Question 5
```java
class Connection {
    private static int count = 0;
    
    public Connection() {
        count++;
    }
    
    public void disconnect() {
        count--;
    }
    
    public static void display() {
        System.out.println(count);
    }
}
```