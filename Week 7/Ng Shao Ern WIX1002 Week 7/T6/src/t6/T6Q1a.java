package t6;

public class T6Q1a {
    public static int maximum(int a, int b, int c) {
    if (a > b && a > c)
        return a;
    else if (b > a && b > c)
        return b;
    else
        return c;
}
    public static void main(String[] args) {
        System.out.println(maximum(3, 9, 6));
    }
}
