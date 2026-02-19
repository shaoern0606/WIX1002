package t6;

public class T6Q1c {
    public static int combination(int n, int k) {
        int nFactorial = 1;
        int kFactorial = 1;
        int nMinuskFactorial = 1;
        for (int i = n; i > 0; i--) {
            nFactorial *= i;
        }
        for (int i = k; i > 0; i--) {
            kFactorial *= i;
        }
        for (int i = n - k; i > 0; i--) {
            nMinuskFactorial *= i;
        }
        return (nFactorial/ (kFactorial * nMinuskFactorial));
    }
    
//    public static long combination(int n, int k) {
//        if (k < 0 || k > n) return 0;
//        if (k == 0 || k == n) return 1;
//
//        long result = 1;
//
//        for (int i = 1; i <= k; i++) {
//            result = result * (n - i + 1) / i;
//        }
//        return result;
//    }
    
    public static void main(String[] args) {
        System.out.println(combination(5, 2));
        System.out.println(combination(6, 3));
        System.out.println(combination(10, 0));
        System.out.println(combination(10, 10));
        System.out.println(combination(10, 5));
    }
}
