import java.util.Scanner;

public class Q48 {

    static void perfect(int num) {
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum == num)
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        perfect(num);

        sc.close();
    }
}