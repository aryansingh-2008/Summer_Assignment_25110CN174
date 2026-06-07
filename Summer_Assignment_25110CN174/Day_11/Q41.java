import java.util.Scanner;

public class Q41 {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the first number :  ");
        int a = Sc.nextInt();
        System.out.print("Enter the Second number : ");
        int b = Sc.nextInt();

        System.out.println("Sum : " + add(a, b));

        Sc.close();
        }

             static int add(int a, int b) {
             return a + b;
    }
}