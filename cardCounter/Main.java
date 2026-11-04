import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
   public static void main(String[] args) {
    // Card Counter Program
    System.out.println("*******************************");
    System.out.println("Welcome to Card Counter Program");
    System.out.println("*******************************");
    int playerChoice;
    System.out.print("Enter the Card Number (11 = J, 12 = Q, 13 = K, and 14 = A): ");
    playerChoice = scanner.nextInt();
    if(cardCounter(playerChoice) > 0){
        System.out.print(cardCounter(playerChoice) + " Bet");
    } else {
        System.out.print(cardCounter(playerChoice) + " Hold");
    }
}

public static double cardCounter(int userInput){
        int counter = 0;
        if(userInput == 2 || userInput == 3 || userInput == 4 || userInput == 5 || userInput == 6){
            counter++;
        } else if(userInput == 10 || userInput == 11 || userInput == 12 || userInput == 13 || userInput == 14){
            counter--;
        } else {
            counter = userInput;
        }
        return counter;
}
}
