package Practical__Projects.number_G;

import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        // Random
        Random random = new Random();

        // Scanner
        Scanner scanner = new Scanner(System.in);

        /** NUMBER GUSSING GAME */ 

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("WELCOME TO NUMBER GUSSING GAME");

        do {
            System.out.printf("Enter a number between %d - %d\n", min, max);
            guess = scanner.nextInt();
            attempts ++;
            if(guess < randomNumber){
                System.out.println("To Low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("To High! Try again.");
            } else {
                System.out.println("CORRECT.");
            }

        } while (guess != randomNumber);

        System.out.println("You Won!");
        System.out.println("# of atempts: " + attempts);
        scanner.close();
    }
}
