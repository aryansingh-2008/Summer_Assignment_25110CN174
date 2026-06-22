import java.util.Scanner;

public class Q102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Are you a citizen of India? (yes/no): ");
        String citizen = sc.next();

        System.out.println("\n----- ELIGIBILITY RESULT -----");

        if (age >= 18 && citizen.equalsIgnoreCase("yes")) {
            System.out.println(name + ", you are ELIGIBLE to vote in India.");
        } else {
            System.out.println(name + ", you are NOT ELIGIBLE to vote.");
            if (age < 18) {
                System.out.println("Reason: Age is below 18. " + (18 - age) + " year(s) left.");
            }
            if (!citizen.equalsIgnoreCase("yes")) {
                System.out.println("Reason: Not a citizen of India.");
            }
        }
        sc.close();
    }
}