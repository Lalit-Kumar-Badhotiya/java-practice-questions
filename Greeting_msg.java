//2. Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Greeting_msg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 

        System.out.print("What is your name:");

        String name = in.nextLine();
        
        System.out.println("HELLO! " + name + " How are you?" );
        in.close();
    }
    
}
