
// Write a program to convert a binary number into a decimal number without using array, function 
//and while loop 
import java.util.Scanner;

public class Binary_to_decimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int biNum = in.nextInt();
        int deciNum = 0;
        int power = 0;
        for (int n = biNum; n > 0; n /= 10) {
            int lastDigit = n % 10;
            deciNum += lastDigit * Math.pow(2, power);
            power++;
        }
        System.out.println("Decimal equivalent: " + deciNum);
        in.close();
    }
}