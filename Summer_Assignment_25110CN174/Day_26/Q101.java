import java.util.Random;
import java.util.Scanner;

public class Q101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int target = rand.nextInt(100) + 1; // random number 1-100
        int maxAttempts = 7;
        int attempts = 0;
        boolean won = false;

        System.out.println("===== NUMBER GUESSING GAME =====");
        System.out.println("Guess a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts.\n");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attempts++;

            if (guess == target) {
                won = true;
                break;
            } else if (guess < target) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
            System.out.println("Attempts left: " + (maxAttempts - attempts));
        }

        if (won) {
            System.out.println("\nCongratulations! You guessed it in " + attempts + " attempts.");
        } else {
            System.out.println("\nGame over! The correct number was: " + target);
        }
        sc.close();
    }
}