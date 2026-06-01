import java.util.Scanner;

public class Q23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        int count = 0;

        while(n > 0) {

            if(n % 2 == 1) {
                count++;
            }

            n = n / 2;
        }

        System.out.println("Set Bits = " + count);
    }
}