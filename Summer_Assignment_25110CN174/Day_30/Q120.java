import java.util.Scanner;

public class Q120 {

    static Scanner sc = new Scanner(System.in);

    static final int MAX = 30;

    static String[] itemCode = new String[MAX];
    static String[] itemName = new String[MAX];
    static double[] itemPrice = new double[MAX];
    static int[] soldQuantity = new int[MAX];

    static int itemCount = 0;

    static int findItem(String code) {

        for (int i = 0; i < itemCount; i++) {

            if (itemCode[i].equalsIgnoreCase(code))
                return i;

        }

        return -1;

    }

    static void addItem() {

        if (itemCount == MAX) {

            System.out.println("\nMenu Capacity Full.");
            return;

        }

        System.out.print("\nEnter Item Code : ");
        String code = sc.next();

        if (findItem(code) != -1) {

            System.out.println("Item Code Already Exists.");
            return;

        }

        itemCode[itemCount] = code;

        sc.nextLine();

        System.out.print("Enter Item Name : ");
        itemName[itemCount] = sc.nextLine();

        System.out.print("Enter Price : ");
        itemPrice[itemCount] = sc.nextDouble();

        while (itemPrice[itemCount] <= 0) {

            System.out.print("Enter Valid Price : ");
            itemPrice[itemCount] = sc.nextDouble();

        }

        soldQuantity[itemCount] = 0;

        itemCount++;

        System.out.println("\nItem Added Successfully.");

    }

    static void displayMenu() {

        if (itemCount == 0) {

            System.out.println("\nMenu Empty.");
            return;

        }

        System.out.println("\n========== CANTEEN MENU ==========");

        for (int i = 0; i < itemCount; i++) {

            System.out.println("\nItem " + (i + 1));
            System.out.println("-------------------------");
            System.out.println("Code  : " + itemCode[i]);
            System.out.println("Name  : " + itemName[i]);
            System.out.println("Price : Rs. " + itemPrice[i]);

        }

    }

    static void searchItem() {

        if (itemCount == 0) {

            System.out.println("\nMenu Empty.");
            return;

        }

        System.out.print("\nEnter Item Code : ");
        String code = sc.next();

        int index = findItem(code);

        if (index == -1) {

            System.out.println("Item Not Found.");
            return;

        }

        System.out.println("\nItem Found");
        System.out.println("----------------------");
        System.out.println("Code  : " + itemCode[index]);
        System.out.println("Name  : " + itemName[index]);
        System.out.println("Price : Rs. " + itemPrice[index]);

    }

    static void updatePrice() {

        if (itemCount == 0) {

            System.out.println("\nMenu Empty.");
            return;

        }

        System.out.print("\nEnter Item Code : ");
        String code = sc.next();

        int index = findItem(code);

        if (index == -1) {

            System.out.println("Item Not Found.");
            return;

        }

        System.out.print("New Price : ");
        itemPrice[index] = sc.nextDouble();

        while (itemPrice[index] <= 0) {

            System.out.print("Enter Valid Price : ");
            itemPrice[index] = sc.nextDouble();

        }

        System.out.println("\nPrice Updated Successfully.");

    }

    static void placeOrder() {

        if (itemCount == 0) {

            System.out.println("\nMenu Empty.");
            return;

        }

        System.out.print("\nEnter Item Code : ");
        String code = sc.next();

        int index = findItem(code);

        if (index == -1) {

            System.out.println("Item Not Found.");
            return;

        }

        System.out.print("Enter Quantity : ");
        int quantity = sc.nextInt();

        while (quantity <= 0) {

            System.out.print("Enter Valid Quantity : ");
            quantity = sc.nextInt();

        }

        soldQuantity[index] += quantity;

        double bill = quantity * itemPrice[index];

        System.out.println("\nOrder Placed Successfully.");
        System.out.println("Total Bill : Rs. " + bill);

    }
        static void removeItem() {

        if (itemCount == 0) {

            System.out.println("\nMenu Empty.");
            return;

        }

        System.out.print("\nEnter Item Code : ");
        String code = sc.next();

        int index = findItem(code);

        if (index == -1) {

            System.out.println("Item Not Found.");
            return;

        }

        for (int i = index; i < itemCount - 1; i++) {

            itemCode[i] = itemCode[i + 1];
            itemName[i] = itemName[i + 1];
            itemPrice[i] = itemPrice[i + 1];
            soldQuantity[i] = soldQuantity[i + 1];

        }

        itemCount--;

        System.out.println("\nItem Removed Successfully.");

    }

    static void salesReport() {

        if (itemCount == 0) {

            System.out.println("\nNo Records Available.");
            return;

        }

        double totalSale = 0;

        System.out.println("\n========== SALES REPORT ==========");

        for (int i = 0; i < itemCount; i++) {

            double amount = soldQuantity[i] * itemPrice[i];
            totalSale += amount;

            System.out.println("\nItem : " + itemName[i]);
            System.out.println("Sold Quantity : " + soldQuantity[i]);
            System.out.println("Sale Amount   : Rs. " + amount);

        }

        System.out.println("\n--------------------------------");
        System.out.println("Total Items : " + itemCount);
        System.out.println("Total Sale  : Rs. " + totalSale);

    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n==================================");
            System.out.println("   COLLEGE CANTEEN BILLING SYSTEM");
            System.out.println("==================================");
            System.out.println("1. Add Food Item");
            System.out.println("2. Display Menu");
            System.out.println("3. Search Item");
            System.out.println("4. Update Price");
            System.out.println("5. Place Order");
            System.out.println("6. Remove Item");
            System.out.println("7. Sales Report");
            System.out.println("8. Exit");

            System.out.print("\nEnter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addItem();
                    break;

                case 2:
                    displayMenu();
                    break;

                case 3:
                    searchItem();
                    break;

                case 4:
                    updatePrice();
                    break;

                case 5:
                    placeOrder();
                    break;

                case 6:
                    removeItem();
                    break;

                case 7:
                    salesReport();
                    break;

                case 8:
                    System.out.println("\nThank You...");
                    break;

                default:
                    System.out.println("\nInvalid Choice.");

            }

        } while (choice != 8);

        sc.close();

    }
}