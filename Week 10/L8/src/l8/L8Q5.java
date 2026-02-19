package l8;

import java.util.Random;

class Game {
    private String name;
    private int total = 0;
    Random rd = new Random();
    
    public Game (String name) {
        this.name = name;
    }
    
    public String getName () {
        return name;
    }
    
    public void move () {
        int random = rd.nextInt(6) + 1;
        total += random;
        System.out.println(name + " rolled " + random);
    }
    
    public int getTotal() {
        return total;
    }
}

public class L8Q5 {
    public static void main(String[] args) {
        Game player1 = new Game("Ng");
        Game player2 = new Game("Lim");
        while (true) {
            player1.move();
            if (player1.getTotal() >= 100) {
                System.out.println(player1.getName() + " wins!");
                System.out.println(player1.getName() + ": " + player1.getTotal());
                System.out.println(player2.getName() + ": " + player2.getTotal());
                break;
            }
            
            player2.move();
            if (player2.getTotal() >= 100) {
                System.out.println(player2.getName() + " wins!");
                System.out.println(player1.getName() + ": " + player1.getTotal());
                System.out.println(player2.getName() + ": " + player2.getTotal());
                break;
            }
        }
    }
}
