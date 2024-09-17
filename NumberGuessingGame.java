import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int totalRounds = 0;
        int totalScore = 0;

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
            int maxAttempts = 10;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("Guess the number between 1 and 100. You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    totalScore += maxAttempts - attempts + 1; // Higher score for fewer attempts
                    guessedCorrectly = true;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The correct number was " + numberToGuess + ".");
            }

            totalRounds++;

            // Ask if the player wants to play again
            System.out.print("Do you want to play another round? (yes/no): ");
            String response = scanner.next().toLowerCase();
            playAgain = response.equals("yes");

            // Display score after each round
            System.out.println("Total Rounds: " + totalRounds + ", Total Score: " + totalScore);
        }

        System.out.println("Thank you for playing! Final Score: " + totalScore + " after " + totalRounds + " rounds.");
        scanner.close();
    }
}
