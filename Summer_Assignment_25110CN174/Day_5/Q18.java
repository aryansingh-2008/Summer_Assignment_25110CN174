import java.util.Scanner;

public class Q18 {
    public static void main(String[] args){

Scanner Sc= new Scanner(System.in);

System.out.print("Enter the number : ");

int n = Sc.nextInt();
int digit,sum=0;
int fact=1;
int original = n;
while (n!=0) {

    digit = n%10;
    fact =1;
    
   for(int i=digit;i>=1;i--){
         
            fact = fact * i ; 
        }

    sum=sum+fact;
     n=n/10;
}

if(sum==original){
    System.out.print("Strong Number");
}else{

        System.out.print("not Strong Number");

    }Sc.close();

    }
    
}
