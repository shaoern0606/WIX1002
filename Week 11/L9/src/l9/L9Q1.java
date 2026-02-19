package l9;

import java.util.Scanner;

public class L9Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Rectangle 1 ---");
        Rectangle r1 = new Rectangle();
        r1.acceptInput(sc);
        r1.computePerimeter();
        r1.computeArea();
        r1.display();
        
        System.out.println("\n--- Square 1 ---");
        Square s1 = new Square();
        s1.acceptInput(sc);
        s1.computePerimeter();
        s1.computeArea();
        s1.display();
        
        System.out.println("\n--- Circle 1 ---");
        Circle c1 = new Circle();
        c1.acceptInput(sc);
        c1.computePerimeter();
        c1.computeArea();
        c1.display();
                
        System.out.println("\n--- Rectangle 2 ---");
        Rectangle r2 = new Rectangle(5, 8);
        r2.computePerimeter();
        r2.computeArea();
        r2.display();
        
        System.out.println("\n--- Square 2 ---");
        Square s2 = new Square(6);
        s2.computePerimeter();
        s2.computeArea();
        s2.display();
        
        System.out.println("\n--- Circle 2 ---");
        Circle c2 = new Circle(6);
        c2.computePerimeter();
        c2.computeArea();
        c2.display();
        
        sc.close();
    }
    
}

class Shape {
    private String name;
    private double perimeter;
    private double area;
    
    public Shape() {
        this.name = null;
        this.perimeter = 0;
        this.area = 0;
    }
    
    public Shape(String name) {
        this.name = name;
        this.perimeter = 0;
        this.area = 0;
    }
    
    public double getPerimeter() {
        return perimeter;
    }
    
    public double getArea() {
        return area;
    }
    
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
    
    public void setArea(double area) {
        this.area = area;
    }
    
    public void display() {
        System.out.printf("Name of the shape: %s%n", name);
        System.out.printf("Perimeter: %.2f%n", perimeter);
        System.out.printf("Area: %.2f%n", area);
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle() {
        super("Rectangle");
    }
    
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }
    
    public void acceptInput(Scanner sc) {
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter width: ");
        width = sc.nextDouble();
    }
    
    public void computePerimeter() {
        setPerimeter(2 * (length + width));
    }
    
    public void computeArea() {
        setArea(length * width);
    }
}

class Square extends Shape {
    private double sideLength;
    
    public Square() {
        super("Square");
    }
    
    public Square(double sideLength) {
        super("Square");
        this.sideLength = sideLength;
    }
    
    public void acceptInput(Scanner sc) {
        System.out.print("Enter side length: ");
        sideLength = sc.nextDouble();
    }
    
    public void computePerimeter() {
        setPerimeter(4 * sideLength);
    }
    
    public void computeArea() {
        setArea(sideLength * sideLength);
    }
}

class Circle extends Shape {
    private double diameter;
    
    public Circle() {
        super("Circle");
    }
    
    public Circle(double diameter) {
        super("Circle");
        this.diameter = diameter;
    }
    
    public void acceptInput(Scanner sc) {
        System.out.print("Enter diameter: ");
        diameter = sc.nextDouble();
    }
    
    public void computePerimeter() {
        setPerimeter(Math.PI * diameter);
    }
    
    public void computeArea() {
        setArea((Math.PI * diameter * diameter) / 4);
    }
}