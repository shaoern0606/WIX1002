# Tutorial 3
## Question 1
### a.
```java
int a = 3;
int b = 8;
int product = a * b;
if (product == 27)
    ystem.out.print("True");
else
    System.out.print("False");
```
### b.
```java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
System.out.print("Enter an integer: ");
int integer = input.nextInt();
if (integer % 2 == 0) 
    System.out.print("Even number");
else
    System.out.print("Odd number");
```
### c.
```java
import java.util.Scanner;
System.out.print("Enter a character: ");
Scanner input = new Scanner(System.in);
char character = input.next().charAt(0);
System.out.print(Character.isUpperCase(character));
// if (character >= 'a' && character <= 'z')  
//    System.out.print("The letter is in lowercase");
//else
//    System.out.print("The letter is in lowercase");
```
### d.
```java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
System.out.print("Enter first string: ");
String s1 = input.nextLine();
System.out.print("Enter second string: ");
String s2 = input.nextLine();
if (s1.compareToIgnoreCase(s2) < 0)
    System.out.print(s1 + " " + s2);
else if (s1.compareToIgnoreCase(s2) > 0)
    System.out.print(s2 + " " + s1);
else
    System.out.print("Both strings are the same");
```
### e.
```java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
System.out.print("Enter day number from 0 to 6: ");
int day = input.nextInt();
switch (day){
    case 0:
        System.out.print("Sunday");
        break;
    case 1:
        System.out.print("Monday");
        break;
    case 2:
        System.out.print("Tuesday");
        break;
    case 3:
        System.out.print("Wednesday");
        break;
    case 4:
        System.out.print("Thursday");
        break;
    case 5:
        System.out.print("Friday");
        break;
    case 6:
        System.out.print("Saturday");
        break;
    default:
        System.out.print("Please enter a valid number within 0 to 6");

}
```

## Question 2
### a.
```java
if (num1 == num2)
    System.out.println("Number 1 is equal to number 2.");
```
### b.
```java
if (x > y && x > z）
    System.out.println("x is the largest number");
```
### c.
```java
String s1, s2;
if (s1.equals(s2))
    System.out.println("They are equal strings.");
else
    System.out.println("They are not equal strings.");
```
### d.
```java
if (x > 0 || y > 0)
    System.out.println("Either x or y is positive");
```

## Question 3
### a.
```
#####
$$$$$
```
### b.
```
#####
$$$$$
```
### c.
```
#####
```
### d.
```
No output
```

## Question 4
```java
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        if (num1 > num2 && num1 > num3)
            System.out.print(num1 + "is the biggest number");
        else if (num2 > num1 && num2 > num3)
            System.out.print(num2 + "is the biggest number");
        else
            System.out.print(num3 + "is the biggest number");
    }
}
```
## Question 5
```java
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0))
            System.out.print(year + "is a Leap year");
        else
            System.out.print(year + "is not a Leapyear");
    }
}
```