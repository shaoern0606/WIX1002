package l8;

class Money {
    private double amount;
    private final int[] RM = {100, 50, 10, 5, 1};
    private final int[] cent = {50, 20, 10, 5};
    
    public Money(double amount) {
        this.amount = roundAmount(amount);
    }
    
    public double getAmount() {
        return amount;
    }
    
    public double roundAmount(double x) {
        int cents = (int) Math.round(x * 100);
        int lastDigit = cents % 10;
        
        if (lastDigit <= 2)
            cents = cents - lastDigit;
        else if (lastDigit <= 7)
            cents = cents - lastDigit + 5;
        else
            cents = cents - lastDigit + 10;
        
        return cents / 100.0;
    }
    
    public int onlyRM() {
        return (int) amount;
    }
    
    public int onlyCent() {
        return (int) Math.round((amount - onlyRM()) * 100);
    }
    
    public void displayNotes() {
        int rm = onlyRM();
        for (int i = 0; i < RM.length; i++) {
            System.out.println("RM" + RM[i] + ": " + (rm / RM[i]));
            rm = rm % RM[i];
        }
    }
    
    public void displayCents() {
        int c = onlyCent();
        for (int i = 0; i < cent.length; i++) {
            System.out.println(cent[i] + " cent: " + (c / cent[i]));
            c = c % cent[i];
        }
    }
        
    public void display() {
        displayNotes();
        displayCents();
    }
    
    public Money add(Money m) {
        this.amount = roundAmount(this.amount + m.amount);
        return this;
    }

    public Money subtract(Money m) {
        this.amount = roundAmount(this.amount - m.amount);
        return this;
    }
}

public class L8Q7 {
    public static void main(String[] args) {
        Money m1 = new Money(250.78);
        Money m2 = new Money(123.89);

        Money total = new Money(m1.getAmount()).add(m2);
        Money diff = new Money(m1.getAmount()).subtract(m2);

        System.out.printf("%nRounded M1: RM%.2f%n", m1.getAmount());
        m1.display();

        System.out.printf("%nRounded M2: RM%.2f%n", m2.getAmount());
        m2.display();

        System.out.printf("%nM1 + M2: RM%.2f%n", total.getAmount());
        total.display();

        System.out.printf("%nM1 - M2: RM%.2f%n", diff.getAmount());
        diff.display();
    }
}
