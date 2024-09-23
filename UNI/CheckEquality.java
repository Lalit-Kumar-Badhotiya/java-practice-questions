
//Write a Java program that accepts three numbers and checks whether All numbers are equal. 
import java.util.Scanner;

public class CheckEquality {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = in.nextInt();

        System.out.println("Enter second number:");
        int num2 = in.nextInt();

        System.out.println("Enter third number:");
        int num3 = in.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        in.close();
    }
}