package l6;

public class L6Q6 {
    public static boolean isPalindromicPrime(int num) {
        return isPrime(num) && (num == reverse(num));
    }
    
    public static boolean isEmrip(int num) {
        return isPrime(num) && isPrime(reverse(num)) && !isPalindromicPrime(num);
    }
    
    public static boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    
    public static int reverse(int num){
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
    
    
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        System.out.println("First 20 Palindromic Primes: ");
        while (count < 20) {
            if (isPalindromicPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        
        count = 0;
        num = 2;
        System.out.println("\n\nFirst 20 Emrips: ");
        while (count < 20) {
            if (isEmrip(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}
