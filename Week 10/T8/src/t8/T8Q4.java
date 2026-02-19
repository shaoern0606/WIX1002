package t8;

class Payment {
    public void pay(double amount) {
        System.out.printf("Cash Payment: RM%.2f%n" ,amount);
    }
    
    public void pay(double amount, String chequeNumber) {
        System.out.printf("Cheque Payment: RM%.2f%n", amount);
        System.out.println("Cheque Number: " + chequeNumber);
    }
    
    public void pay(double amount, String cardHolderName, String cardType, String expirationDate, String validationCode) {
        System.out.printf("Credit Card Payment: RM%.2f%n" , amount);
        System.out.println("Card Holder Name: " + cardHolderName);
        System.out.println("Card Type: " + cardType);
        System.out.println("Expiration Date: " + expirationDate);
        System.out.println("Validation Code: " + validationCode);
    }
}

public class T8Q4 {
    public static void main(String[] args) {
        Payment customer1 = new Payment();
        customer1.pay(150);
        Payment customer2 = new Payment();
        customer2.pay(200, "950020");
        Payment customer3 = new Payment();
        customer3.pay(250, "Ng Shao Ern", "VISA", "06/2027", "123");
    }
 
}
