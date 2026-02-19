package l5;

import java.util.HashSet;

public class L5Q2alternative {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        while(set.size() < 10)
            set.add((int)(Math.random() * 20 + 1));
        set.forEach(x -> System.out.print(x + " "));
    }
}
