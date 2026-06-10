import java.util.Scanner;

public class Q54 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element: ");
        int key = sc.nextInt();

        int count = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] == key) {
                count++;
            }
        }

        System.out.println("Frequency = " + count);

        sc.close();
    }
}
