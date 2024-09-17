
//Write a Java program that reads a positive integer and counts the number of digits. 
import java.util.Scanner;

public class Number_of_digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = in.nextInt();

        if (number <= 0) {
            System.out.println("The number must be positive.");
            return;
        }

        int digitCount = 0;
        int temp = number;
        while (temp > 0) {
            temp /= 10;
            digitCount++;
        }
        System.out.println("The number of digits in " + number + " is: " + digitCount);
        in.close();
    }
}
