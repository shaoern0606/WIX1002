package l8;

class BurgerStall {
    private String id;
    private int numBurgerSold;
    private static int total;
    
    public BurgerStall (String id, int numBurgerSold) {
        this.id = id;
        this.numBurgerSold = numBurgerSold;
        total += numBurgerSold;
    }
    
    public void sold (int n) {
        numBurgerSold += n;
        total += n;
    }
    
    public void display() {
        System.out.println("Total burgers sold by stall " + id + ": "+ numBurgerSold);
    }
    
    public static void displayTotal() {
        System.out.println("Total burgers sold in all stalls: " + total);
    }
}

public class L8Q6 {
    public static void main(String[] args) {
        BurgerStall s1 = new BurgerStall("A1", 50);
        BurgerStall s2 = new BurgerStall("B2", 30);

        s1.sold(20);
        s2.sold(50);

        s1.display();
        s2.display();
        BurgerStall.displayTotal();
    }
}
