/*2. [Define a program to find out whether a given number is even or odd.]
(https://www.geeksforgeeks.org/java-program-to-check-if-a-given-integer-is-odd-or-even/)*/
import java.util.Scanner;
public class Odd_Even_merhod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = in.nextInt();
        in.close();
        System.out.println(Odd_Even(num)); 
    }
    static String Odd_Even (int a ){
         String ans;
        if (a%2==0){
            ans = "Even";
        }
        else {
            ans = "Odd";
        }
        return ans;
    }
}
