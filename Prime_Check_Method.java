/*7. [Define a method to find out if a number is prime or not.]
(https://www.geeksforgeeks.org/java-program-to-check-if-a-number-is-prime-or-not/)*/
import java.util.Scanner;
public class Prime_Check_Method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = in.nextInt();
        in.close();
        Prime_Check(num);
    }
     static void Prime_Check(int num) {
        int count = 0;
        if (num <= 1  || num <=0) {
            System.out.println("The number is not prime");
        }
        else {
            for(int i=2;i==num;i++){
                if (num%i==0){
                    count = 1;
                }
            }
        }
        if (count==1) {
            System.out.println("The number is prime");
        }
        else 
        {
            System.out.println("The number is not prime");
        }
    }
}
