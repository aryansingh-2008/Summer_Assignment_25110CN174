import java.util.Scanner;

public class Q5 {

    public static void main(String [] agrs) {

Scanner Sc = new Scanner(System.in);
 System.out.print("Enter the number : ");
int num = Sc.nextInt();

int digit ,sum = 0;

while(num!=0){
  digit=  num % 10 ;
    num = num/10;
    sum = sum + digit;
}

System.out.print("Sum of digit :  " + sum);

Sc.close();
    }
    
}
