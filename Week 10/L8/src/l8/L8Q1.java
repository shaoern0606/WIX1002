package l8;

import java.util.Random;

class Number {
    Random rd = new Random();
    private int[] numbers;
    
    public Number () {
        numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = rd.nextInt(101);
        }
    }
    
    public Number (int length) {
        numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = rd.nextInt(101);
        }
    }
    
    public Number (int length, int upperRange) {
        numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = rd.nextInt(upperRange+1);
        }
    }
    
    public void all() {
        System.out.print("All items of the array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    
    public void even() {
        System.out.print("Even number: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }
    
    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public void prime() {
        System.out.print("Prime numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }
    
    public void maximum() {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum number: " + max);
    }
    
    public void minimum() {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Minimum number: " + min);
    }
    
    public void average() {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
        }
        double average = (double) sum / numbers.length;
        System.out.printf("Average: %.2f%n", average);
    }
    
    public boolean isSquare(int n) {
        if ( (int)(Math.sqrt(n)) == Math.sqrt(n) ) {
            return true;
        } 
        return false;
    }
    
    public void square() {
        boolean none = true;
        System.out.print("Square number: ");
        for (int i = 0; i < numbers.length; i++) {
            if (isSquare(numbers[i])) {
                System.out.print(numbers[i] + " ");
                none = false;
            }
        }
        
        if (none) {
            System.out.print("None");
        }
        System.out.println();
    }
}

public class L8Q1 {
    public static void main(String[] args) {
        Number a = new Number(); // generate 10 random integers within 0 to 100.
        Number b = new Number(5); // generate 5 random integers within 0 to 100.
        Number c = new Number(4, 50); // generate 4 random integers within 0 to 50.
    
        a.all();
        a.even();
        a.prime();
        a.maximum();
        a.minimum();
        a.average();
        a.square();
        
        System.out.println();
        
        b.all();
        b.even();
        b.prime();
        b.maximum();
        b.minimum();
        b.average();
        b.square();
        
        System.out.println();
        
        c.all();
        c.even();
        c.prime();
        c.maximum();
        c.minimum();
        c.average();
        c.square();
        
    }
}