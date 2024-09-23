
//Write a Java program that accepts three numbers from the user and check if the numbers are in 
//"increasing" or "decreasing" order
import java.util.Scanner;

public class Increasing_order {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = in.nextInt();
        System.out.println("Enter second number:");
        int num2 = in.nextInt();
        System.out.println("Enter third number:");
        int num3 = in.nextInt();
        if (num1 < num2 && num2 < num3) {
            System.out.println("increasing order");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("decreasing order");
        } else {
            System.out.println("neither increasing nor decreasing order");
        }
        in.close();
    }
}
