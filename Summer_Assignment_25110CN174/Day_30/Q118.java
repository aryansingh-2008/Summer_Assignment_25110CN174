import java.util.Scanner;

public class Q118 {

    static Scanner sc = new Scanner(System.in);

    static final int LIMIT = 30;

    static String[] accessionNo = new String[LIMIT];
    static String[] bookLabel = new String[LIMIT];
    static String[] writerName = new String[LIMIT];
    static boolean[] borrowed = new boolean[LIMIT];

    static int bookCount = 0;

    static int locateBook(String code) {

        for (int i = 0; i < bookCount; i++) {

            if (accessionNo[i].equalsIgnoreCase(code)) {
                return i;
            }

        }

        return -1;
    }

    static void registerBook() {

        if (bookCount == LIMIT) {

            System.out.println("\nNo Space Available.");
            return;

        }

        System.out.print("\nAccession Number : ");
        String code = sc.next();

        if (locateBook(code) != -1) {

            System.out.println("Book Already Registered.");
            return;

        }

        accessionNo[bookCount] = code;

        sc.nextLine();

        System.out.print("Book Title : ");
        bookLabel[bookCount] = sc.nextLine();

        System.out.print("Writer Name : ");
        writerName[bookCount] = sc.nextLine();

        borrowed[bookCount] = false;

        bookCount++;

        System.out.println("\nNew Book Registered.");

    }

    static void showShelf() {

        if (bookCount == 0) {

            System.out.println("\nLibrary Shelf is Empty.");
            return;

        }

        System.out.println("\n========== BOOK SHELF ==========");

        for (int i = 0; i < bookCount; i++) {

            System.out.println("\nRecord : " + (i + 1));
            System.out.println("----------------------------");
            System.out.println("Code   : " + accessionNo[i]);
            System.out.println("Title  : " + bookLabel[i]);
            System.out.println("Writer : " + writerName[i]);

            if (borrowed[i])
                System.out.println("Status : Borrowed");
            else
                System.out.println("Status : Available");

        }

    }

    static void findByCode() {

        if (bookCount == 0) {

            System.out.println("\nNo Books Found.");
            return;

        }

        System.out.print("\nEnter Accession Number : ");
        String code = sc.next();

        int pos = locateBook(code);

        if (pos == -1) {

            System.out.println("Book Not Found.");
            return;

        }

        System.out.println("\nBook Information");
        System.out.println("----------------------------");
        System.out.println("Code   : " + accessionNo[pos]);
        System.out.println("Title  : " + bookLabel[pos]);
        System.out.println("Writer : " + writerName[pos]);
        System.out.println("Status : " + (borrowed[pos] ? "Borrowed" : "Available"));

    }

    static void modifyBook() {

        if (bookCount == 0) {

            System.out.println("\nLibrary Shelf is Empty.");
            return;

        }

        System.out.print("\nEnter Accession Number : ");
        String code = sc.next();

        int pos = locateBook(code);

        if (pos == -1) {

            System.out.println("Book Not Found.");
            return;

        }

        sc.nextLine();

        System.out.print("New Book Title : ");
        bookLabel[pos] = sc.nextLine();

        System.out.print("New Writer Name : ");
        writerName[pos] = sc.nextLine();

        System.out.println("\nBook Information Updated.");

    }

    static void borrowBook() {

        if (bookCount == 0) {

            System.out.println("\nNo Books Available.");
            return;

        }

        System.out.print("\nEnter Accession Number : ");
        String code = sc.next();

        int pos = locateBook(code);

        if (pos == -1) {

            System.out.println("Book Not Found.");
            return;

        }

        if (borrowed[pos]) {

            System.out.println("Book Already Borrowed.");
            return;

        }

        borrowed[pos] = true;

        System.out.println("\nBook Borrowed Successfully.");

    }
        static void returnBook() {

        if (bookCount == 0) {

            System.out.println("\nLibrary Shelf is Empty.");
            return;

        }

        System.out.print("\nEnter Accession Number : ");
        String code = sc.next();

        int pos = locateBook(code);

        if (pos == -1) {

            System.out.println("Book Not Found.");
            return;

        }

        if (!borrowed[pos]) {

            System.out.println("Book is Already Available.");
            return;

        }

        borrowed[pos] = false;

        System.out.println("\nBook Returned Successfully.");

    }

    static void removeBook() {

        if (bookCount == 0) {

            System.out.println("\nNo Book Available.");
            return;

        }

        System.out.print("\nEnter Accession Number : ");
        String code = sc.next();

        int pos = locateBook(code);

        if (pos == -1) {

            System.out.println("Book Not Found.");
            return;

        }

        for (int i = pos; i < bookCount - 1; i++) {

            accessionNo[i] = accessionNo[i + 1];
            bookLabel[i] = bookLabel[i + 1];
            writerName[i] = writerName[i + 1];
            borrowed[i] = borrowed[i + 1];

        }

        bookCount--;

        System.out.println("\nBook Removed Successfully.");

    }

    static void availableShelf() {

        if (bookCount == 0) {

            System.out.println("\nNo Books Available.");
            return;

        }

        int available = 0;

        System.out.println("\n====== AVAILABLE BOOKS ======");

        for (int i = 0; i < bookCount; i++) {

            if (!borrowed[i]) {

                available++;
                System.out.println(accessionNo[i] + " - " + bookLabel[i]);

            }

        }

        if (available == 0)
            System.out.println("No Books Available Right Now.");

    }

    static void libraryStatus() {

        int borrowedCount = 0;

        for (int i = 0; i < bookCount; i++) {

            if (borrowed[i])
                borrowedCount++;

        }

        System.out.println("\n========= LIBRARY STATUS =========");
        System.out.println("Registered Books : " + bookCount);
        System.out.println("Available Books  : " + (bookCount - borrowedCount));
        System.out.println("Borrowed Books   : " + borrowedCount);

    }

    public static void main(String[] args) {

        int option;

        do {

            System.out.println("\n==================================");
            System.out.println("      SMART LIBRARY SYSTEM");
            System.out.println("==================================");
            System.out.println("1. Register Book");
            System.out.println("2. Find Book");
            System.out.println("3. Show Book Shelf");
            System.out.println("4. Modify Book");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("7. Remove Book");
            System.out.println("8. Available Books");
            System.out.println("9. Library Status");
            System.out.println("10. Exit");

            System.out.print("\nEnter Option : ");
            option = sc.nextInt();

            switch (option) {

                case 1:
                    registerBook();
                    break;

                case 2:
                    findByCode();
                    break;

                case 3:
                    showShelf();
                    break;

                case 4:
                    modifyBook();
                    break;

                case 5:
                    borrowBook();
                    break;

                case 6:
                    returnBook();
                    break;

                case 7:
                    removeBook();
                    break;

                case 8:
                    availableShelf();
                    break;

                case 9:
                    libraryStatus();
                    break;

                case 10:
                    System.out.println("\nLibrary Closed.");
                    break;

                default:
                    System.out.println("\nInvalid Option.");

            }

        } while (option != 10);

        sc.close();
    }
}