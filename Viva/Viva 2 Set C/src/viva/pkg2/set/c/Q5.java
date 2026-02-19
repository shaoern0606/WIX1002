package viva.pkg2.set.c;

import java.util.Random;
import java.util.Scanner;

public class Q5 {
    public static int[] generateNum(int numOfBall, int length) {
        Random rd = new Random();
        int[] randomNumList = new int[numOfBall];
        for (int i = 0; i < numOfBall; i++) {
            randomNumList[i] = rd.nextInt((int)Math.pow(10, length));
        }
        return randomNumList;
    }
    
    public static void displayNum(int[] num, int numOfBall) {
//        int row = (int) Math.sqrt(numOfBall);
//        int column = (int) Math.sqrt(numOfBall);
        
//        if (row * column != numOfBall) {
//            row += 1;
//        }
        int column = (int) Math.ceil(Math.sqrt(numOfBall));
        int row = (int) Math.ceil((double) numOfBall / column);
        
        int[][] pool = new int[row][];
        
        if (row*column == numOfBall) {
            for (int i = 0; i < row; i++) {
                pool[i] = new int[column];
            }
        } else {
            for (int i = 0; i < row - 1; i++) {
                pool[i] = new int[column];
            }
            pool[row-1] = new int[numOfBall - ((row-1)*column)];
        }
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < pool[i].length; j++) {
                pool[i][j] = num[i*column + j];
                System.out.printf("%-7d", pool[i][j]);
            }
            System.out.println();
        }
    }
    
    public static boolean foundTarget(int target, int poolNumber) {
        return target == poolNumber;
    }
    
    public static boolean nearMiss(int target, int poolNumber, int length) {
//        String targetString = Integer.toString(target);
//        String poolNumberString = Integer.toString(poolNumber);
//        int diff = 0;
//        
//        if (targetString.length() != poolNumberString.length())
//            return false;
//        else {
//            for (int i = 0; i < length; i++) {
//                if (targetString.charAt(i) != poolNumberString.charAt(i)) {
//                    diff++;
//                }
//            }
//            return diff == 1;
//        }

        String targetString = String.format("%0" + length + "d", target);
        String poolNumberString = String.format("%0" + length + "d", poolNumber);

        int diff = 0;
        for (int i = 0; i < length; i++) {
            if (targetString.charAt(i) != poolNumberString.charAt(i)) {
                diff++;
            }
        }
        return diff == 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of length (3 or 4): ");
        int numLength = sc.nextInt();
        System.out.print("Enter number of ball to choose: ");
        int numBall = sc.nextInt();
        System.out.print("Enter ball value: ");
        int ballValue = sc.nextInt();
        System.out.print("Target number: ");
        int targetNum = sc.nextInt();
        
        int[] randomNumList = new int[numBall];
        randomNumList = generateNum(numBall, numLength);
        displayNum(randomNumList, numBall);
        
        boolean win = false;
        boolean near = false;
        boolean[] nearMissList = new boolean[numBall];
        for (int i = 0 ; i < numBall; i++) {
            int poolNumber = randomNumList[i];
            if (foundTarget(targetNum, poolNumber)) {
                win = true;
                break;
            }  else if (nearMiss(targetNum, poolNumber, numLength)) {
                nearMissList[i] = true;
                near = true;   
            }
        }
        
        if (win) {
            System.out.println("Congratulations!! You Got The Number " + targetNum);
            double totalPrize = (numLength * ballValue * 1000.0) / numBall;
            System.out.printf("Total Prize: RM%.2f%n", totalPrize);
        } else if (near) {
            System.out.println("You almost get it");
            for(int i = 0; i < numBall; i++) {
                if (nearMissList[i])
                    System.out.printf("%-7d", randomNumList[i]);
            }
        } else {
            System.out.println("Try again next time");
        }
    }
}