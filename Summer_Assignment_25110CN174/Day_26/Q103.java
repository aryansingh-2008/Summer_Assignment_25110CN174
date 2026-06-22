import java.util.Scanner;
import java.util.InputMismatchException;

public class Q103 {
    static double balance = 50000.0;
    static String correctPin = "9999";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter PIN: ");
        String pin = sc.next();

        if (!pin.equals(correctPin)) {
            System.out.println("Incorrect PIN. Access denied.");
            sc.close();
            return;
        }

        int choice = 0;

        while (true) {
            System.out.println("\n----- ATM MENU -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            if (sc.hasNextInt()) {
                choice = sc.nextInt();
            } else {
                System.out.println("Invalid input! Please enter a number (1-4).");
                sc.next(); // discard the bad token
                continue;
            }

            if (choice == 1) {
                System.out.println("Current Balance: Rs. " + balance);

            } else if (choice == 2) {
                System.out.print("Enter amount to deposit: ");
                if (sc.hasNextDouble()) {
                    double depositAmt = sc.nextDouble();
                    if (depositAmt > 0) {
                        balance += depositAmt;
                        System.out.println("Deposit successful. New Balance: Rs. " + balance);
                    } else {
                        System.out.println("Invalid amount.");
                    }
                } else {
                    System.out.println("Invalid amount entered.");
                    sc.next();
                }

            } else if (choice == 3) {
                System.out.print("Enter amount to withdraw: ");
                if (sc.hasNextDouble()) {
                    double withdrawAmt = sc.nextDouble();
                    if (withdrawAmt > balance) {
                        System.out.println("Insufficient balance.");
                    } else if (withdrawAmt <= 0) {
                        System.out.println("Invalid amount.");
                    } else {
                        balance -= withdrawAmt;
                        System.out.println("Withdrawal successful. New Balance: Rs. " + balance);
                    }
                } else {
                    System.out.println("Invalid amount entered.");
                    sc.next();
                }

            } else if (choice == 4) {
                System.out.println("Thank you for using the ATM!");
                break;

            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}