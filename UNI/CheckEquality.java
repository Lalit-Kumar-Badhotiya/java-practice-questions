
//Write a Java program that accepts three numbers and checks whether All numbers are equal. 
import java.util.Scanner;

public class CheckEquality {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number:");
        int num3 = scanner.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal.");
        } else {
            System.out.println("All numbers are not equal.");
        }
        scanner.close();
    }
}
