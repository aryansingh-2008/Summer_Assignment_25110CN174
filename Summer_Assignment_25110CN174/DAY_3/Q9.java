import java.util.Scanner;

public class Q9{
    
    public static void main(String[] agrs){

        Scanner Sc = new Scanner(System.in);
         
     System.out.print("Enter the n : ");

     int n = Sc.nextInt();

      int count =0;

     for(int i=1;i<=n;i++){
          
          if(n%i==0){
        count++;
          }
        }
        
    if(count==2){
    
System.out.println("prime number");

    }else {
    System.out.println(" not a prime number");

    Sc.close();

}
    }

    
        
     
        
    }

