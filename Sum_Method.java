//4. [Write a program to print the sum of two numbers entered by user by defining your own method.]
//(https://code4coding.com/addition-of-two-numbers-in-java-using-method/)

import java.util.Scanner;
public class Sum_Method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1 = in.nextInt();
        System.out.print("Enter the first number:");
        int num2 = in.nextInt();
        in.close();
        System.out.println(sum(num1 , num2));
    }
    static int sum (int num1 , int num2 ){
        int sum = num1+num2;
        return sum;
    }
}
