import java.util.Scanner;

class Calculator {

    Scanner sc = new Scanner(System.in);

    double num1, num2;

    void getNumbers() {
        System.out.print("Enter First Number : ");
        num1 = sc.nextDouble();

        System.out.print("Enter Second Number : ");
        num2 = sc.nextDouble();
    }

    void menu() {
        System.out.println("\n========== CALCULATOR ==========");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Power");
        System.out.println("7. Maximum");
        System.out.println("8. Minimum");
        System.out.println("9. Exit");
        System.out.print("Enter Choice : ");
    }

    void calculate(int choice) {

        if (choice == 9) {
            System.out.println("Calculator Closed.");
            return;
        }

        getNumbers();

        switch (choice) {

            case 1:
                System.out.println("Answer = " + (num1 + num2));
                break;

            case 2:
                System.out.println("Answer = " + (num1 - num2));
                break;

            case 3:
                System.out.println("Answer = " + (num1 * num2));
                break;

            case 4:
                if (num2 == 0)
                    System.out.println("Cannot Divide by Zero.");
                else
                    System.out.println("Answer = " + (num1 / num2));
                break;

            case 5:
                if (num2 == 0)
                    System.out.println("Cannot Find Modulus.");
                else
                    System.out.println("Answer = " + (num1 % num2));
                break;

            case 6:
                double result = 1;

                for (int i = 1; i <= (int) num2; i++) {
                    result *= num1;
                }

                System.out.println("Answer = " + result);
                break;

            case 7:
                if (num1 > num2)
                    System.out.println("Maximum = " + num1);
                else
                    System.out.println("Maximum = " + num2);
                break;

            case 8:
                if (num1 < num2)
                    System.out.println("Minimum = " + num1);
                else
                    System.out.println("Minimum = " + num2);
                break;

            default:
                System.out.println("Invalid Choice!");
        }
    }
}

public class Q113 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculator obj = new Calculator();

        int choice;

        do {

            obj.menu();
            choice = sc.nextInt();

            obj.calculate(choice);

        } while (choice != 9);

        sc.close();
    }
}