
//Write a program to print all natural numbers from 1 to n
import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        in.close();
    }
}
