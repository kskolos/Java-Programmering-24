package dicegame_kelley;

import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {

        // Rules and introduction, initializing the game for round 1

        System.out.println(welcomeStatement());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + "! How many sides would you like your die to have?");
        int sides = scanner.nextInt();
        System.out.println("Lastly, how many rounds would you like to play?");
        int totalNumberofRounds = scanner.nextInt();

        Player newPlayer = new Player(name, sides);

        newPlayer.rollDie();

        // Guessing correctly or incorrectly for set number of rounds

        for (int currentRoundNumber = 1; currentRoundNumber <= totalNumberofRounds; currentRoundNumber++ ) {

        System.out.println("Let's get things rolling! What number do you think you got?");
        int guess = scanner.nextInt();

        int actualValue = newPlayer.getDieValue();
        System.out.println("Looks like you rolled a: " + actualValue);


        if (guess == actualValue) {

            System.out.println("Congrats! You guessed correctly and scored a point!");
            newPlayer.increaseScore();
        }

        else {
            System.out.println("Nice try, but your guess was incorrect.");
        }

        if (currentRoundNumber < totalNumberofRounds) {
            System.out.println("Let's create a new die and guess again.");
            System.out.println("How many sides would you like this round?");
            int newSidesValue = scanner.nextInt();
            newPlayer.addDie(newSidesValue);
            newPlayer.rollDie();

        }

    }

    scanner.close();

    // End of game statement and final points total 

    System.out.println("Great job, and thank you for playing!");
    System.out.println("Your game ended with a final score of: " + newPlayer.getPoints());
  

    }

        public static String welcomeStatement() {
         return """
            
            Hello and welcome to Kelley's dice game! Let's run through a quick tutorial of the game:

            I'll start by asking you some information to create your own custom game environment.
            This will include your name and the number of rounds you'd like to play,
            and the number of sides you wish for your die to have.
            After you create your die, you will be prompted to guess what number may have been rolled on your die. 
            If you guess correctly, you will gain a point!
            
            Bonus tip! A classic die has six sides. If you are up for more of a challenge, 
            pick any number above six and see if you can score a point! 
            If you want an easier game, choose a die with less than 6 sides.
            
            Good luck, and have fun!

            """;
        }


    }
