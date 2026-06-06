import java.util.Scanner;

public class Q40 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {

            for (int blank = 1; blank <= n - row; blank++) {
                System.out.print(" ");
            }

            char ch = 'A';

            for (int col = 1; col <= row; col++) {
                System.out.print(ch);
                ch++;
            }

            ch -= 2;

            for (int col = 1; col < row; col++) {
                System.out.print(ch);
                ch--;
            }

            System.out.println();
        }
    }
}