import java.util.Scanner;

public class Q117 {

    static Scanner sc = new Scanner(System.in);

    static final int LIMIT = 50;

    static String[] regId = new String[LIMIT];
    static String[] fullName = new String[LIMIT];

    static int[] javaMarks = new int[LIMIT];
    static int[] mathsMarks = new int[LIMIT];
    static int[] englishMarks = new int[LIMIT];

    static int[] total = new int[LIMIT];
    static double[] percentage = new double[LIMIT];
    static char[] grade = new char[LIMIT];
    static String[] result = new String[LIMIT];

    static int recordCount = 0;

    static int locateStudent(String id) {

        for (int i = 0; i < recordCount; i++) {

            if (regId[i].equalsIgnoreCase(id))
                return i;

        }

        return -1;
    }

    static char findGrade(double per) {

        if (per >= 90)
            return 'A';
        else if (per >= 75)
            return 'B';
        else if (per >= 60)
            return 'C';
        else if (per >= 40)
            return 'D';
        else
            return 'F';

    }

    static void calculateResult(int index) {

        total[index] =
                javaMarks[index]
                + mathsMarks[index]
                + englishMarks[index];

        percentage[index] = total[index] / 3.0;

        grade[index] = findGrade(percentage[index]);

        if (javaMarks[index] >= 33 &&
                mathsMarks[index] >= 33 &&
                englishMarks[index] >= 33) {

            result[index] = "PASS";

        } else {

            result[index] = "FAIL";

        }

    }

    static void registerStudent() {

        if (recordCount == LIMIT) {

            System.out.println("\nStorage Full.");
            return;

        }

        System.out.print("\nRegistration ID : ");
        String id = sc.next();

        if (locateStudent(id) != -1) {

            System.out.println("Registration ID Already Exists.");
            return;

        }

        regId[recordCount] = id;

        sc.nextLine();

        System.out.print("Student Name : ");
        fullName[recordCount] = sc.nextLine();

        System.out.print("Java Marks : ");
        javaMarks[recordCount] = sc.nextInt();

        System.out.print("Mathematics Marks : ");
        mathsMarks[recordCount] = sc.nextInt();

        System.out.print("English Marks : ");
        englishMarks[recordCount] = sc.nextInt();

        while (javaMarks[recordCount] < 0 || javaMarks[recordCount] > 100) {

            System.out.print("Enter Valid Java Marks : ");
            javaMarks[recordCount] = sc.nextInt();

        }

        while (mathsMarks[recordCount] < 0 || mathsMarks[recordCount] > 100) {

            System.out.print("Enter Valid Maths Marks : ");
            mathsMarks[recordCount] = sc.nextInt();

        }

        while (englishMarks[recordCount] < 0 || englishMarks[recordCount] > 100) {

            System.out.print("Enter Valid English Marks : ");
            englishMarks[recordCount] = sc.nextInt();

        }

        calculateResult(recordCount);

        recordCount++;

        System.out.println("\nStudent Registered Successfully.");

    }

    static void displayAllStudents() {

        if (recordCount == 0) {

            System.out.println("\nNo Records Available.");
            return;

        }

        System.out.println("\n==============================");
        System.out.println("      ACADEMIC RECORDS");
        System.out.println("==============================");

        for (int i = 0; i < recordCount; i++) {

            System.out.println("\nStudent : " + (i + 1));
            System.out.println("------------------------------");
            System.out.println("Registration : " + regId[i]);
            System.out.println("Name         : " + fullName[i]);
            System.out.println("Java         : " + javaMarks[i]);
            System.out.println("Mathematics  : " + mathsMarks[i]);
            System.out.println("English      : " + englishMarks[i]);
            System.out.println("Total        : " + total[i]);
            System.out.printf("Percentage   : %.2f%%\n", percentage[i]);
            System.out.println("Grade        : " + grade[i]);
            System.out.println("Result       : " + result[i]);

        }

    }
        static void searchStudent() {

        if (recordCount == 0) {
            System.out.println("\nNo Records Available.");
            return;
        }

        System.out.print("\nEnter Registration ID : ");
        String id = sc.next();

        int index = locateStudent(id);

        if (index == -1) {
            System.out.println("\nStudent Not Found.");
            return;
        }

        System.out.println("\n========== STUDENT REPORT ==========");
        System.out.println("Registration : " + regId[index]);
        System.out.println("Name         : " + fullName[index]);
        System.out.println("Java         : " + javaMarks[index]);
        System.out.println("Mathematics  : " + mathsMarks[index]);
        System.out.println("English      : " + englishMarks[index]);
        System.out.println("Total        : " + total[index]);
        System.out.printf("Percentage   : %.2f%%\n", percentage[index]);
        System.out.println("Grade        : " + grade[index]);
        System.out.println("Result       : " + result[index]);

    }

    static void modifyRecord() {

        if (recordCount == 0) {
            System.out.println("\nNo Records Available.");
            return;
        }

        System.out.print("\nEnter Registration ID : ");
        String id = sc.next();

        int index = locateStudent(id);

        if (index == -1) {
            System.out.println("\nStudent Not Found.");
            return;
        }

        sc.nextLine();

        System.out.print("New Student Name : ");
        fullName[index] = sc.nextLine();

        System.out.print("Java Marks : ");
        javaMarks[index] = sc.nextInt();

        System.out.print("Mathematics Marks : ");
        mathsMarks[index] = sc.nextInt();

        System.out.print("English Marks : ");
        englishMarks[index] = sc.nextInt();

        while (javaMarks[index] < 0 || javaMarks[index] > 100) {
            System.out.print("Enter Valid Java Marks : ");
            javaMarks[index] = sc.nextInt();
        }

        while (mathsMarks[index] < 0 || mathsMarks[index] > 100) {
            System.out.print("Enter Valid Maths Marks : ");
            mathsMarks[index] = sc.nextInt();
        }

        while (englishMarks[index] < 0 || englishMarks[index] > 100) {
            System.out.print("Enter Valid English Marks : ");
            englishMarks[index] = sc.nextInt();
        }

        calculateResult(index);

        System.out.println("\nRecord Updated Successfully.");

    }

    static void removeRecord() {

        if (recordCount == 0) {
            System.out.println("\nNo Records Available.");
            return;
        }

        System.out.print("\nEnter Registration ID : ");
        String id = sc.next();

        int index = locateStudent(id);

        if (index == -1) {
            System.out.println("\nStudent Not Found.");
            return;
        }

        for (int i = index; i < recordCount - 1; i++) {

            regId[i] = regId[i + 1];
            fullName[i] = fullName[i + 1];

            javaMarks[i] = javaMarks[i + 1];
            mathsMarks[i] = mathsMarks[i + 1];
            englishMarks[i] = englishMarks[i + 1];

            total[i] = total[i + 1];
            percentage[i] = percentage[i + 1];
            grade[i] = grade[i + 1];
            result[i] = result[i + 1];

        }

        recordCount--;

        System.out.println("\nRecord Deleted Successfully.");

    }

    static void topperReport() {

        if (recordCount == 0) {
            System.out.println("\nNo Records Available.");
            return;
        }

        int top = 0;

        for (int i = 1; i < recordCount; i++) {

            if (percentage[i] > percentage[top]) {
                top = i;
            }

        }

        System.out.println("\n========= TOP PERFORMER =========");
        System.out.println("Registration : " + regId[top]);
        System.out.println("Name         : " + fullName[top]);
        System.out.printf("Percentage   : %.2f%%\n", percentage[top]);
        System.out.println("Grade        : " + grade[top]);

    }

    static void lowestPerformer() {

        if (recordCount == 0) {
            System.out.println("\nNo Records Available.");
            return;
        }

        int low = 0;

        for (int i = 1; i < recordCount; i++) {

            if (percentage[i] < percentage[low]) {
                low = i;
            }

        }

        System.out.println("\n======= NEEDS IMPROVEMENT =======");
        System.out.println("Registration : " + regId[low]);
        System.out.println("Name         : " + fullName[low]);
        System.out.printf("Percentage   : %.2f%%\n", percentage[low]);
        System.out.println("Grade        : " + grade[low]);

    }
        static void showStatistics() {

        if (recordCount == 0) {
            System.out.println("\nNo Records Available.");
            return;
        }

        double sum = 0;
        int pass = 0;
        int fail = 0;

        for (int i = 0; i < recordCount; i++) {

            sum += percentage[i];

            if (result[i].equals("PASS"))
                pass++;
            else
                fail++;

        }

        System.out.println("\n========== CLASS STATISTICS ==========");
        System.out.printf("Average Percentage : %.2f%%\n", (sum / recordCount));
        System.out.println("Pass Students      : " + pass);
        System.out.println("Fail Students      : " + fail);
        System.out.println("Total Students     : " + recordCount);

    }

    static void meritList() {

        if (recordCount == 0) {
            System.out.println("\nNo Records Available.");
            return;
        }

        int[] order = new int[recordCount];

        for (int i = 0; i < recordCount; i++) {
            order[i] = i;
        }

        for (int i = 0; i < recordCount - 1; i++) {

            for (int j = i + 1; j < recordCount; j++) {

                if (percentage[order[j]] > percentage[order[i]]) {

                    int temp = order[i];
                    order[i] = order[j];
                    order[j] = temp;

                }

            }

        }

        System.out.println("\n=========== MERIT LIST ===========");

        for (int i = 0; i < recordCount; i++) {

            int k = order[i];

            System.out.printf("%d. %s (%s) - %.2f%%\n",
                    i + 1,
                    fullName[k],
                    regId[k],
                    percentage[k]);

        }

    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n=========================================");
            System.out.println("     ACADEMIC RECORD MANAGEMENT");
            System.out.println("=========================================");
            System.out.println("1. Register Student");
            System.out.println("2. Display All Records");
            System.out.println("3. Search Student");
            System.out.println("4. Modify Student");
            System.out.println("5. Remove Student");
            System.out.println("6. Top Performer");
            System.out.println("7. Lowest Performer");
            System.out.println("8. Merit List");
            System.out.println("9. Class Statistics");
            System.out.println("10. Exit");

            System.out.print("\nEnter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    registerStudent();
                    break;

                case 2:
                    displayAllStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    modifyRecord();
                    break;

                case 5:
                    removeRecord();
                    break;

                case 6:
                    topperReport();
                    break;

                case 7:
                    lowestPerformer();
                    break;

                case 8:
                    meritList();
                    break;

                case 9:
                    showStatistics();
                    break;

                case 10:
                    System.out.println("\nProject Closed Successfully...");
                    break;

                default:
                    System.out.println("\nInvalid Choice.");

            }

        } while (choice != 10);

        sc.close();
    }
}