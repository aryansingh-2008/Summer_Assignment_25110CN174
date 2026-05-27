import java.util.Scanner;

public class Q2 {

    public static void main(String[] agrs){

        Scanner Sc = new Scanner(System.in);
        
        System.out.print("Enter the N  :");
int N = Sc.nextInt();

        for(int i=1;i<=10;i++){
      
            int k = N * i;

            System.out.println(N + " x " + i +" =" +(k));


        } Sc.close();
    }
    
}
