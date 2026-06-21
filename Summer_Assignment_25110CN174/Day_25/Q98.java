import java.util.Scanner;

public class Q98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = sc.nextLine().toLowerCase();

        System.out.print("Enter second string: ");
        String second = sc.nextLine().toLowerCase();

        System.out.print("Common Characters: ");

        for (int i = 0; i < first.length(); i++) {

            char current = first.charAt(i);

            if (second.indexOf(current) != -1
                    && first.indexOf(current) == i) {

                System.out.print(current + " ");
            }
        }
    }
}