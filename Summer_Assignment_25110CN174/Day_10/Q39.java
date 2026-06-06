import java.util.Scanner;

public class Q39 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {

            for (int blank = 1; blank <= n - row; blank++) {
                System.out.print(" ");
            }

            for (int num = 1; num <= row; num++) {
                System.out.print(num);
            }

            for (int num = row - 1; num >= 1; num--) {
                System.out.print(num);
            }

            System.out.println();
        }
    }
}