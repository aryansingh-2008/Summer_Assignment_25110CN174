import java.util.Scanner;

public class Q17 {
    public static void main(String[] agrs){

        Scanner Sc = new Scanner(System.in);

      System.out.print("Enter the number :  ");

      int n = Sc.nextInt();

      int sum = 0;

    for(int i=1; i<n; i++){
      
        if(n%i==0){

            sum=sum+i;

        }

    }
    if(sum==n){
System.out.print("Perfect Number");

    }else {

        
    System.out.print("NOt a Perfect Number");
    }
    

Sc.close();
    }
    

}
