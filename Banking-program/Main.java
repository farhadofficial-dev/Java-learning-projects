import java.util.Scanner;
public class Main {
    // Scanner import
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // variables
        double balance = 0;
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("*****************");
            System.out.println("BANKING PROGRAM");
            System.out.println("*****************");
            System.out.println("1. BALANCE");
            System.out.println("2. DEPOSIT");
            System.out.println("3. WITHDRAW");
            System.out.println("4. EXITE");
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> balance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
            }
        }
        // Exite section
        System.out.println("\nThank You, have a Nice day !");
        scanner.close();
    }

    static void balance(double balance) {
        System.out.println("*****************");
        System.out.printf("$%,.2f\n", balance);
    }

    static double deposit() {
        double amount;
        System.out.print("Enter the amount to be deposited: ");
        amount = scanner.nextDouble();
        if (amount < 0 || amount == 0) {
            System.out.println("Amount can't be negative/zero, please try again");
            return 0;
        }
       return amount;
    }
    static double withdraw(double balance){
        double amount;
        System.out.print("Enter the amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if(amount > balance) {
            System.out.println("INSUFFICIENT BALANCE");
        } if (amount < 0 || amount == 0) {
            System.out.println("Amount can't be negative/zero");
        }
        return amount;
    }
}