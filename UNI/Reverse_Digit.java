
// write a program to reverse the given Digits
import java.util.Scanner;

public class Reverse_Digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = in.nextInt();

        int revNum = 0;
        int remainder;

        while (number != 0) {
            remainder = number % 10;
            revNum = revNum * 10 + remainder;
            number /= 10;
        }
        System.out.println("Reversed number: " + revNum);
        in.close();
    }
}