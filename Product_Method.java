/*5. [Define a method that returns the product of two numbers entered by user.]
(https://code4coding.com/java-program-to-multiply-two-numbers-using-method/)*/
import java.util.Scanner;
public class Product_Method{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = in.nextInt();
        System.out.print("Enter the second number:");
        int b = in.nextInt();
        in.close();
        System.out.println(Product(a , b ));  
    }
    static int Product(int a , int b){
       int prod = a*b;
       return prod;
    }
}