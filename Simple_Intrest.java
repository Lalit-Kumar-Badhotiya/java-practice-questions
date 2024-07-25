/*3. Write a program to input principal, time, and rate (P, T, R) from the user and
find Simple Interest. */
import java.util.Scanner;
public class Simple_Intrest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the principal amount:");
        int amount = in.nextInt();
        System.out.println();
        System.out.print("Please enter the time in years:");
        int time = in.nextInt();
        System.out.println();
        System.out.print("Please enter the rate:");
        int rate = in.nextInt();
        System.out.println();
        int si = (amount*rate*time)/100;
        System.out.println("Your simple intrest is:"+si);
        in.close();

        
    }
}
