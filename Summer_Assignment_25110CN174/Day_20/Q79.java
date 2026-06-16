import java.util.Scanner;

public class Q79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            int sum = 0;

            for (int j = 0; j < cols; j++) {
                sum += arr[i][j];
            }

            System.out.println("Sum of Row " + (i + 1) + " = " + sum);
        }
    }
}