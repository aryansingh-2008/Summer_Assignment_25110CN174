import java.util.Scanner;

public class Q42 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = sc.nextInt();

        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        System.out.println("Maximum number : " + maximum(a, b));

        sc.close();
    }

    static int maximum(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}