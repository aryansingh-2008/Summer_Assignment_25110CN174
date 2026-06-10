import java.util.Scanner;

public class Q6 {

    public static void main(String [] agrs) {

Scanner Sc = new Scanner(System.in);
 System.out.print("Enter the number : ");
int num = Sc.nextInt();

int digit ,reverse = 0;

while(num!=0){
  digit=  num % 10 ;

    reverse = reverse *10 + digit;
     num = num/10;
}

System.out.print("reverse number  :  " + reverse);

Sc.close();
    }
    
}
