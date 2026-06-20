import java.util.Scanner;

public class Q96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char current = text.charAt(i);

            if (result.indexOf(current) == -1) {
                result += current;
            }
        }

        System.out.println("After Removing Duplicates = " + result);
    }
}