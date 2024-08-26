//A movie theatre has the following ticket pricing rules:
//children under 12 years old pay $5.
//seniors 65 years and older pay $7.
//regular adults (12-64 years old) pay $10.
//members get a $2 discount on all ticket prices.
//we'll prompt the user to input their age and whether they have a membership card.
//based on this input, the program will determine and print the ticket price.

import java.util.Scanner;

public class Movie_Theatre {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter age:");
        int age = in.nextInt();
        System.out.print("Are you a member? true or false: ");
        boolean member = in.nextBoolean();
        in.close();
        int cost;
        if (age < 12) {
            cost = 5;
        } else if (age >= 12 && age < 65) {
            cost = 10;
        } else {
            cost = 7;
        }
        if (member) {
            cost -= 2;
        }
        System.out.println("The ticket price is " + cost);

    }

}