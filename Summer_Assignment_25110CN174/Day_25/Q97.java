import java.util.Scanner;

public class Q97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] firstArray = new int[n1];

        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n1; i++) {
            firstArray[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] secondArray = new int[n2];

        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n2; i++) {
            secondArray[i] = sc.nextInt();
        }

        int[] mergedArray = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (firstArray[i] <= secondArray[j]) {
                mergedArray[k++] = firstArray[i++];
            } else {
                mergedArray[k++] = secondArray[j++];
            }
        }

        while (i < n1) {
            mergedArray[k++] = firstArray[i++];
        }

        while (j < n2) {
            mergedArray[k++] = secondArray[j++];
        }

        System.out.println("Merged Array:");

        for (int value : mergedArray) {
            System.out.print(value + " ");
        }
    }
}