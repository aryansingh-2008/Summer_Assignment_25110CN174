import java.util.Scanner;

public class Q90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < text.length(); i++) {
            for (int j = i + 1; j < text.length(); j++) {

                if (text.charAt(i) == text.charAt(j)) {
                    System.out.println("First Repeating Character = "
                            + text.charAt(i));
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No Repeating Character Found");
        }
    }
}