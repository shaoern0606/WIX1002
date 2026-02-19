package t6;

public class T6Q2 {
    public static void decreasing(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        int mid = a + b + c - max - min;
        System.out.println(max + " " + mid + " " + min);
        
//        if (a < b) { int temp = a; a = b; b = temp; }
//        if (a < c) { int temp = a; a = c; c = temp; }
//        if (b < c) { int temp = b; b = c; c = temp; }
//        System.out.printf("%d %d %d%n", a, b, c);
    }
    
    public static void main(String[] args) {
        decreasing(1 , 5, 3);
    }
}
