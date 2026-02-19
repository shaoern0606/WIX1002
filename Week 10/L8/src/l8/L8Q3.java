package l8;

class WeightCalculator {
    private int age;
    private double height;
         
    public WeightCalculator (int age, double height) {
        this.age = age;
        this.height = height;
    }
    
    public double recommendWeight () {
        return (height - 100 + age / 10.0) * 0.9;
    }
    
    public void display() {
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + "cm");
        System.out.printf("Recommend Weight: %.2f%n", recommendWeight());
    }
}

public class L8Q3 {
    public static void main(String[] args) {
        WeightCalculator user1 = new WeightCalculator(19, 163);
        user1.display();
        
        System.out.println();
        
        WeightCalculator user2 = new WeightCalculator(39, 170);
        user2.display();
    }
}
