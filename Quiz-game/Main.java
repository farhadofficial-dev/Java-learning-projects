import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        // Java Quiz Game

        // Questions : array

        String[] questions = { "What is called the Brain of computer?",
                "Which year the facebook lunched?",
                "Who is the father of computers?",
                "What is the first programming language?",
                "where Afghanistan is located?" };

        // Options(answers)

        String[][] options = { { "1. CPU", "2. GPU", "3. ROM", "4. RAM" },
                { "1. 2000", "2. 2004", "3. 2006", "4. 2003" },
                { "1. Charles Babbage", "2. Elan Mask", "3. Mark Zeker Berg", "4. Farhad" },
                { "1. C", "2. C#", "3. FORTRAN", "4. JAVA" },
                { "1. EUROPE", "2. AUSTRIALA", "3. AFRICA", "4. ASIA" } };

        // Variables and scanner
        Scanner scanner = new Scanner(System.in);
        int[] answer = { 1, 2, 1, 3, 4 };
        int guess;
        int score = 0;
        boolean isPlay;

        do {
            System.out.println("****************************");
            System.out.println("WELCOM TO JAVA QUIZ GAME !");
            System.out.println("****************************");

            for(int i = 0; i < questions.length; i++){
                System.out.println(questions[i]);
                for(String option: options[i]) {
                    System.out.println(option);
                }
                System.out.print("Your guess: ");
                guess = scanner.nextInt();

                if(guess == answer[i]){
                    System.out.println("*********");
                    System.out.println("CORRECT!");
                    System.out.println("*********");
                    score ++;

                } else if(guess != answer[i]){
                    System.out.println("*********");
                    System.out.println("WRONG!");
                    System.out.println("*********");
                } 
                else {
                    System.out.println("Options must be int (1-4)!");
                }
                
            }
            if(score == 5) {
                    System.out.println("WOW YOU DO CORRECT ALL !!!");
                    System.out.println("\nYour final score is: " + score + " out of " + 5);
                } else {
                    System.out.println("\nYour final score is: " + score + " out of " + 5);
                }
            
            System.out.print("Do you want to play again (true/false): ");
            isPlay = scanner.nextBoolean();
        } while (isPlay);
        System.out.println("***************************");
        System.out.println("Thank you, have a nice day!");
        System.out.println("***************************");

        scanner.close();
    }
}