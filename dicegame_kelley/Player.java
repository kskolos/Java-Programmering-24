package dicegame_kelley;

public class Player {
    private String playerName;
    private int points;
    private Die playerDie;

    // Setting the defaults
    public Player(String name, int sides) {
        this.playerName = name;
        points = 0;
        this.playerDie= new Die(sides);

    }

    // Required getters and setter for "Player"
    public String getName() {
        return playerName;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    // required methods per player 

    // rolls a players die
    public void rollDie() {
      playerDie.roll();
    }

    // returns the value of the die as an int
    public int getDieValue() {
        return playerDie.roll();
    }

    // increases the score by 1 and reports total score to player
    public void increaseScore() {
        points++;
        System.out.println("A point has been added to your score. You now have " + points + " points.");
        System.out.println();
    }

    // creates a new die for the next round
    public void addDie(int sides) {
        this.playerDie = new Die(sides);
        System.out.println("A new die has been made! It has " + sides + " sides.");
        System.out.println();
    }
}