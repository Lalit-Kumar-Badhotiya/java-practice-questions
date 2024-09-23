
// Write a program to print tables
import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        in.close();
    }
}
