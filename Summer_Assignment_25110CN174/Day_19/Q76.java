import java.util.Scanner;

public class Q76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int arr[][] = new int[n][n];
        int sum = 0;

        System.out.println("Enter matrix elements:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++) {
            sum = sum + arr[i][i];
        }

        System.out.println("Diagonal Sum = " + sum);
    }
}