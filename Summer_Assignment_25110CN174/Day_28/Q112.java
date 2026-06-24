import java.util.Scanner;

public class Q112 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = new String[50];
        String[] phoneNumbers = new String[50];

        int contactCount = 0;
        int choice;

        do {

            System.out.println("\n========== CONTACT MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter Choice : ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    if (contactCount == 50) {
                        System.out.println("Contact list is full.");
                        break;
                    }

                    System.out.print("Enter Contact Name : ");
                    names[contactCount] = input.nextLine();

                    System.out.print("Enter Phone Number : ");
                    phoneNumbers[contactCount] = input.nextLine();

                    contactCount++;

                    System.out.println("Contact Added Successfully.");
                    break;

                case 2:

                    if (contactCount == 0) {
                        System.out.println("No contacts available.");
                        break;
                    }

                    System.out.println("\n------ CONTACT LIST ------");

                    for (int i = 0; i < contactCount; i++) {

                        System.out.println("\nName : " + names[i]);
                        System.out.println("Phone : " + phoneNumbers[i]);
                    }

                    break;

                case 3:

                    System.out.print("Enter Name to Search : ");
                    String searchName = input.nextLine();

                    boolean found = false;

                    for (int i = 0; i < contactCount; i++) {

                        if (names[i].equalsIgnoreCase(searchName)) {

                            System.out.println("\nContact Found");
                            System.out.println("Name : " + names[i]);
                            System.out.println("Phone : " + phoneNumbers[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Contact not found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Name to Delete : ");
                    String deleteName = input.nextLine();

                    boolean deleted = false;

                    for (int i = 0; i < contactCount; i++) {

                        if (names[i].equalsIgnoreCase(deleteName)) {

                            for (int j = i; j < contactCount - 1; j++) {
                                names[j] = names[j + 1];
                                phoneNumbers[j] = phoneNumbers[j + 1];
                            }

                            contactCount--;
                            deleted = true;

                            System.out.println("Contact Deleted Successfully.");
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Contact not found.");
                    }

                    break;

                case 5:
                    System.out.println("Program Closed.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

        input.close();
    }
}