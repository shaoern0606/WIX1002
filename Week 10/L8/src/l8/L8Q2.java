package l8;

class BankAccount {
    
    private String name;
    private String IC;
    private String passportNumber;
    private double depositAmount;
    
    // actually only need IC or passportNumber but not sure how to do
    public BankAccount (String name, String IC, String passportNumber, double depositAmount) {
        this.name = name;
        this.IC = IC;
        this.passportNumber = passportNumber;
        this.depositAmount = depositAmount;
    }
    
    public void deposit (double amount) {
        depositAmount += amount;
    }
    
    public void withdraw (double amount) {
        if (amount <= depositAmount) {
            depositAmount -= amount;
        } else {
            System.out.println("Current balance is less than amount of withrawal");
        }
    }
    
    public void displayCurrentBalance () {
        System.out.printf("Name: %s%nCurrent Balance: RM%.2f%n", name, depositAmount);
    }
}

public class L8Q2 {
    public static void main(String[] args) {
        BankAccount customerA = new BankAccount("Lim", "060606-07-0246", "12345678", 500);
        customerA.deposit(200);
        customerA.withdraw(100);
        customerA.displayCurrentBalance();      
        
        System.out.println();
        
        BankAccount customerB = new BankAccount("Ng", "070707-08-0123", "87654321", 300);
        customerB.deposit(100);
        customerB.withdraw(500);
        customerB.displayCurrentBalance();   
    }
}
