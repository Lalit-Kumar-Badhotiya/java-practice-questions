
// Write a program to find the sum of all even numbers between 1 to n 
import java.util.Scanner;

public class Even_sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        System.out.print(" Sum: " + sum);
        in.close();
    }
}
