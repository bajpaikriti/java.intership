public class GuessingGame {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int score = 0;
        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = (int) (Math.random() * 100) + 1;
            int numberOfAttempts = 10;
            boolean hasGuessedCorrectly = false;

            System.out.println("Guess the number between 1 and 100. You have " + numberOfAttempts + " attempts.");

            while (numberOfAttempts > 0 && !hasGuessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                numberOfAttempts--;

                if (userGuess == numberToGuess) {
                    hasGuessedCorrectly = true;
                    score++;
                    System.out.println("Congratulations! You've guessed the number.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Your guess is too high. You have " + numberOfAttempts + " attempts left.");
                } else {
                    System.out.println("Your guess is too low. You have " + numberOfAttempts + " attempts left.");
                }
            }

            if (!hasGuessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + numberToGuess);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        }

        System.out.println("Your final score is: " + score);
        scanner.close();
    }
}
