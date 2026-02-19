package t10;

abstract class DiscountPolicy {
    public abstract double computeDiscount(int count, double itemCost);
    
}

class BulkDiscount extends DiscountPolicy {
    private int minimum;
    private double discountRate;
    
    public BulkDiscount(int minimum, double discountRate) {
        this.minimum = minimum;
        this.discountRate = discountRate;
    }
    
    public double computeDiscount(int count, double itemCost) {
        if (count > minimum) {
            return count * itemCost * discountRate;
        }
        return 0;
    }
}

class OtherDiscount extends DiscountPolicy {
    public double computeDiscount(int count, double itemCost) {
        if (count > 8)
            return count * itemCost * 0.3;
        else if (count >= 6)
            return count * itemCost * 0.2;
        else if (count >= 3)
            return count * itemCost * 0.1;
        else
            return count * itemCost;
    };
}

class CombineDiscount extends DiscountPolicy {
    private DiscountPolicy policy1;
    private DiscountPolicy policy2;
    
    public CombineDiscount(DiscountPolicy policy1, DiscountPolicy policy2) {
        this.policy1 = policy1;
        this.policy2 = policy2;
    }
    
    public double computeDiscount(int count, double itemCost) {
        double discountPolicy1 = policy1.computeDiscount(count, itemCost);
        double discountPolicy2 = policy2.computeDiscount(count, itemCost);
        return Math.max(discountPolicy1, discountPolicy2);
    }
}

public class T10Q1 {
    public static void main(String[] args) {
        DiscountPolicy bulk = new BulkDiscount(5, 0.15);
        DiscountPolicy other = new OtherDiscount();
        DiscountPolicy combined = new CombineDiscount(bulk, other);

        int count = 7;
        double itemCost = 100;

        System.out.println("Bulk Discount: " + bulk.computeDiscount(count, itemCost));
        System.out.println("Other Discount: " + other.computeDiscount(count, itemCost));
        System.out.println("Combined Discount: " + combined.computeDiscount(count, itemCost));
    }
}
