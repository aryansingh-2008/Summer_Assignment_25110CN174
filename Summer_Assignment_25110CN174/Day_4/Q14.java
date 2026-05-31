import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        for (int i = 1; i < n; i++) {

            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println("Nth Fibonacci Term = " + a);

        sc.close();
    }
}