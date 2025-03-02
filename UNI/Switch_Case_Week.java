
















//create a program using switch case statement to identify the day of the week.

import java.util.Scanner;

public class Switch_Case_Week {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the day:");
        String day = in.nextLine();
        in.close();
        switch (day) {
            case "monday":
                System.out.print("Monday");
                break;
            case "tuesday":
                System.out.print("tuesday");
                break;
            case "wednesday":
                System.out.print("wednesday");
                break;
            case "thursday":
                System.out.print("thursday");
                break;
            case "friday":
                System.out.print("friday yoooooohoooooo");
                break;
            case "saturday":
                System.out.print("saturday");
                break;
            case "sunday":
                System.out.print("sunday");
                break;
        }
    }
}
