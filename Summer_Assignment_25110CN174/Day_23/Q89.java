import java.util.Scanner;

public class Q89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < text.length(); i++) {
            int count = 0;

            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("First Non-Repeating Character = "
                        + text.charAt(i));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No Non-Repeating Character Found");
        }
    }
}