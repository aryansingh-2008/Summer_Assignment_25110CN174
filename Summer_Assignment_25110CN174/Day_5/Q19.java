import java.util.Scanner;

public class Q19 {

    public static void main(String [] agrs) {

    Scanner Sc = new Scanner(System.in);

    System.out.print("Enter the number : ");

     int num = Sc.nextInt();

     for(int i= 1; i<=num;i++){
  
     if(num%i==0){

      System.out.print(i + " ");

     }
}
Sc.close();
    }
    
}
