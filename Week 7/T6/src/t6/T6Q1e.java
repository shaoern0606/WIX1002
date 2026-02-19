package t6;

public class T6Q1e {
    public static void countLettersDigits(String str) {
        int letters = 0;
        int digits = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch))
                letters++;
            else if (Character.isDigit(ch))
                digits++;
        }
        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
    }
    
    public static void main(String[] args) {
        countLettersDigits("hello1world23");
    }
}
