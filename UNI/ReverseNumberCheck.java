//A five-digit number is entered through the keyboard. Write a program to obtain the reversed 
//number and determine whether the original and reversed numbers are equal.

import java.util.Scanner;

public class ReverseNumberCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = in.nextInt();

        int temp = number;
        int revNum = 0;

        while (temp != 0) {
            int lastDigit = temp % 10;
            revNum = revNum * 10 + lastDigit;
            temp /= 10;
        }
        System.out.println("Reversed Number: " + revNum);

        if (number == revNum) {
            System.out.println("Equal.");
        } else {
            System.out.println("Not Equal.");
        }
        in.close();
    }
}