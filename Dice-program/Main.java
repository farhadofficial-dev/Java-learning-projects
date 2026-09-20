import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // Dice Roller program witha JAVA

        // Variables
        int numDice;
        int totle = 0;

        // user Input
        System.out.print("Enter the # dice to be rolled: ");
        numDice = scanner.nextInt();

        if (numDice > 0) {
            for (int i = 0; i < numDice; i++) {
                int roll = random.nextInt(1, 7);
                displayDie(roll);
                totle += roll;
                System.out.println("You rolled: " + roll);
                
            }
                System.out.println("Totle: " + totle);
        } else {
            System.out.println("# dice must be greater than 0");
        }
        scanner.close();
    }

    static void displayDie(int roll) {

        String dice1 = """
                 ---------
                |         |
                |    ●    |
                |         |
                 ---------
                    """;

        String dice2 = """
                 ---------
                | ●       |
                |    ●    |
                |         |
                 ---------
                    """;

        String dice3 = """
                 ---------
                | ●       |
                |    ●    |
                |       ● |
                 ---------
                    """;
        
        String dice4 = """
                 ---------
                | ●     ● |
                |         |
                | ●     ● |
                 ---------
                    """;

        String dice5 = """
                 ---------
                | ●     ● |
                |    ●    |
                | ●     ● |
                 ---------
                    """;

        String dice6 = """
                 ---------
                | ●     ● |
                | ●     ● |
                | ●     ● |
                 ---------
                    """;

                    switch(roll) {
                        case 1 -> System.out.println(dice1);
                        case 2 -> System.out.println(dice2);
                        case 3 -> System.out.println(dice3);
                        case 4 -> System.out.println(dice4);
                        case 5 -> System.out.println(dice5);
                        case 6 -> System.out.println(dice6);
                    }
    }

}