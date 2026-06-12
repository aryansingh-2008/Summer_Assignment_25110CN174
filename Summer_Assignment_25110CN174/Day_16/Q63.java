import java.util.Scanner;

public class Q63 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter sum: ");
        int sum = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < n; i++) {

            for(int j = i + 1; j < n; j++) {

                if(arr[i] + arr[j] == sum) {
                    System.out.println("Pair = " + arr[i] + " " + arr[j]);
                    found = true;
                }
            }
        }

        if(found == false) {
            System.out.println("No Pair Found");
        }

        sc.close();
    }
}