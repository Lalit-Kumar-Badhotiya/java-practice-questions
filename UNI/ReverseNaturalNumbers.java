
// Write a program to print all natural numbers in reverse 
import java.util.Scanner;

public class ReverseNaturalNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }

        in.close();
    }
}