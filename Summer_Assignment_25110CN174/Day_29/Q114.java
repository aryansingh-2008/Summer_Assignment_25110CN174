import java.util.Scanner;

public class Q114 {
    static int[] arr = new int[50];
    static int size = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // ---------- Menu ----------
            System.out.println("\n----- Array Operations System -----");
            System.out.println("1. Insert Element");
            System.out.println("2. Delete Element");
            System.out.println("3. Search Element");
            System.out.println("4. Display Array");
            System.out.println("5. Sort Array");
            System.out.println("6. Find Sum and Average");
            System.out.println("7. Find Maximum and Minimum");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            while (!sc.hasNextInt()) {
                System.out.print("Invalid input. Enter a number: ");
                sc.next();
            }
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    insertElement(sc);
                    break;
                case 2:
                    deleteElement(sc);
                    break;
                case 3:
                    searchElement(sc);
                    break;
                case 4:
                    displayArray();
                    break;
                case 5:
                    sortArray();
                    break;
                case 6:
                    sumAndAverage();
                    break;
                case 7:
                    maxAndMin();
                    break;
                case 8:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select between 1-8.");
            }

        } while (choice != 8);

        sc.close();
    }

    // ---------- Insert ----------
    static void insertElement(Scanner sc) {
        if (size >= arr.length) {
            System.out.println("Array is full. Cannot insert more elements.");
            return;
        }
        System.out.print("Enter element to insert: ");
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input. Enter a number: ");
            sc.next();
        }
        int val = sc.nextInt();
        arr[size] = val;
        size++;
        System.out.println("Element inserted successfully.");
    }

    // ---------- Delete ----------
    static void deleteElement(Scanner sc) {
        if (size == 0) {
            System.out.println("Array is empty. Nothing to delete.");
            return;
        }
        System.out.print("Enter element to delete: ");
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input. Enter a number: ");
            sc.next();
        }
        int val = sc.nextInt();
        int pos = -1;

        for (int i = 0; i < size; i++) {
            if (arr[i] == val) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Element not found.");
        } else {
            for (int i = pos; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
            System.out.println("Element deleted successfully.");
        }
    }

    // ---------- Search ----------
    static void searchElement(Scanner sc) {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        System.out.print("Enter element to search: ");
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input. Enter a number: ");
            sc.next();
        }
        int val = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (arr[i] == val) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }
    }

    // ---------- Display ----------
    static void displayArray() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // ---------- Sort ----------
    static void sortArray() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        int[] temp = new int[size];
        for (int i = 0; i < size; i++) {
            temp[i] = arr[i];
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (temp[j] > temp[j + 1]) {
                    int t = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = t;
                }
            }
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }

    // ---------- Sum and Average ----------
    static void sumAndAverage() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / size;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }

    // ---------- Max and Min ----------
    static void maxAndMin() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
