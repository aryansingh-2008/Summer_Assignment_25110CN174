import java.util.Scanner;

public class Q86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();

        int wordCount = 0;

        if (!sentence.isEmpty()) {
            wordCount = 1;

            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' '
                        && sentence.charAt(i + 1) != ' ') {
                    wordCount++;
                }
            }
        }

        System.out.println("Total Words = " + wordCount);
    }
}