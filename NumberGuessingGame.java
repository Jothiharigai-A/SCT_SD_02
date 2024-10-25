import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;
        int userGuess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a random number between 1 and 100.");
        System.out.println("Can you guess what it is?");

        // Loop until the user guesses the correct number
        while (userGuess != randomNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number: " + randomNumber);
                System.out.println("It took you " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}
