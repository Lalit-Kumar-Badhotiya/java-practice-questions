
// Write a Java program to Find the addition of N integer numbers 
import java.util.Scanner;

public class NIntegers_sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int num = in.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
        }
        System.out.println("The sum is: " + sum);
        in.close();
    }
}