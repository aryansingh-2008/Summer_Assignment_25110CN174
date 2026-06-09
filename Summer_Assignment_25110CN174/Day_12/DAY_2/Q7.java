import java.util.Scanner;

public class Q7 {

    public static void main(String [] agrs) {

    Scanner Sc = new Scanner(System.in);

    System.out.print("Enter the number : ");

     int num = Sc.nextInt();

 int digit ,product = 1;

while(num!=0){

       digit=  num % 10 ;
       product = product * digit;
       num = num/10;
       
}

System.out.print("product of number  :  " + product);

Sc.close();
    }
    
}
