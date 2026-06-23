import java.util.Scanner;

public class Q106 {

    static int[] empId = new int[50];
    static String[] name = new String[50];
    static String[] department = new String[50];
    static double[] salary = new double[50];
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- Employee Management System -----");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Update Employee Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addEmployee(sc);
                    break;
                case 2:
                    displayEmployees();
                    break;
                case 3:
                    searchEmployee(sc);
                    break;
                case 4:
                    updateSalary(sc);
                    break;
                case 5:
                    deleteEmployee(sc);
                    break;
                case 6:
                    System.out.println("Exiting program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);

        sc.close();
    }

    static void addEmployee(Scanner sc) {
        if (count >= 50) {
            System.out.println("Record limit reached.");
            return;
        }
        System.out.print("Enter Employee ID: ");
        empId[count] = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name[count] = sc.nextLine();
        System.out.print("Enter Department: ");
        department[count] = sc.nextLine();
        System.out.print("Enter Salary: ");
        salary[count] = sc.nextDouble();
        count++;
        System.out.println("Employee added successfully.");
    }

    static void displayEmployees() {
        if (count == 0) {
            System.out.println("No records found.");
            return;
        }
        System.out.println("\nEmp ID\tName\t\tDepartment\tSalary");
        for (int i = 0; i < count; i++) {
            System.out.println(empId[i] + "\t" + name[i] + "\t\t" + department[i] + "\t" + salary[i]);
        }
    }

    static void searchEmployee(Scanner sc) {
        System.out.print("Enter Employee ID to search: ");
        int id = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (empId[i] == id) {
                System.out.println("Name: " + name[i]);
                System.out.println("Department: " + department[i]);
                System.out.println("Salary: " + salary[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    static void updateSalary(Scanner sc) {
        System.out.print("Enter Employee ID to update: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (empId[i] == id) {
                System.out.print("Enter new salary: ");
                salary[i] = sc.nextDouble();
                System.out.println("Salary updated successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    static void deleteEmployee(Scanner sc) {
        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();
        int pos = -1;
        for (int i = 0; i < count; i++) {
            if (empId[i] == id) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Employee not found.");
            return;
        }
        for (int i = pos; i < count - 1; i++) {
            empId[i] = empId[i + 1];
            name[i] = name[i + 1];
            department[i] = department[i + 1];
            salary[i] = salary[i + 1];
        }
        count--;
        System.out.println("Employee deleted successfully.");
    }
}