import java.util.Scanner;

public class Q29 {
    
    public static void main(String[] agrs){

        Scanner Sc = new Scanner(System.in);
         
     System.out.print("Enter the n : ");

     int n = Sc.nextInt();

     for(int i=1;i<=n;i++){

        for(int j=1 ;j<=i;j++){

            System.out.print("*");

        }System.out.println();
     }
        
    }
}
