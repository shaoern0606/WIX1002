package l6;

public class L6Q4 {
    public static int gcd(int a, int b) {
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static void main(String[] args) {
        System.out.println(gcd(24, 8));
        System.out.println(gcd(200, 625));
    }
}
