/*3. [A person is eligible to vote if his/her age is greater than or equal to 18. 
Define a method to find out if he/she is eligible to vote.]
(https://www.efaculty.in/java-programs/voting-age-program-in-java/)*/

import java.util.Scanner;
public class Vote_method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter age:");
        int age = in.nextInt();
        in.close();
        System.out.println(check(age));
    }
    static String check (int age){
        String msg;
        if(age >=18){
            msg = "He/She can vote";
        }
        else {
            msg = "He/She cannot vote";
        }
        return msg;
    }
}
