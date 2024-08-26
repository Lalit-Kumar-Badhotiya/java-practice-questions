//Write the following program using if else if ladder. Accept an hour from the user and output
//the following as indicated below.include the last condition in the else section.
// 1.Hour greater than or equal to 0 and less than 12.               "Good Morning"
// 2.Hour greater than or equal to 12 and less than 18.              "Good Afternoon"
// 3.Hour greater than or equal to 18 and less than 24.              "Good Evening"
// 4.Any other input .                                               "Time is out of range"  

import java.util.Scanner;

public class Greeting_Msg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the time:");
        int time = in.nextInt();
        in.close();
        if (time >= 0 && time < 12) {
            System.out.print("Good Morning");
        }

        else if (time >= 12 && time < 18) {
            System.out.print("Good Afternoon");
        }

        else if (time >= 18 && time <= 24) {
            System.out.print("Good Evening");
        }

        else {
            System.out.println("Time is out of range.");
        }

    }
}