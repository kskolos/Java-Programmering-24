package dicegame_kelley;

import java.util.Random;

public class Die {
    private int sides;
    private int value;
    private Random randomNumber;

    // set number of sides and initialize random 
    public Die(int sides) {
    this.sides = sides;
 }

    // Getters 
    public int getSides() {
        return sides;
    }

    public int getValue() {
        return value;
    }

    // roll method 
    public void roll() {
        value =  randomNumber.nextInt(sides) +1;
    }

}

    /* Random value = new Random();
        int x = value.nextInt(6) + 1;
        System.out.println("You rolled a " + x); */


/* I den första delen av uppgiften skall vi modellera en tärning med hjälp av en klass Die. 
Vi skall sedan använda den här tärningsklassen för att skapa ett enkelt tärningsspel. 
Tärningen skall ha två variabler: nuvarande värde och antal sidor (dvs max-värde för tärningen).

Antal sidor skall sättas i klassens konstruktor. 
Skall vara av typen int och ha en enkel gettermetod. 
Nuvarande värde skall förändras när man kallar på roll()-metoden (se nedan). 
Skall vara av typen int samt ha en getter-metod.

Tärningen skall också ha en slumpgenerator som privat klassvariabel. 
Slumpgeneratorn skall vara av typen Random och kommer att användas i vår roll()-metod. 
Typen Random kan importeras från java.util.Random.

För att kunna använda klassen kommer vi att behöva en metod: public void roll(). 
Den här metoden skall använda sig av slumpgeneratorn för att förändra tärningens nuvarande 
värde. Tips: ni bör använda standardklassen Random för detta. 
Random har en metod public int nextInt(int maxValue) som returnerar ett slumpmässigt heltal 
mellan 0 och (maxValue-1). */
