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
#### Sample Answer
```java
public static double getMax(int a, int b, int c) {
    if (a>b)
        if (a>c)
            return a;
        else
            return c;
    else
        if (b>c)
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
#### Sample Answer
```java
public static boolean isSquare(int a) {
    int i=1;
    while (i*i<=a) {
        if (i*i==a)
            return true;
        i++;
    }
    return false;
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
#### Sample Answer
```java
public static double combination(int n, int k) {
    int nfact = 1, kfact = 1, nkfact = 1;
    for(int i=2; i<=n; i++)
        nfact*=i;
    for(int i=2; i<=k; i++)
        kfact*=i;
    for(int i=2; i<=n-k; i++)
        nkfact*=i;
    return  nfact / (double) (kfact*nkfact);
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
#### Sample Answer
```java
public static boolean isPentagonal(int num) {
    int pent = 1;
    int i = 1;

    while (pent < num) {
        i++;
        pent = i * (3 * i - 1) / 2;
    }
    return pent==num;
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
#### Sample Answer
```java
public static String wrapperChar(String s) {
    int letter = 0, digit = 0;

    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        if (Character.isLetter(ch)) {
            letter++;
        }
        if (Character.isDigit(ch)) {
            digit++;
        }
    }

    return "Letters: " + letter + ", Digits: " + digit;
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
#### Sample Answer
```java
public static void generate(int[] a) {
    final int MAX = 101;
    Random g = new Random();
    for (int i = 0; i < a.length; i++) {
        a[i] = g.nextInt(MAX);
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
#### Sample Answer
```java
public static void computeCircle(int r, double[] a) {
    a[0] = Math.PI * r * r;      // Area
    a[1] = 2 * Math.PI * r;      // Circumference
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
#### Sample Answer
```java
public static int firstDuplicateRandom() {
    Random rand = new Random();

    boolean[] seen = new boolean[11]; // track numbers 0–10
    int[] generated = new int[20];   // store generated numbers
    int count = 0;

    int num;

    while (true) {
        num = rand.nextInt(11);       // generate 0–10
        generated[count++] = num;

        if (seen[num]) {
            // Display generated numbers
            System.out.print("Generated numbers: ");
            for (int i = 0; i < count; i++) {
                System.out.print(generated[i] + " ");
            }
            System.out.println();

            return num; // first number generated twice
        }
        seen[num] = true;
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
#### Sample Answer
```java
public static void descending(int a, int b, int c) {
    if (a > b) {
        if (a > c && b >= c) {
            System.out.println(a + ", " + b + ", " + c);
        } else if (a > c && b < c) {
            System.out.println(a + ", " + c + ", " + b);
        } else {
            System.out.println(c + ", " + a + ", " + b);
        }
    } else {
        if (b > c && a >= c) {
            System.out.println(b + ", " + a + ", " + c);
        } else if (b > c && a < c) {
            System.out.println(b + ", " + c + ", " + a);
        } else {
            System.out.println(c + ", " + b + ", " + a);
        }
    }
}
```