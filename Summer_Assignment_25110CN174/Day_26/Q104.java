import java.util.Scanner;

public class Q104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. Capital of India?\n a) Mumbai b) Delhi c) Kolkata d) Chennai",
            "2. Which language is used for Android development?\n a) Swift b) Kotlin c) Python d) Ruby",
            "3. What is 5 + 3 * 2?\n a) 16 b) 11 c) 13 d) 10",
            "4. Largest planet in our solar system?\n a) Earth b) Mars c) Jupiter d) Saturn",
            "5. Who wrote the Indian National Anthem?\n a) Gandhi b) Tagore c) Nehru d) Bose"
        };
        char[] answers = {'b', 'b', 'b', 'c', 'b'};
        int score = 0;

        System.out.println("===== QUIZ APPLICATION =====");
        System.out.println("Answer with a, b, c, or d.\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer: ");
            char userAnswer = sc.next().charAt(0);

            if (userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + answers[i] + "\n");
            }
        }

        System.out.println("===== QUIZ OVER =====");
        System.out.println("Your Score: " + score + " / " + questions.length);
        sc.close();
    }
}