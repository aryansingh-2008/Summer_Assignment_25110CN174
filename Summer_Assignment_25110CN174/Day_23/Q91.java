import java.util.Arrays;
import java.util.Scanner;

public class Q91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = sc.nextLine().toLowerCase();

        System.out.print("Enter second string: ");
        String second = sc.nextLine().toLowerCase();

        char[] arr1 = first.toCharArray();
        char[] arr2 = second.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Strings are Anagrams");
        } else {
            System.out.println("Strings are Not Anagrams");
        }
    }
}