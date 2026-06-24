import java.util.Scanner;

public class Q109 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] bookIds = new int[50];
        String[] bookNames = new String[50];
        String[] writerNames = new String[50];
        boolean[] bookIssued = new boolean[50];

        int bookCount = 0;
        int choice;

        do {

            System.out.println("\n========== LIBRARY MANAGEMENT ==========");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Book");
            System.out.println("6. Exit");
            System.out.print("Enter Choice : ");

            while (!input.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                input.next();
            }

            choice = input.nextInt();

            switch (choice) {

                case 1:

                    if (bookCount == 50) {
                        System.out.println("Library is full.");
                        break;
                    }

                    System.out.print("Enter Book ID : ");

                    while (!input.hasNextInt()) {
                        System.out.println("Please enter a valid ID.");
                        input.next();
                    }

                    int newBookId = input.nextInt();

                    boolean duplicateBook = false;

                    for (int i = 0; i < bookCount; i++) {
                        if (bookIds[i] == newBookId) {
                            duplicateBook = true;
                            break;
                        }
                    }

                    if (duplicateBook) {
                        System.out.println("Book ID already exists.");
                        break;
                    }

                    bookIds[bookCount] = newBookId;

                    input.nextLine();

                    System.out.print("Enter Book Name : ");
                    bookNames[bookCount] = input.nextLine();

                    System.out.print("Enter Author Name : ");
                    writerNames[bookCount] = input.nextLine();

                    bookIssued[bookCount] = false;
                    bookCount++;

                    System.out.println("Book added successfully.");
                    break;

                case 2:

                    if (bookCount == 0) {
                        System.out.println("No books available.");
                        break;
                    }

                    System.out.println("\n----- BOOK DETAILS -----");

                    for (int i = 0; i < bookCount; i++) {

                        String status;

                        if (bookIssued[i]) {
                            status = "Issued";
                        } else {
                            status = "Available";
                        }

                        System.out.println("\nBook ID : " + bookIds[i]);
                        System.out.println("Book Name : " + bookNames[i]);
                        System.out.println("Author : " + writerNames[i]);
                        System.out.println("Status : " + status);
                    }

                    break;

                case 3:

                    System.out.print("Enter Book ID to Issue : ");

                    while (!input.hasNextInt()) {
                        System.out.println("Please enter a valid ID.");
                        input.next();
                    }

                    int issueId = input.nextInt();

                    boolean issueStatus = false;

                    for (int i = 0; i < bookCount; i++) {

                        if (bookIds[i] == issueId) {

                            issueStatus = true;

                            if (bookIssued[i]) {
                                System.out.println("Book is already issued.");
                            } else {
                                bookIssued[i] = true;
                                System.out.println("Book issued successfully.");
                            }

                            break;
                        }
                    }

                    if (!issueStatus) {
                        System.out.println("Book not found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Book ID to Return : ");

                    while (!input.hasNextInt()) {
                        System.out.println("Please enter a valid ID.");
                        input.next();
                    }

                    int returnId = input.nextInt();

                    boolean returnStatus = false;

                    for (int i = 0; i < bookCount; i++) {

                        if (bookIds[i] == returnId) {

                            returnStatus = true;

                            if (!bookIssued[i]) {
                                System.out.println("This book was not issued.");
                            } else {
                                bookIssued[i] = false;
                                System.out.println("Book returned successfully.");
                            }

                            break;
                        }
                    }

                    if (!returnStatus) {
                        System.out.println("Book not found.");
                    }

                    break;

                case 5:

                    input.nextLine();

                    System.out.print("Enter Book Name : ");
                    String searchBook = input.nextLine();

                    boolean foundBook = false;

                    for (int i = 0; i < bookCount; i++) {

                        if (bookNames[i].toLowerCase().contains(searchBook.toLowerCase())) {

                            System.out.println("\nBook ID : " + bookIds[i]);
                            System.out.println("Author : " + writerNames[i]);
                            System.out.println("Status : " +
                                    (bookIssued[i] ? "Issued" : "Available"));

                            foundBook = true;
                        }
                    }

                    if (!foundBook) {
                        System.out.println("No matching book found.");
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