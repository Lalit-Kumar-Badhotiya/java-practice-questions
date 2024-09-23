
// Write a program to find the value of one number raised to the power of another
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = in.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = in.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println(result);
        in.close();
    }
}