package l6;

public class L6Q1 {
    public static int triangularNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.print(triangularNumber(i) + " ");
        }
    }
}
