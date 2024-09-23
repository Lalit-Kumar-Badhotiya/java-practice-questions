
// Write a program to find the sum of all odd numbers between 1 to n 
import java.util.Scanner;

public class Odd_sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        System.out.print("sum: " + sum);
        in.close();
    }
}