import java.util.Scanner;

public class Q12M2 {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = Sc.nextInt();

        System.out.print("Enter second number : ");
        int b = Sc.nextInt();

        int max;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        while (true) {

            if (max % a == 0 && max % b == 0) {

                System.out.println("LCM = " + max);
                break;
            }

            max++;
        }

        Sc.close();
    }
}