import java.util.Scanner;

public class Q88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                result += text.charAt(i);
            }
        }

        System.out.println("String Without Spaces = " + result);
    }
}