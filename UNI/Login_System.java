//you are tasked with developing a program that
//simulates a login system. the user is given
//three attempts to enter the correct password
//in intiger formet like 4545. if the user enters
//the correct password within three attempts,
//they are granted access. if the user fails to
//enter the correct password in three attempts,
//they are locked out

import java.util.Scanner;

public class Login_System {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stored_password = 1234;
        int i = 1;
        while (i <= 3) {
            System.out.print("Enter the password:");
            int a = in.nextInt();
            if (a == stored_password) {
                System.out.println("Access Granted");
                break;
            } else {
                System.out.println("Wrong Password");
            }
            i++;
        }
        if (i >= 3) {
            System.out.println("you are locked out");

        }
        in.close();
    }
}
