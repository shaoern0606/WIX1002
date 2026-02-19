# Tutorial 5
## Question 1
### a.
```java
float[] arrayA = new float[12];
```
### b.
```java
char[] arrayB = {'A', 'B', 'C', 'D', 'E'};
```
### c.
```java
String[] arrayC = new String[100];
```
### d.
```java
int[][] arrayD = new int[6][2];
```
### e.
```java
int[][] arrayE = {{6, 9}, {2, 5}, {4, 6}};
```
### f.
```java
arrayE[1][1] = 4;
arrayE[2][0] = 3;
arrayE[2][1] = 7;
```
### g.
```java
for (int i = 0; i < contact.length; i++)
    System.out.println(contact[i]);
```

## Question 2
### a.
```java
String[] code = {"AAA", "AAB", "AAC", "AAD"};
```
### b.
```java
int[] num = new num[10];
for(int k = 0; k <= num.length; k++)
    num[k] = k;
    sum += num[k];
```
### c.
```java
int[][] t = new int[3][];
t[1] = new int[3];
t[1][2] = 5;
```
### d.
```java
int i = 4;
int[] score = new int[5];
score[1] = 78;
score[i++] = 100;
```
### Sample Answer
```java
int i = 4;
int[] score = new int[5];
score[1] = 78;

if (i < score.length) {
    score[i] = 100;
}
```java

## Question 3
```java
int[] marks = new int[5]; // [0, 0, 0, 0, 0]
int i = 0, j = 1;
marks[i] = 12; // [12, 0, 0, 0, 0]
marks[j] = marks[i] + 19; // [12, 31, 0, 0, 0]
marks[j-1] = marks[j] * marks [j]; // [961, 31, 0, 0, 0]
marks[j*3] = marks[i+1]; // [961, 31, 0, 31, 0]
marks[++j] = marks[i]%5; // [961, 31, 1, 31, 0]
marks[2*j] = marks[j-1]; // [961, 31, 1, 31, 31]
```
```
marks[0] = 961
marks[1] = 31
marks[2] = 1
marks[3] = 31
marks[4] = 31
```

## Question 4
```java
String sentence = "The sun is bigger than the Earth";
String[] arraySentence = sentence.split(" ");
int count = 0;
for (int i = 0; i < arraySentence.length; i++) {
    if (arraySentence[i].equals("the"))
        count++;
}
System.out.println("The number of occurrence of the word \"the\" is " + count);
```
#### Sample Answer
```java
String[] sentence = {
    "the quick brown fox",
    "jumped over the lazy dog",
    "The word the is common"
};

int cnt = 0, index;

for (int i4 = 0; i4 < sentence.length; i4++) {
    index = 0;
    while ((index = sentence[i4].indexOf("the", index)) != -1) {
        cnt++;
        index++;
    }
}
```

## Question 5
```java
String sentence = "The sun is bigger than the Earth";
String[] arraySentence = sentence.split(" ");
for (int i = arraySentence.length - 1; i >= 0; i--) {
    for (int j = arraySentence[i].length() - 1; j >= 0; j--)
        System.out.print(arraySentence[i].charAt(j));
    System.out.print(" ");
}
```
### Sample Answer
```java
System.out.println("\nReversed sentences:");
for (int i5 = sentence.length - 1; i5 >= 0; i5--) {
    for (int j5 = sentence[i5].length() - 1; j5 >= 0; j5--) {
        System.out.print(sentence[i5].charAt(j5));
    }
    System.out.println();
}
```

## Question 6
```java
import java.util.Random;
Random rd = new Random();
int decimal = rd.nextInt(256);
System.out.println("Decimal: " + decimal);

int[] bits = new int[8];
for (int i = 7; i >= 0; i--) {
    bits[i] = decimal % 2;
    decimal = decimal / 2;
}

System.out.println("Binary: ");
for (int i = 0; i < 8; i++) {
    System.out.print(bits[i]);
}
```
### Sample Answer
```java
Random rand = new Random();
int input = rand.nextInt(256); // 0–255

boolean[] bits = new boolean[8];

for (int i6 = 7; i6 >= 0; i6--) {
    bits[7 - i6] = (input & (1 << i6)) != 0;
}

System.out.print("\n" + input + " in binary = ");
for (boolean bit : bits) {
    System.out.print(bit ? "1" : "0");
}
System.out.println();
```