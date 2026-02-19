package l6;

public class L6Q2 {
    public static void multiPrint(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }
    
    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            multiPrint(i, '*');
            System.out.println();
        }
    }
    
    public static void printDiamond(int n) {
        for (int i = 1; i <= n; i++) {
            multiPrint(n - i, ' ');
            multiPrint(2 * i - 1, '*');
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            multiPrint(n - i, ' ');
            multiPrint(2 * i - 1, '*');
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        printTriangle(5);
        System.out.println();
        printDiamond(5);

    }
}
