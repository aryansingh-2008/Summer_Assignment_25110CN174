import java.util.Scanner;

class StringOperations {
    Scanner sc = new Scanner(System.in);
    String str;

    void inputString() {
        System.out.print("Enter a String: ");
        str = sc.nextLine();
    }

    void menu() {
        System.out.println("\n========== STRING OPERATIONS ==========");
        System.out.println("1. Display String");
        System.out.println("2. Find Length");
        System.out.println("3. Convert to Uppercase");
        System.out.println("4. Convert to Lowercase");
        System.out.println("5. Reverse String");
        System.out.println("6. Check Palindrome");
        System.out.println("7. Count Vowels");
        System.out.println("8. Count Words");
        System.out.println("9. Search Character");
        System.out.println("10. Replace Character");
        System.out.println("11. Concatenate Another String");
        System.out.println("12. Exit");
        System.out.print("Enter Your Choice: ");
    }

    void operation(int choice) {

        switch (choice) {

            case 1:
                System.out.println("String = " + str);
                break;

            case 2:
                System.out.println("Length = " + str.length());
                break;

            case 3:
                System.out.println("Uppercase = " + str.toUpperCase());
                break;

            case 4:
                System.out.println("Lowercase = " + str.toLowerCase());
                break;

            case 5:
                String rev = "";

                for (int i = str.length() - 1; i >= 0; i--) {
                    rev = rev + str.charAt(i);
                }

                System.out.println("Reverse String = " + rev);
                break;

            case 6:
                String temp = "";

                for (int i = str.length() - 1; i >= 0; i--) {
                    temp = temp + str.charAt(i);
                }

                if (str.equalsIgnoreCase(temp))
                    System.out.println("Palindrome String");
                else
                    System.out.println("Not a Palindrome String");

                break;

            case 7:
                int vowels = 0;

                for (int i = 0; i < str.length(); i++) {
                    char ch = Character.toLowerCase(str.charAt(i));

                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowels++;
                    }
                }

                System.out.println("Total Vowels = " + vowels);
                break;

            case 8:
                String s = str.trim();

                if (s.length() == 0) {
                    System.out.println("Total Words = 0");
                } else {

                    int words = 1;

                    for (int i = 0; i < s.length(); i++) {
                        if (s.charAt(i) == ' ') {
                            words++;
                        }
                    }

                    System.out.println("Total Words = " + words);
                }

                break;

            case 9:
                System.out.print("Enter Character to Search: ");
                char search = sc.next().charAt(0);

                int position = str.indexOf(search);

                if (position != -1)
                    System.out.println("Character Found at Position " + (position + 1));
                else
                    System.out.println("Character Not Found");

                break;

            case 10:
                System.out.print("Enter Character to Replace: ");
                char oldChar = sc.next().charAt(0);

                System.out.print("Enter New Character: ");
                char newChar = sc.next().charAt(0);

                str = str.replace(oldChar, newChar);

                System.out.println("Updated String = " + str);
                break;

            case 11:
                sc.nextLine();

                System.out.print("Enter Another String: ");
                String str2 = sc.nextLine();

                str = str.concat(str2);

                System.out.println("Concatenated String = " + str);
                break;

            case 12:
                System.out.println("Thank You! Program Ended.");
                break;

            default:
                System.out.println("Invalid Choice!");
        }
    }
}

public class Q115 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringOperations obj = new StringOperations();

        obj.inputString();

        int choice;

        do {

            obj.menu();
            choice = sc.nextInt();

            obj.operation(choice);

        } while (choice != 12);

        sc.close();
    }
}