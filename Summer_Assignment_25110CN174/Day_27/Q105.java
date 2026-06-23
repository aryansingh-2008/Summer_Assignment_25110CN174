import java.util.Scanner;

public class Q105 {

    static int[] rollNo = new int[50];
    static String[] name = new String[50];
    static String[] branch = new String[50];
    static double[] marks = new double[50];
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- Student Record Management System -----");
            System.out.println("1. Add Student Record");
            System.out.println("2. Display All Records");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Delete Student Record");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    searchStudent(sc);
                    break;
                case 4:
                    deleteStudent(sc);
                    break;
                case 5:
                    System.out.println("Exiting program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        sc.close();
    }

    static void addStudent(Scanner sc) {
        if (count >= 50) {
            System.out.println("Record limit reached.");
            return;
        }
        System.out.print("Enter Roll No: ");
        rollNo[count] = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name[count] = sc.nextLine();
        System.out.print("Enter Branch: ");
        branch[count] = sc.nextLine();
        System.out.print("Enter Marks: ");
        marks[count] = sc.nextDouble();
        count++;
        System.out.println("Student record added successfully.");
    }

    static void displayStudents() {
        if (count == 0) {
            System.out.println("No records found.");
            return;
        }
        System.out.println("\nRoll No\tName\t\tBranch\t\tMarks");
        for (int i = 0; i < count; i++) {
            System.out.println(rollNo[i] + "\t" + name[i] + "\t\t" + branch[i] + "\t\t" + marks[i]);
        }
    }

    static void searchStudent(Scanner sc) {
        System.out.print("Enter Roll No to search: ");
        int r = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (rollNo[i] == r) {
                System.out.println("Name: " + name[i]);
                System.out.println("Branch: " + branch[i]);
                System.out.println("Marks: " + marks[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with Roll No " + r + " not found.");
        }
    }

    static void deleteStudent(Scanner sc) {
        System.out.print("Enter Roll No to delete: ");
        int r = sc.nextInt();
        int pos = -1;
        for (int i = 0; i < count; i++) {
            if (rollNo[i] == r) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Student not found.");
            return;
        }
        for (int i = pos; i < count - 1; i++) {
            rollNo[i] = rollNo[i + 1];
            name[i] = name[i + 1];
            branch[i] = branch[i + 1];
            marks[i] = marks[i + 1];
        }
        count--;
        System.out.println("Student record deleted successfully.");
    }
}