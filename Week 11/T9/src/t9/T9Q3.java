package t9;

public class T9Q3 {
    
}

class PaySystem {
    private double payRatePerHour;
    private int numberOfHour;
    
    public PaySystem() {
        this.payRatePerHour = 0;
        this.numberOfHour = 0;
    }
    
    public PaySystem(double payRatePerHour, int numberOfHour) {
        this.payRatePerHour = payRatePerHour;
        this.numberOfHour = numberOfHour;
    }
    
    public double getTotalPay() {
        return payRatePerHour * numberOfHour;
    }
    
    public void displayTotalPay() {
        System.out.println("Total Pay: " + getTotalPay());
    }
}

class RegularPay extends PaySystem {
    public RegularPay() {
        super();
    }
    
    public RegularPay(double payRatePerHour, int numberOfHour) {
        super(payRatePerHour, numberOfHour);
    }
}

class SpecialPay extends PaySystem {
    public SpecialPay() {
        super();
    }
    
    public SpecialPay(double payRatePerHour, int numberOfHour) {
        super(payRatePerHour, numberOfHour);
    }
    
    @Override
    public double getTotalPay() {
        return super.getTotalPay() * 1.3;
    }
}