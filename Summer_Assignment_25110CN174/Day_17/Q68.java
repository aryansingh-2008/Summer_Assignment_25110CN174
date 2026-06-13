import java.util.Scanner;

public class Q68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter first array elements:");
        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter second array elements:");
        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        boolean found = false;

        System.out.println("Common Elements:");

        for(int i = 0; i < n1; i++) {

            boolean printed = false;

            for(int k = 0; k < i; k++) {
                if(arr1[i] == arr1[k]) {
                    printed = true;
                    break;
                }
            }

            if(printed) {
                continue;
            }

            for(int j = 0; j < n2; j++) {
                if(arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    found = true;
                    break;
                }
            }
        }

        if(!found) {
            System.out.println("No Common Elements Found");
        }
    }
}