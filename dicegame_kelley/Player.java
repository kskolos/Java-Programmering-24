package dicegame_kelley;

public class Player {
    private String name;
    private int points;
    private Die playerDie;

    // Setting the defaults
    public Player(String name) {
        this.name = name;
        points = 0;

    }


    // Required getters and setter for "Player"
    public String getName() {
        return name;
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

    }

    // returns the value of the die as an int
    public int getDieValue() {
        return int;
    }

    // increases the score by 1

    public void increaseScore() {

    }

    // creates a new die for the game 
    public void addDie() {

    }
}



/*För att kunna göra ett simpelt tärningsspel skall vi nu också skapa en klass Player för att representera en spelare. 
En spelare skall ha tre instansvariabler: ett namn, en poäng och en tärning. 
Namnet skall sättas i klassens konstruktor-metod samt ha en enkel gettermetod. Poängen skall ha getter- och setter-metoder. 
Tärningen är vad spelaren kommer att använda för att spela tärningsspelet. Skall vara av typen Die.
En spelare skall också ha ett antal metoder:

rollDice(): Skall rulla spelarens tärning.
getDieValue(): Skall returnera värdet på spelaren tärning i form av ett heltal.
increaseScore(): Skall öka spelarens poäng med ett.
addDie(): Skapar en ny tärning och lägger till den till spelaren. */

/* To create a simple dice game, we will also create a class Player to represent a player. 
A player should have three instance variables: a name, a score, and a die. 
The name should be set in the class constructor and have a simple getter method. 
The score should have getter and setter methods. The die is what the player will use to play the dice game and should be of type Die.

A player should also have several methods:

rollDice(): Should roll the player's die.
getDieValue(): Should return the value of the player's die as an integer.
increaseScore(): Should increase the player's score by one.
addDie(): Creates a new die and adds it to the player. */