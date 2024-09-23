
// Write a program to find the sum of all natural numbers between 1 to n
import java.util.Scanner;

public class NaturalNumSum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.print("sum: " + sum);
        in.close();
    }
}
