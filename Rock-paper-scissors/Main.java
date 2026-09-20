import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // Rock Paper Scissors Game
        System.out.println("*********************************");
        System.out.println("WELCOME TO R.P.S GAME WITH JAVA");
        System.out.println("*********************************");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // declare variables
        String[] choices = { "rock", "paper", "scissors" };
        String playerChoice;
        String computerChoice;
        int wins = 0;
        int loses = 0;
        int ties = 0;
        String isPlaying;

        do{
                    // get user choice

        System.out.print("Enter your choice: ");
        playerChoice = scanner.nextLine().toLowerCase();

        if (!playerChoice.equals("paper") && !playerChoice.equals("scissors") && !playerChoice.equals("rock")) {
            System.out.println("Invalid choice!");
        }

        // make random choice for computer

        computerChoice = choices[random.nextInt(3)];
        System.out.println("Computer choice: " + computerChoice);

        // win, lose, tie condations

        if (computerChoice.equals(playerChoice)) {
            System.out.println("It's a tie!");
            ties ++;
            System.out.println();
        } else if (computerChoice.equals("scissors") && playerChoice.equals("rock")) {
            System.out.println("You win!");
            wins ++;
            System.out.println();
        } else if (computerChoice.equals("rock") && playerChoice.equals("paper")) {
            System.out.println("You win!");
            wins ++;
            System.out.println();
        } else if (computerChoice.equals("paper") && playerChoice.equals("scissors")) {
            System.out.println("You win!");
            wins ++;
            System.out.println();
        } else {
            System.out.println("You lose!");
            loses ++;
            System.out.println();
        }

        System.out.print("Do you want to play again (yes/no): ");
        isPlaying = scanner.nextLine().toLowerCase();
        System.out.println();
        }while(isPlaying.equals("yes"));
        // end  of while loop

        System.out.println("You scores: ");
        System.out.println("Wins: " + wins);
        System.out.println("Loses: " + loses);
        System.out.println("Ties: " + ties);
        System.out.println("********************");
        System.out.println("Thanks for playing!");
        System.out.println("********************");
        scanner.close();
    }
}