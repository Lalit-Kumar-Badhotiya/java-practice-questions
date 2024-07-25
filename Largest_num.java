//5. Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Largest_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = in.nextInt();
        System.out.print("Enter second number:");
        int b = in.nextInt();
        if (a > b) {
            System.out.println("Largest number is:" + a );
        }
        else {
            System.out.println("Largest number is:" + b);
            in.close();
        }
    }
}
