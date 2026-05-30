import java.util.Scanner;

public class Q12M1 {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = Sc.nextInt();

        System.out.print("Enter second number : ");
        int b = Sc.nextInt();

        int gcd = 1;

        int small;

        if (a < b) {
            small = a;
        } else {
            small = b;
        }

        for (int i = 1; i <= small; i++) {

            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
 int LCM = (a*b)/gcd;

        System.out.println("LCM = " + LCM);

        Sc.close();
    }
}