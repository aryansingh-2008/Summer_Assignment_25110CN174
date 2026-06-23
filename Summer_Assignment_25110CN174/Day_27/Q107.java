import java.util.Scanner;

public class Q107 {

    static int[] empId = new int[50];
    static String[] name = new String[50];
    static double[] basicSalary = new double[50];
    static double[] hra = new double[50];
    static double[] da = new double[50];
    static double[] deductions = new double[50];
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- Salary Management System -----");
            System.out.println("1. Add Employee Salary Details");
            System.out.println("2. Display Salary Slip of All Employees");
            System.out.println("3. Search Salary Slip by Employee ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addSalaryDetails(sc);
                    break;
                case 2:
                    displayAllSlips();
                    break;
                case 3:
                    searchSalarySlip(sc);
                    break;
                case 4:
                    System.out.println("Exiting program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        sc.close();
    }

    static void addSalaryDetails(Scanner sc) {
        if (count >= 50) {
            System.out.println("Record limit reached.");
            return;
        }
        System.out.print("Enter Employee ID: ");
        empId[count] = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name[count] = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        basicSalary[count] = sc.nextDouble();
        System.out.print("Enter HRA: ");
        hra[count] = sc.nextDouble();
        System.out.print("Enter DA: ");
        da[count] = sc.nextDouble();
        System.out.print("Enter Deductions: ");
        deductions[count] = sc.nextDouble();
        count++;
        System.out.println("Salary details added successfully.");
    }

    static void printSlip(int i) {
        double gross = basicSalary[i] + hra[i] + da[i];
        double netSalary = gross - deductions[i];

        System.out.println("\n--------- Salary Slip ---------");
        System.out.println("Employee ID : " + empId[i]);
        System.out.println("Name        : " + name[i]);
        System.out.println("Basic Salary: " + basicSalary[i]);
        System.out.println("HRA         : " + hra[i]);
        System.out.println("DA          : " + da[i]);
        System.out.println("Gross Salary: " + gross);
        System.out.println("Deductions  : " + deductions[i]);
        System.out.println("Net Salary  : " + netSalary);
        System.out.println("--------------------------------");
    }

    static void displayAllSlips() {
        if (count == 0) {
            System.out.println("No records found.");
            return;
        }
        for (int i = 0; i < count; i++) {
            printSlip(i);
        }
    }

    static void searchSalarySlip(Scanner sc) {
        System.out.print("Enter Employee ID to search: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (empId[i] == id) {
                printSlip(i);
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }
}