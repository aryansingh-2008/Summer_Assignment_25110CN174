import java.util.Scanner;

public class Q111 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] ticketIds = new int[50];
        String[] passengerNames = new String[50];
        String[] destinations = new String[50];
        boolean[] booked = new boolean[50];

        int totalTickets = 0;
        int choice;

        do {

            System.out.println("\n========== TICKET BOOKING SYSTEM ==========");
            System.out.println("1. Book Ticket");
            System.out.println("2. View All Tickets");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Search Ticket");
            System.out.println("5. Exit");
            System.out.print("Enter Choice : ");

            while (!input.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                input.next();
            }

            choice = input.nextInt();

            switch (choice) {

                case 1:

                    if (totalTickets == 50) {
                        System.out.println("Booking limit reached.");
                        break;
                    }

                    System.out.print("Enter Ticket ID : ");

                    while (!input.hasNextInt()) {
                        System.out.println("Please enter a valid Ticket ID.");
                        input.next();
                    }

                    int newTicketId = input.nextInt();

                    boolean duplicate = false;

                    for (int i = 0; i < totalTickets; i++) {
                        if (ticketIds[i] == newTicketId) {
                            duplicate = true;
                            break;
                        }
                    }

                    if (duplicate) {
                        System.out.println("Ticket ID already exists.");
                        break;
                    }

                    ticketIds[totalTickets] = newTicketId;

                    input.nextLine();

                    System.out.print("Enter Passenger Name : ");
                    passengerNames[totalTickets] = input.nextLine();

                    System.out.print("Enter Destination : ");
                    destinations[totalTickets] = input.nextLine();

                    booked[totalTickets] = true;

                    totalTickets++;

                    System.out.println("Ticket Booked Successfully.");
                    break;

                case 2:

                    if (totalTickets == 0) {
                        System.out.println("No tickets found.");
                        break;
                    }

                    System.out.println("\n------ BOOKED TICKETS ------");

                    for (int i = 0; i < totalTickets; i++) {

                        String status;

                        if (booked[i]) {
                            status = "Active";
                        } else {
                            status = "Cancelled";
                        }

                        System.out.println("\nTicket ID : " + ticketIds[i]);
                        System.out.println("Passenger : " + passengerNames[i]);
                        System.out.println("Destination : " + destinations[i]);
                        System.out.println("Status : " + status);
                    }

                    break;

                case 3:

                    System.out.print("Enter Ticket ID to Cancel : ");

                    while (!input.hasNextInt()) {
                        System.out.println("Please enter a valid Ticket ID.");
                        input.next();
                    }

                    int cancelId = input.nextInt();

                    boolean cancelled = false;

                    for (int i = 0; i < totalTickets; i++) {

                        if (ticketIds[i] == cancelId) {

                            cancelled = true;

                            if (!booked[i]) {
                                System.out.println("Ticket already cancelled.");
                            } else {
                                booked[i] = false;
                                System.out.println("Ticket Cancelled Successfully.");
                            }

                            break;
                        }
                    }

                    if (!cancelled) {
                        System.out.println("Ticket not found.");
                    }

                    break;

                case 4:

                    input.nextLine();

                    System.out.print("Enter Passenger Name : ");
                    String searchName = input.nextLine();

                    boolean found = false;

                    for (int i = 0; i < totalTickets; i++) {

                        if (passengerNames[i].toLowerCase()
                                .contains(searchName.toLowerCase())) {

                            System.out.println("\nTicket ID : " + ticketIds[i]);
                            System.out.println("Destination : " + destinations[i]);
                            System.out.println("Status : "
                                    + (booked[i] ? "Active" : "Cancelled"));

                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("No matching ticket found.");
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