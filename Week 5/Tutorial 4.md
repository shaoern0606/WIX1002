# Tutorial 4
## Question 1
### a.
```java
int n = 1;
while (Math.pow(n, 3) < 2000) {
    n++;
}
System.out.print("The largest integer is " + (n - 1));
```
### b.
```java
for (int i = 1; i < 13; i++)
    System.out.print(i*i + " ");
```
### c.
```java
import java.util.Random;
Random rd = new Random();
int randomNum;
for (int i = 0; i < 4; i++) {
    for (int j = 0; j < 5; j++) {
        randomNum = rd.nextInt(101);
        System.out.print(randomNum + " ");
    }
    System.out.println();
}
```
### d.
```java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int sum = 0;
System.out.print("Enter a number: ");
int number = sc.nextInt();
for (int i = 1; i <= number; i++) {
    sum+=i;
}
System.out.print("Sum: " + sum);
```
### e.
```java
double sum = 0;
for (int i=1; i<=25; i++)
    sum += (double)i/(26-i);
System.out.printf("the sum of the series %.2f", sum);
```

## Question 2
### a.
```java
for (int x = 10; x > 0; x--)
    sum += x;
```
### b.
```java
int x = 0;
int y = 0;
do {
    x += 2;
    y += x;
    System.out.println(x + " and " + y);
} while (x < 100);
```
### c.
```java
for (int x=1, y=20; x < y; x++, y-=2)
    System.out.println(x + " " + y);
```
### d.
```java
int i = 1;
while (i < 10){
    i++;
    if (i == 10)
        System.out.println("Program End");
}
```

## Question 3
```java
int f1 = 1;
int f2 = 1;
int fn = 0;
System.out.print(f1 + " " + f2 + " ");
for (int i = 3; i <= 10; i++) {
    fn = f1 + f2;
    f1 = f2;
    f2 = fn;
    System.out.print(fn + " ");
}
```
## Question 4
```java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string: ");
String string = sc.nextLine();
for (int i = string.length() - 1; i >= 0 ; i--) {
    System.out.print(string.charAt(i));
}
```