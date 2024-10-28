package dicegame_kelley;

import java.util.Random;

public class Die {
    private int sides;
    private int value;
    private Random randomNumber;

    // set number of sides
    public Die(int sides) {
    this.sides = sides;
    this.randomNumber = new Random();
    
 }
    // Getters 
    public int getSides() {
        return sides;
    }

    public int getValue() {
        return value;
    }

    // roll method 
    public int roll() {
       return randomNumber.nextInt(sides) +1;
    }

}

