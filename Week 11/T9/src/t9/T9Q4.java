package t9;

public class T9Q4 {
    
}

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

//class PurchaseSystem {
//    private String productCode;
//    private double unitPrice;
//    private int quantity;
//    protected double totalPrice;
//    
//    public PurchaseSystem() {
//        this.productCode = null;
//        this.unitPrice = 0;
//        this.quantity = 0;
//        this.totalPrice = 0;
//        computeTotalPrice();
//    }
//    
//    public PurchaseSystem(String productCode, double unitPrice, int quantity) {
//        this.productCode = productCode;
//        this.unitPrice = unitPrice;
//        this.quantity = quantity;
//        computeTotalPrice();
//    }
//    
//    public void computeTotalPrice() {
//       totalPrice = unitPrice * quantity; 
//    }
//    
//    public void display() {
//        System.out.println("Product Code: " + productCode);
//        System.out.println("Total Price: " + totalPrice);
//    }
//    
//}
//
//class SugarPurchase extends PurchaseSystem {
//    private double sugarWeight;
//    
//    public SugarPurchase() {
//        super();
//    }
//    
//    public SugarPurchase(String productCode, double unitPrice, int quantity, double sugarWeight) {
//        super(productCode, unitPrice, quantity);
//        this.sugarWeight = sugarWeight;
//        computeTotalPrice();
//    }
//    
//    @Override
//    public void computeTotalPrice() {
//       totalPrice = totalPrice * sugarWeight; 
//    }
//}