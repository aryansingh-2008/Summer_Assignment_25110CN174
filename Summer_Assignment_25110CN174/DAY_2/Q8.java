import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = Sc.nextInt();

        int original = num;   // original number save
        int digit, reverse = 0;

        while (num != 0) {

            digit = num % 10;

            reverse = reverse * 10 + digit;

            num = num / 10;
        }

        if (original == reverse) {

            System.out.print("Palindrome number");

        } else {

            System.out.print("Not a palindrome number");
        }

        Sc.close();
    }
}