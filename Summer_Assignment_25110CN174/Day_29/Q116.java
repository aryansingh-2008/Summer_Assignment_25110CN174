import java.util.Scanner;

class Product {

    int id;
    String name;
    int quantity;
    double price;

    Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}

class Inventory {

    Scanner sc = new Scanner(System.in);

    Product[] products = new Product[50];
    int count = 0;

    void menu() {
        System.out.println("\n========== INVENTORY MANAGEMENT SYSTEM ==========");
        System.out.println("1. Add Product");
        System.out.println("2. View All Products");
        System.out.println("3. Search Product");
        System.out.println("4. Update Quantity");
        System.out.println("5. Delete Product");
        System.out.println("6. Total Inventory Value");
        System.out.println("7. Exit");
        System.out.print("Enter Your Choice: ");
    }

    void addProduct() {

        if (count == products.length) {
            System.out.println("Inventory Full!");
            return;
        }

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        // Duplicate ID Check
        for (int i = 0; i < count; i++) {
            if (products[i].id == id) {
                System.out.println("Product ID Already Exists!");
                return;
            }
        }

        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        products[count] = new Product(id, name, quantity, price);
        count++;

        System.out.println("Product Added Successfully.");
    }

    void viewProducts() {

        if (count == 0) {
            System.out.println("No Products Available.");
            return;
        }

        System.out.println("\n-----------------------------------------------");
        System.out.println("ID\tName\tQuantity\tPrice");
        System.out.println("-----------------------------------------------");

        for (int i = 0; i < count; i++) {
            System.out.println(products[i].id + "\t"
                    + products[i].name + "\t"
                    + products[i].quantity + "\t\t"
                    + products[i].price);
        }
    }

    void searchProduct() {

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (products[i].id == id) {

                System.out.println("\nProduct Found");
                System.out.println("ID       : " + products[i].id);
                System.out.println("Name     : " + products[i].name);
                System.out.println("Quantity : " + products[i].quantity);
                System.out.println("Price    : " + products[i].price);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product Not Found.");
        }
    }

    void updateQuantity() {

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (products[i].id == id) {

                System.out.print("Enter New Quantity: ");
                products[i].quantity = sc.nextInt();

                System.out.println("Quantity Updated Successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product Not Found.");
        }
    }

    void deleteProduct() {

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (products[i].id == id) {

                for (int j = i; j < count - 1; j++) {
                    products[j] = products[j + 1];
                }

                products[count - 1] = null;
                count--;

                System.out.println("Product Deleted Successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product Not Found.");
        }
    }

    void totalInventoryValue() {

        double total = 0;

        for (int i = 0; i < count; i++) {
            total += products[i].quantity * products[i].price;
        }

        System.out.println("Total Inventory Value = " + total);
    }

    void operation(int choice) {

        switch (choice) {

            case 1:
                addProduct();
                break;

            case 2:
                viewProducts();
                break;

            case 3:
                searchProduct();
                break;

            case 4:
                updateQuantity();
                break;

            case 5:
                deleteProduct();
                break;

            case 6:
                totalInventoryValue();
                break;

            case 7:
                System.out.println("Thank You! Program Ended.");
                break;

            default:
                System.out.println("Invalid Choice!");
        }
    }
}

public class Q116 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Inventory obj = new Inventory();

        int choice;

        do {

            obj.menu();
            choice = sc.nextInt();

            obj.operation(choice);

        } while (choice != 7);

        sc.close();
    }
}