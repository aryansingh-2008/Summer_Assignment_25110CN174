import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter start number : ");
        int start = Sc.nextInt();

        System.out.print("Enter end number : ");
        int end = Sc.nextInt();

        for (int i = start; i <= end; i++) {

            int count = 0;

            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(i + " ");
            }
        }

        Sc.close();
    }
}