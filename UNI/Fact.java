//Write a program to find the factorial value of any number 

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = in.nextInt();
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.println("The fact is " + fact);
        in.close();
    }
}