package t10;

interface Interest {
    double computeInterest();
}

class SavingAccount implements Interest {
    private double balance;
    
    public SavingAccount(double balance) {
        this.balance = balance;
    }
    
    public double computeInterest() {
        return balance * 0.005 / 12;
    }
}

class FixedAccount implements Interest {
    private double balance;
    
    public FixedAccount (double balance) {
        this.balance = balance;
    }
    
    public double computeInterest() {
        return balance * 0.03 / 12;
    }
}

public class T10Q2 {
    public static void main(String[] args) {
        Interest saving = new SavingAccount(10000);
        Interest fixed = new FixedAccount(10000);
    
        System.out.printf("Saving Account Monthly Interest: RM%.2f%n", saving.computeInterest());
        System.out.printf("Fixed Account Monthly Interest: RM%.2f%n", fixed.computeInterest());
    }
}
