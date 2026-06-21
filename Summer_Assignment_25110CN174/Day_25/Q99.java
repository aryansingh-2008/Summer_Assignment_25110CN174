import java.util.Scanner;

public class Q99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int totalNames = sc.nextInt();
        sc.nextLine();

        String[] names = new String[totalNames];

        System.out.println("Enter names:");

        for (int i = 0; i < totalNames; i++) {
            names[i] = sc.nextLine();
        }

        for (int i = 0; i < totalNames - 1; i++) {
            for (int j = i + 1; j < totalNames; j++) {

                if (names[i].compareToIgnoreCase(names[j]) > 0) {

                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        System.out.println("Names in Alphabetical Order:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}