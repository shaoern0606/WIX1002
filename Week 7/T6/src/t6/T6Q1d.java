package t6;

public class T6Q1d {
    public static boolean isPentagonal (int n) {
        if (n <= 0)
            return false;
        double num = (1 + Math.sqrt(1 + 24 * n)) / 6;
        return num == (int)num;
    }
    
//    public static boolean isPentagonal(int x) {
//        int n = 1;
//        while (true) {
//            int pentagonalNumber = n * (3 * n - 1) / 2;
//            if (pentagonalNumber == x) return true;
//            if (pentagonalNumber > x) return false; // overshoot => not pentagonal
//            n++;
//        }
//    }
    public static void main(String[] args) {
        System.out.println(isPentagonal(92));
        System.out.println(isPentagonal(330));
        System.out.println(isPentagonal(50));
    }
}
