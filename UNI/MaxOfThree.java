//WAP to find maximum of three numbers. 

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = in.nextInt();
        System.out.print("Enter second number:");
        int b = in.nextInt();
        System.out.print("Enter third number:");
        int c = in.nextInt();
        if (a > b && a > c) {
            System.out.println("Largest number is:" + a);
        } else if (b > a && b > c) {
            System.out.println("Largest number is:" + b);
        } else {
            System.out.println("Largest number is:" + c);
            in.close();
        }
    }
}