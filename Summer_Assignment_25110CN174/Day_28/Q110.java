import java.util.Scanner;

public class Q110 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] accountNumbers = new int[50];
        String[] customerNames = new String[50];
        double[] balances = new double[50];

        int accountCount = 0;
        int choice;

        do {

            System.out.println("\n========== BANK ACCOUNT MANAGEMENT ==========");
            System.out.println("1. Open New Account");
            System.out.println("2. View All Accounts");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Balance Enquiry");
            System.out.println("6. Exit");
            System.out.print("Enter Choice : ");

            choice = input.nextInt();

            switch (choice) {

                case 1:

                    if (accountCount == 50) {
                        System.out.println("Maximum account limit reached.");
                        break;
                    }

                    System.out.print("Enter Account Number : ");
                    int newAccountNo = input.nextInt();

                    boolean duplicate = false;

                    for (int i = 0; i < accountCount; i++) {
                        if (accountNumbers[i] == newAccountNo) {
                            duplicate = true;
                            break;
                        }
                    }

                    if (duplicate) {
                        System.out.println("Account Number already exists.");
                        break;
                    }

                    accountNumbers[accountCount] = newAccountNo;

                    input.nextLine();

                    System.out.print("Enter Customer Name : ");
                    customerNames[accountCount] = input.nextLine();

                    System.out.print("Enter Opening Balance : ");
                    double openingBalance = input.nextDouble();

                    if (openingBalance < 0) {
                        openingBalance = 0;
                    }

                    balances[accountCount] = openingBalance;
                    accountCount++;

                    System.out.println("Account Created Successfully.");
                    break;

                case 2:

                    if (accountCount == 0) {
                        System.out.println("No accounts available.");
                        break;
                    }

                    System.out.println("\n------ ACCOUNT DETAILS ------");

                    for (int i = 0; i < accountCount; i++) {

                        System.out.println("\nAccount Number : " + accountNumbers[i]);
                        System.out.println("Customer Name  : " + customerNames[i]);
                        System.out.println("Balance        : Rs. " + balances[i]);
                    }

                    break;

                case 3:

                    System.out.print("Enter Account Number : ");
                    int depositAccount = input.nextInt();

                    boolean depositFound = false;

                    for (int i = 0; i < accountCount; i++) {

                        if (accountNumbers[i] == depositAccount) {

                            depositFound = true;

                            System.out.print("Enter Deposit Amount : ");
                            double depositAmount = input.nextDouble();

                            if (depositAmount <= 0) {
                                System.out.println("Amount must be greater than zero.");
                            } else {

                                balances[i] += depositAmount;

                                System.out.println("Amount Deposited Successfully.");
                                System.out.println("Updated Balance : Rs. " + balances[i]);
                            }

                            break;
                        }
                    }

                    if (!depositFound) {
                        System.out.println("Account not found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Account Number : ");
                    int withdrawAccount = input.nextInt();

                    boolean withdrawFound = false;

                    for (int i = 0; i < accountCount; i++) {

                        if (accountNumbers[i] == withdrawAccount) {

                            withdrawFound = true;

                            System.out.print("Enter Withdrawal Amount : ");
                            double withdrawAmount = input.nextDouble();

                            if (withdrawAmount <= 0) {
                                System.out.println("Amount must be greater than zero.");
                            } else if (withdrawAmount > balances[i]) {
                                System.out.println("Insufficient Balance.");
                            } else {

                                balances[i] -= withdrawAmount;

                                System.out.println("Withdrawal Successful.");
                                System.out.println("Remaining Balance : Rs. " + balances[i]);
                            }

                            break;
                        }
                    }

                    if (!withdrawFound) {
                        System.out.println("Account not found.");
                    }

                    break;

                case 5:

                    System.out.print("Enter Account Number : ");
                    int searchAccount = input.nextInt();

                    boolean found = false;

                    for (int i = 0; i < accountCount; i++) {

                        if (accountNumbers[i] == searchAccount) {

                            found = true;

                            System.out.println("\nCustomer Name : " + customerNames[i]);
                            System.out.println("Current Balance : Rs. " + balances[i]);

                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Account not found.");
                    }

                    break;

                case 6:
                    System.out.println("Program Closed Successfully.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

        input.close();
    }
}