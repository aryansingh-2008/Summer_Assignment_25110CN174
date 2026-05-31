import java.util.Scanner;

public class Q16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter end: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {

            int num = i;
            int sum = 0;

            while (num != 0) {
                int digit = num % 10;
                sum = sum + digit * digit * digit;
                num = num / 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}