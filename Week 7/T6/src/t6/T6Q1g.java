package t6;

public class T6Q1g {
    public static void areaCircumference(double r) {
        double area = Math.PI * r * r;
        double circumference = 2 * Math.PI * r;
        System.out.printf("Area: %.2f%n",area);
        System.out.printf("Circumference: %.2f%n", circumference);
    }

    public static void main(String[] args) {
        areaCircumference(5);
    }
}
