package t6;

public class T6Q1b {
    public static boolean isSquareNumber(int n) {
        if (n <= 0)
            return false;
        int sqrt = (int) Math.sqrt(n);    
        return sqrt * sqrt == n;
    }
    
    public static void main(String[] args) {
        System.out.println(isSquareNumber(25));
        System.out.println(isSquareNumber(50));
    }
}
