import java.util.Scanner;

public class Q3 {

    public static void main(String[] agrs){

        Scanner Sc = new Scanner(System.in);
        
        System.out.print("Enter the N : ");

        int N = Sc.nextInt();
        int fact = 1;
        
        for(int i=N;i>=1;i--){
         
            fact = fact * i ; 
        }
         System.out.print("Factorial  : " +fact);
    }
    
}
