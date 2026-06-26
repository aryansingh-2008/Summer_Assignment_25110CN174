import java.util.Scanner;

public class Q119 {

    static Scanner sc = new Scanner(System.in);

    static final int MAX = 30;

    static String[] staffCode = new String[MAX];
    static String[] staffName = new String[MAX];
    static String[] workUnit = new String[MAX];
    static double[] monthlyPay = new double[MAX];
    static int[] experience = new int[MAX];

    static int staffCount = 0;

    static int locateStaff(String code) {

        for (int i = 0; i < staffCount; i++) {

            if (staffCode[i].equalsIgnoreCase(code))
                return i;

        }

        return -1;
    }

    static void registerStaff() {

        if (staffCount == MAX) {

            System.out.println("\nEmployee Limit Reached.");
            return;

        }

        System.out.print("\nStaff Code : ");
        String code = sc.next();

        if (locateStaff(code) != -1) {

            System.out.println("Code Already Exists.");
            return;

        }

        staffCode[staffCount] = code;

        sc.nextLine();

        System.out.print("Staff Name : ");
        staffName[staffCount] = sc.nextLine();

        System.out.print("Department : ");
        workUnit[staffCount] = sc.nextLine();

        System.out.print("Monthly Salary : ");
        monthlyPay[staffCount] = sc.nextDouble();

        while (monthlyPay[staffCount] < 0) {

            System.out.print("Enter Valid Salary : ");
            monthlyPay[staffCount] = sc.nextDouble();

        }

        System.out.print("Experience (Years) : ");
        experience[staffCount] = sc.nextInt();

        while (experience[staffCount] < 0) {

            System.out.print("Enter Valid Experience : ");
            experience[staffCount] = sc.nextInt();

        }

        staffCount++;

        System.out.println("\nEmployee Registered Successfully.");

    }

    static void showDirectory() {

        if (staffCount == 0) {

            System.out.println("\nNo Employee Records.");
            return;

        }

        System.out.println("\n========== EMPLOYEE DIRECTORY ==========");

        for (int i = 0; i < staffCount; i++) {

            System.out.println("\nEmployee " + (i + 1));
            System.out.println("----------------------------");
            System.out.println("Code        : " + staffCode[i]);
            System.out.println("Name        : " + staffName[i]);
            System.out.println("Department  : " + workUnit[i]);
            System.out.println("Salary      : " + monthlyPay[i]);
            System.out.println("Experience  : " + experience[i] + " Years");

        }

    }

    static void searchStaff() {

        if (staffCount == 0) {

            System.out.println("\nNo Employee Records.");
            return;

        }

        System.out.print("\nEnter Staff Code : ");
        String code = sc.next();

        int index = locateStaff(code);

        if (index == -1) {

            System.out.println("Employee Not Found.");
            return;

        }

        System.out.println("\nEmployee Details");
        System.out.println("----------------------------");
        System.out.println("Code        : " + staffCode[index]);
        System.out.println("Name        : " + staffName[index]);
        System.out.println("Department  : " + workUnit[index]);
        System.out.println("Salary      : " + monthlyPay[index]);
        System.out.println("Experience  : " + experience[index] + " Years");

    }

    static void editProfile() {

        if (staffCount == 0) {

            System.out.println("\nNo Employee Records.");
            return;

        }

        System.out.print("\nEnter Staff Code : ");
        String code = sc.next();

        int index = locateStaff(code);

        if (index == -1) {

            System.out.println("Employee Not Found.");
            return;

        }

        sc.nextLine();

        System.out.print("New Name : ");
        staffName[index] = sc.nextLine();

        System.out.print("New Department : ");
        workUnit[index] = sc.nextLine();

        System.out.print("New Salary : ");
        monthlyPay[index] = sc.nextDouble();

        System.out.print("New Experience : ");
        experience[index] = sc.nextInt();

        System.out.println("\nEmployee Profile Updated.");

    }
        static void removeStaff() {

        if (staffCount == 0) {

            System.out.println("\nNo Employee Records.");
            return;

        }

        System.out.print("\nEnter Staff Code : ");
        String code = sc.next();

        int index = locateStaff(code);

        if (index == -1) {

            System.out.println("Employee Not Found.");
            return;

        }

        for (int i = index; i < staffCount - 1; i++) {

            staffCode[i] = staffCode[i + 1];
            staffName[i] = staffName[i + 1];
            workUnit[i] = workUnit[i + 1];
            monthlyPay[i] = monthlyPay[i + 1];
            experience[i] = experience[i + 1];

        }

        staffCount--;

        System.out.println("\nEmployee Removed Successfully.");

    }

    static void increaseSalary() {

        if (staffCount == 0) {

            System.out.println("\nNo Employee Records.");
            return;

        }

        System.out.print("\nEnter Staff Code : ");
        String code = sc.next();

        int index = locateStaff(code);

        if (index == -1) {

            System.out.println("Employee Not Found.");
            return;

        }

        System.out.print("Increment Amount : ");
        double increment = sc.nextDouble();

        if (increment <= 0) {

            System.out.println("Invalid Amount.");
            return;

        }

        monthlyPay[index] += increment;

        System.out.println("\nSalary Updated Successfully.");
        System.out.println("Current Salary : " + monthlyPay[index]);

    }

    static void highestPaidEmployee() {

        if (staffCount == 0) {

            System.out.println("\nNo Employee Records.");
            return;

        }

        int top = 0;

        for (int i = 1; i < staffCount; i++) {

            if (monthlyPay[i] > monthlyPay[top]) {
                top = i;
            }

        }

        System.out.println("\n======= HIGHEST PAID EMPLOYEE =======");
        System.out.println("Code       : " + staffCode[top]);
        System.out.println("Name       : " + staffName[top]);
        System.out.println("Department : " + workUnit[top]);
        System.out.println("Salary     : " + monthlyPay[top]);

    }

    static void departmentReport() {

        if (staffCount == 0) {

            System.out.println("\nNo Employee Records.");
            return;

        }

        sc.nextLine();

        System.out.print("\nEnter Department Name : ");
        String dept = sc.nextLine();

        int total = 0;

        System.out.println("\nEmployees in " + dept);

        for (int i = 0; i < staffCount; i++) {

            if (workUnit[i].equalsIgnoreCase(dept)) {

                total++;

                System.out.println("------------------------");
                System.out.println("Code : " + staffCode[i]);
                System.out.println("Name : " + staffName[i]);
                System.out.println("Pay  : " + monthlyPay[i]);

            }

        }

        System.out.println("\nTotal Employees : " + total);

    }

    static void companySummary() {

        double salaryTotal = 0;

        for (int i = 0; i < staffCount; i++) {

            salaryTotal += monthlyPay[i];

        }

        System.out.println("\n========== COMPANY SUMMARY ==========");

        System.out.println("Total Employees : " + staffCount);

        if (staffCount > 0) {

            System.out.printf("Average Salary : %.2f\n",
                    salaryTotal / staffCount);

        }

    }

    public static void main(String[] args) {

        int option;

        do {

            System.out.println("\n===================================");
            System.out.println("      EMPLOYEE PROFILE MANAGER");
            System.out.println("===================================");
            System.out.println("1. Register Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Show Directory");
            System.out.println("4. Edit Profile");
            System.out.println("5. Increase Salary");
            System.out.println("6. Highest Paid Employee");
            System.out.println("7. Department Report");
            System.out.println("8. Remove Employee");
            System.out.println("9. Company Summary");
            System.out.println("10. Exit");

            System.out.print("\nEnter Option : ");
            option = sc.nextInt();

            switch (option) {

                case 1:
                    registerStaff();
                    break;

                case 2:
                    searchStaff();
                    break;

                case 3:
                    showDirectory();
                    break;

                case 4:
                    editProfile();
                    break;

                case 5:
                    increaseSalary();
                    break;

                case 6:
                    highestPaidEmployee();
                    break;

                case 7:
                    departmentReport();
                    break;

                case 8:
                    removeStaff();
                    break;

                case 9:
                    companySummary();
                    break;

                case 10:
                    System.out.println("\nThank You...");
                    break;

                default:
                    System.out.println("\nInvalid Option.");

            }

        } while (option != 10);

        sc.close();

    }
}