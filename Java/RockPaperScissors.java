/*
* This program is the rock, paper, scissors game.
*
* @author  Kenny Le
* @version 1.0
* @since   2024-03-01
*/

import java.util.Random;
import java.util.Scanner;

/**
* This is the Rock Paper Scissors program.
*/
final class RockPaperScissors {
    /**
     * Constants.
     */
    public static final String ROCK = "R";

    /**
     * Constants.
     */
    public static final String PAPER = "P";

    /**
     * Constants.
     */
    public static final String SCISSORS = "S";

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called.
    *
    * @throws IllegalStateException if this is ever called.
    *
    */
    private RockPaperScissors() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Finds the gameResults of the game.
    *
    * @param playerChoice user input
    * @return gameResults
    */
    static String gameResults(final String playerChoice) {
        final Random randomNumber = new Random();
        final String[] choices = {ROCK, PAPER, SCISSORS};
        final int choiceOption = 3;
        final int computerIndex = randomNumber.nextInt(choiceOption);
        final String computerChoice = choices[computerIndex];
        let results;

        System.out.println("User chooses: " + playerChoice);
        System.out.println("Computer chooses: " + computerChoice);

        if (playerChoice.equals(computerChoice)) {
            results = "tie";
        } else if (
                playerChoice.equals(ROCK) && computerChoice.equals(SCISSORS)
                || playerChoice.equals(PAPER) && computerChoice.equals(ROCK)
                || playerChoice.equals(SCISSORS)
                    && computerChoice.equals(PAPER)) {
            results = "win";
        } else {
            results = "loss";
        } 

        return results;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Rock --> R, Paper --> P, Scissors --> S");

        // Error Check
        while (true)  {
            System.out.print("Enter Rock(R), Paper(P) or Scissors(S): ");
            final String playerChoice = scanner.nextLine().toUpperCase();
            if (!playerChoice.equals(ROCK) && !playerChoice.equals(PAPER) && !playerChoice.equals(SCISSORS)) {
                System.out.println("Invalid Input!");
                break;
            } else {
                final String finalResult = gameResults(playerChoice);
                if (finalResult.equals("tie")) {
                    System.out.println("It's a tie!");
                } else if (finalResult.equals("win")) {
                    System.out.println("You win!");
                } else {
                    System.out.println("You lose!");
                }
            break;
            }
        }

        // Close scanners
        scanner.close();

        // Show the program as done
        System.out.println("\nDone.");
    }
}
