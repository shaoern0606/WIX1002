# Tutorial 6
## Question 1
### a.
```java
public static int maximum(int a, int b, int c) {
    if (a > b && a > c)
        return a;
    else if (b > a && b > c)
        return b;
    else
        return c;
}
```
### b
```java
public static boolean isSquareNumber(int n) {
    if (n <= 0)
        return false;
    int sqrt = (int) Math.sqrt(n);    
    return sqrt * sqrt == n;
}
```
### c.
```java
public static int combination(int n, int k) {
    int nFactorial = 1;
    int kFactorial = 1;
    int nMinuskFactorial = 1;
    for (int i = n; i > 0; i--) {
        nFactorial *= i;
    }
    for (int i = k; i > 0; i--) {
        kFactorial *= i;
    }
    for (int i = n - k; i > 0; i--) {
        nMinuskFactorial *= i;
    }
    return (nFactorial / (kFactorial * nMinuskFactorial));
}
```
### d.
```java
public static boolean isPentagonal (int n) {
    if (n <= 0)
        return false;
    double num = (1 + Math.sqrt(1 + 24 * n)) / 6;
    return num == (int)num;
}
```
### e.
```java
public static void countLettersDigits(String str) {
    int letters = 0;
    int digits = 0;
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (Character.isLetter(ch))
            letters++;
        else if (Character.isDigit(ch))
            digits++;
    }
    System.out.println("Letters: " + letters);
    System.out.println("Digits: " + digits);
}
```
### f.
```java
import java.util.Random;
public static void generateRandomNum(int[] array) {
    Random rd = new Random ();
    int[] randomNum = new int[10];
    for (int i = 0; i < 10; i++) {
        array[i] = rd.nextInt(101);
    }
}
```
### g.
```java
public static void areaCircumference(double r) {
    double area = Math.PI * r * r;
    double circumference = 2 * Math.PI * r;
    System.out.printf("Area: %.2f%n",area);
    System.out.printf("Circumference: %.2f%n", circumference);
}
```
### h.
```java
public static int firstRepeated() {
    Random rd = new Random();
    int[] array = new int[11];
    while (true) {
        int num = rd.nextInt(11);
        if (array[num] > 0) {
            return num;
        } else {
            array[num] = 1;
        }
    }
}
```

## Question 2
```java
public static void decreasing(int a, int b, int c) {
    int max = Math.max(Math.max(a, b), c);
    int min = Math.min(Math.min(a, b), c);
    int mid = a + b + c - max - min;
    System.out.println(max + " " + mid + " " + min);
}
```