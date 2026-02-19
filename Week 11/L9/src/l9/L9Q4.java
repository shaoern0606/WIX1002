package l9;

import java.util.Random;

class Player {
    String name;
    int total = 0;

    public Player(String name) {
        this.name = name;
    }
}

class DiceGame {
    Player player1;
    Player player2;
    Random rd = new Random();

    public DiceGame(String p1, String p2) {
        player1 = new Player(p1);
        player2 = new Player(p2);
    }
}

class OneDiceGame extends DiceGame {
    public OneDiceGame(String player1, String player2) {
        super(player1, player2);
    }
    
    public void rollDice(Player player) {
        int dice = rd.nextInt(6) + 1;
        int turnScore = 0;

        if (dice == 6) {
            int reroll = rd.nextInt(6) + 1;
            if (reroll == 6) {
                turnScore = 0; // both 6's, score cancelled
                System.out.print(player.name + " rolled 6 and 6 again! No score this turn");
            } else {
                turnScore = dice + reroll;
                System.out.print(player.name + " rolled 6 then " + reroll);
            }
        } else {
            turnScore = dice;
            System.out.print(player.name + " rolled " + dice);
        }

        // Check if adding turnScore exceeds 100
        if (player.total + turnScore > 100) {
            System.out.print(", turn score not counted as total would exceed 100");
        } else {
            player.total += turnScore;
        }

        System.out.println(", total: " + player.total);
    }
}

class TwoDiceGame extends DiceGame {
    public TwoDiceGame(String player1, String player2) {
        super(player1, player2);
    }
    
    public void rollTwoDice(Player player) {
        int dice1, dice2;
        int sum = 0;
        
        do {
            dice1 = rd.nextInt(6) + 1;
            dice2 = rd.nextInt(6) + 1;
            player.total += dice1 + dice2;
            System.out.println(player.name + " rolled " + dice1 + " & " + dice2 + ", total: " + player.total);
        } while (dice1 == dice2);
        
    }
}

public class L9Q4 {
    public static void main(String[] args) {
        
        System.out.println("===== One Dice Game =====");
        OneDiceGame game1 = new OneDiceGame("Lim", "Wong");

        while (true) {
            game1.rollDice(game1.player1);
            if (game1.player1.total == 100) {
                System.out.println(game1.player1.name + " wins!");
                break;
            }

            game1.rollDice(game1.player2);
            if (game1.player2.total == 100) {
                System.out.println(game1.player2.name + " wins!");
                break;
            }
        }

        System.out.println("\n===== Two Dice Game =====");
        TwoDiceGame game2 = new TwoDiceGame("Ali", "Muthu");

        while (true) {
            game2.rollTwoDice(game2.player1);
            if (game2.player1.total >= 100) {
                System.out.println(game2.player1.name + " wins!");
                break;
            }

            game2.rollTwoDice(game2.player2);
            if (game2.player2.total >= 100) {
                System.out.println(game2.player2.name + " wins!");
                break;
            }
        }
        
    }
}