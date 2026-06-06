import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = input.nextInt();

        for (int line = 1; line <= rows; line++) {

            for (int space = 1; space <= rows - line; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= (2 * line - 1); star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}