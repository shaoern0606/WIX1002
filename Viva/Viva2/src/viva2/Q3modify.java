package viva2;

import java.util.Scanner;

public class Q3modify {
    public static Boolean isLuckyTicket(String ticket) {
        int left = 0, right = 0;
        int half = ticket.length() / 2;

        for (int i = 0; i < half; i++) {
            left += ticket.charAt(i) - '0';
            //right += ticket.charAt(i + half) - '0';
        }

        for (int i = half; i < ticket.length(); i++) {
            right += ticket.charAt(i) - '0';
        }

        return left == right;
    }
    
    public static boolean isDigit(String ticket) {
        for (int i = 0; i < ticket.length(); i++) {
            char ch = ticket.charAt(i);
            if (!Character.isDigit(ch))
                return false;
        }
        return true;
    }
    
    public static char invalidChar(String ticket) {
        for (int i = 0; i < ticket.length(); i++) {
            char ch = ticket.charAt(i);
            if (!Character.isDigit(ch))
                return ch;
        }
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ticket number: ");
        String ticketNum = sc.nextLine();
        // ticketNum = ticketNum.replaceAll("\\s+", "");
        
        if (ticketNum.isEmpty() || !isDigit(ticketNum) || ticketNum.length() % 2 != 0) {
            System.out.println("Invalid ticket number.");
            System.out.println("Invalid character: " + invalidChar(ticketNum));
        }
        else {
            if (isLuckyTicket(ticketNum))
                System.out.println("Lucky");
            else
                System.out.println("Unlucky");
        }
    }
}

