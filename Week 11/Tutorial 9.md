# Tutorial 9
## Question 1
### a.
```java
public static boolean compare(Object s, Object t) {
    return s.getClass() == t.getClass();
}
```
### b.
```java
public static boolean isClass(Object s) {
    return s instanceof Person;
}
```

## Question 2
```java
class Organism {
    private double initialSize;
    private double growthRate;
    
    public Organism() {
        this.initialSize = 0;
        this.growthRate = 0;
    }
    
    public Organism(double initialSize, double growthRate) {
        this.initialSize = initialSize;
        this.growthRate = growthRate;
    }
    
    public double getInitialSize() {
        return initialSize;
    }

    public double getGrowthRate() {
        return growthRate;
    }
}

class Animal extends Organism {
    private double amountOfEatingNeed;
    
    public Animal() {
        super();
        this.amountOfEatingNeed = 0;
    }
    
    public Animal(double initialSize, double growthRate, double amountOfEatingNeed) {
        super(initialSize, growthRate);
        this.amountOfEatingNeed = amountOfEatingNeed;
    }
    
    public void display() {
        System.out.println("Initial Size: " + getInitialSize());
        System.out.println("Growth Rate: " + getGrowthRate());
        System.out.println("Amount of Eating Need: "+ amountOfEatingNeed);
    }
}
```

## Question 3
```java
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
```

## Question 4
```java
class PurchaseSystem {
    private String productCode;
    private double unitPrice;
    private int quantity;
    private double totalPrice;
    
    public PurchaseSystem() {
        this.productCode = null;
        this.unitPrice = 0;
        this.quantity = 0;
        this.totalPrice = 0;
        computeTotalPrice();
    }
    
    public PurchaseSystem(String productCode, double unitPrice, int quantity) {
        this.productCode = productCode;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        computeTotalPrice();
    }
    
    public double getUnitPrice(){
        return unitPrice;
    }
    
    public double getQuantity(){
        return quantity;
    }
    
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    public void computeTotalPrice() {
       totalPrice = unitPrice * quantity; 
    }
    
    public void display() {
        System.out.println("Product Code: " + productCode);
        System.out.println("Total Price: " + totalPrice);
    }
}

class SugarPurchase extends PurchaseSystem {
    private double sugarWeight;
    
    public SugarPurchase() {
        super();
    }
    
    public SugarPurchase(String productCode, double unitPrice, int quantity, double sugarWeight) {
        super(productCode, unitPrice, quantity);
        this.sugarWeight = sugarWeight;
        computeTotalPrice();
    }
    
    @Override
    public void computeTotalPrice() {
       setTotalPrice(getUnitPrice() * getQuantity() * sugarWeight); 
    }
}
```