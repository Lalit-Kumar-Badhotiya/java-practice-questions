
/*A library charges a fine for every book returned late. For the first 5 days, the fine is 50 paise; 
for 6-10 days, the fine is one rupee; and above 10 days, the fine is 5 rupees. Your membership 
will be cancelled if you return the book after 30 days. Write a program to accept the number of 
days the member is late to return the book and display the fine or the appropriate message */
import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int days = in.nextInt();
        double fine = 0;
        in.close();
        if (days <= 5) {
            fine = days * 0.50;
        } else if (days <= 10) {
            fine = (5 * 0.50) + (days - 5) * 1;
        } else if (days <= 30) {
            fine = (5 * 0.50) + (5 * 1) + (days - 10) * 5;
        } else {
            System.out.println("Your membership is cancelled.");
        }
        System.out.println("The total fine is: Rs. " + fine);

    }
}