import java.util.Scanner;

public class Q94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String compressed = "";
        int count = 1;

        for (int i = 0; i < text.length(); i++) {

            if (i < text.length() - 1
                    && text.charAt(i) == text.charAt(i + 1)) {
                count++;
            } else {
                compressed += text.charAt(i);
                compressed += count;
                count = 1;
            }
        }

        System.out.println("Compressed String = " + compressed);
    }
}