import java.util.Scanner;

public class Q87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.print("Enter character to find frequency: ");
        char target = sc.next().charAt(0);

        int frequency = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                frequency++;
            }
        }

        System.out.println("Frequency of '" + target + "' = " + frequency);
    }
}