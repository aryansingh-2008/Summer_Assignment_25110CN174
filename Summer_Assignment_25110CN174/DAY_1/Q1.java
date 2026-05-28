import java.util.Scanner;

public class Q1 {

    public static void main(String[] args ){
        System.out.println("Enter the value of n");
        Scanner Sc = new Scanner(System.in);

        int n = Sc.nextInt();

        int sum = 0;

        for(int i = 1; i <= n; i++){

            sum = sum + i;

        }

        System.out.println("Sum of n Number = " + sum);
         Sc.close();
    }    

}
