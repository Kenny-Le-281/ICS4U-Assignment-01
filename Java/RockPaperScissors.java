/*
* This program checks length of wood
*
* @author  Kenny Le
* @version 1.0
* @since   2024-03-01
*/

import java.util.Scanner;
import java.util.Random;

/**
* This is the BoardFoot program.
*/
final class RockPaperScissors {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private RockPaperScissors() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Finds the length of the wood for a board foot.
    *
    * @param width of the wood
    * @param height of the wood
    * @return length needed to be considered a board foot
    */
    static String gameResults(final String playerChoice) {
        Random randomNumber = new Random();
        String[] choices = {"R", "P", "S"};
        int computerIndex = randomNumber.nextInt(3);
        String computerChoice = choices[computerIndex];

        System.out.println("User chooses: " + playerChoice);
        System.out.println("Computer chooses: " + computerChoice);

        if (playerChoice.equals(computerChoice)) {
               return "result1";
        } else if (
                (playerChoice.equals("R") && computerChoice.equals("S")) ||
                (playerChoice.equals("P") && computerChoice.equals("R")) ||
                (playerChoice.equals("S") && computerChoice.equals("P"))
            ) {
                return "result2";
            } else {
                return "result3";
            } 
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
            if (!playerChoice.equals("R") && !playerChoice.equals("P") && !playerChoice.equals("S")) {
                System.out.println("Invalid Input!");
                break;
            } else {
                final String finalResult = gameResults(playerChoice);
                if (finalResult == "result1") {
                    System.out.println("It's a tie!");
                } else if (finalResult == "result2") {
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
