package l8;

class Fraction {
    private int numerator;
    private int denominator;
    
    public Fraction () {
        this.numerator = 0;
        this.denominator = 1;
    }
    
    public Fraction (int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.denominator = denominator;
    }
    
    public int getNumerator() {
        return numerator;
    }
    
    public int getDenominator() {
        return denominator;
    }
    
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.denominator = denominator;
    }
    
    public int gcd() {
        int gcd = 1;
        for (int i = 1; i <= numerator && i <= denominator; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        return gcd;
        
//        Euclidean GCD Metnod
//        int a = Math.abs(numerator);
//        int b = Math.abs(denominator);
//        while (b != 0) {
//            int temp = b;
//            b = a % b;
//            a = temp;
//        }
//        return a;
    }
    
    public void display() {
        int gcd = gcd();
        System.out.println("Fraction in lowest terms: " + (numerator / gcd) + " / " + (denominator /gcd));
    }
    
    @Override
    public String toString() {
        return numerator + " / " + denominator;
    }
}

public class L8Q4 {
    public static void main(String[] args) {
        Fraction test1 = new Fraction();
        test1.setNumerator(3);
        test1.setDenominator(6);
        System.out.println("Original fraction: " + test1);
        test1.display();
    }
}
