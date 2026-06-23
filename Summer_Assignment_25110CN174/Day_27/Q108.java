import java.util.Scanner;

public class Q108 {

    static int[] rollNo = new int[50];
    static String[] name = new String[50];
    static int[][] subjectMarks = new int[50][5];
    static int count = 0;
    static final String[] SUBJECTS = {"Maths", "Physics", "Chemistry", "English", "Computer Science"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- Marksheet Generation System -----");
            System.out.println("1. Add Student Marks");
            System.out.println("2. Generate Marksheet for All Students");
            System.out.println("3. Generate Marksheet by Roll No");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addMarks(sc);
                    break;
                case 2:
                    generateAllMarksheets();
                    break;
                case 3:
                    generateMarksheetByRoll(sc);
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

    static void addMarks(Scanner sc) {
        if (count >= 50) {
            System.out.println("Record limit reached.");
            return;
        }
        System.out.print("Enter Roll No: ");
        rollNo[count] = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name[count] = sc.nextLine();

        for (int j = 0; j < SUBJECTS.length; j++) {
            System.out.print("Enter marks in " + SUBJECTS[j] + " (out of 100): ");
            subjectMarks[count][j] = sc.nextInt();
        }
        count++;
        System.out.println("Marks added successfully.");
    }

    static void printMarksheet(int i) {
        int total = 0;
        for (int j = 0; j < SUBJECTS.length; j++) {
            total += subjectMarks[i][j];
        }
        double percentage = (double) total / SUBJECTS.length;
        String grade;

        if (percentage >= 90) grade = "A+";
        else if (percentage >= 75) grade = "A";
        else if (percentage >= 60) grade = "B";
        else if (percentage >= 40) grade = "C";
        else grade = "Fail";

        System.out.println("\n--------- Marksheet ---------");
        System.out.println("Roll No : " + rollNo[i]);
        System.out.println("Name    : " + name[i]);
        System.out.println("------------------------------");
        for (int j = 0; j < SUBJECTS.length; j++) {
            System.out.println(SUBJECTS[j] + ": " + subjectMarks[i][j]);
        }
        System.out.println("------------------------------");
        System.out.println("Total      : " + total + " / " + (SUBJECTS.length * 100));
        System.out.printf("Percentage : %.2f%%\n", percentage);
        System.out.println("Grade      : " + grade);
        System.out.println("------------------------------");
    }

    static void generateAllMarksheets() {
        if (count == 0) {
            System.out.println("No records found.");
            return;
        }
        for (int i = 0; i < count; i++) {
            printMarksheet(i);
        }
    }

    static void generateMarksheetByRoll(Scanner sc) {
        System.out.print("Enter Roll No: ");
        int r = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (rollNo[i] == r) {
                printMarksheet(i);
                return;
            }
        }
        System.out.println("Student with Roll No " + r + " not found.");
    }
}