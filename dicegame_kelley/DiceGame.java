package dicegame_kelley;

import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        Random yourNumber = new Random();
        int x = yourNumber.nextInt(6) + 1;
        System.out.println("You rolled a " + x);
    }
}
