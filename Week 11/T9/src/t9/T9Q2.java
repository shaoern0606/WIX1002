package t9;

public class T9Q2 {
    
}

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

//class Organism {
//    protected double initialSize;
//    protected double growthRate;
//    
//    public Organism() {
//        this.initialSize = 0;
//        this.growthRate = 0;
//    }
//    
//    public Organism(double initialSize, double growthRate) {
//        this.initialSize = initialSize;
//        this.growthRate = growthRate;
//    }
//}
//
//class Animal extends Organism {
//    private double amountOfEatingNeed;
//    
//    public Animal() {
//        super();
//        this.amountOfEatingNeed = 0;
//    }
//    
//    public Animal(double initialSize, double growthRate, double amountOfEatingNeed) {
//        super(initialSize, growthRate);
//        this.amountOfEatingNeed = amountOfEatingNeed;
//    }
//    
//    public void display() {
//        System.out.println("Initial Size: " + initialSize);
//        System.out.println("Growth Rate: " + growthRate);
//        System.out.println("Amount of Eating Need: "+ amountOfEatingNeed);
//    }
//}