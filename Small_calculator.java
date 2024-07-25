/*4. Take in two numbers and an operator (+, -, *, /, %) and calculate the value.
(Use if conditions) */
import java.util.Scanner;

public class Small_calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int num1 = in.nextInt();
        System.out.print("Enter number 2:");
        int num2 = in.nextInt();
        System.out.print("Enter the operator:");
        String op = in.next();
        String plus = "+";
        String minus = "-"; 
        String multiply = "*";
        String divide = "/"; 
        String remainder = "%";
        if (op.equals(plus)) {
            System.out.print(num1+num2);
        }
        else if (op.equals(minus)) {
            System.out.println(num1-num2);
        }
        else if (op.equals(multiply)) {
            System.out.println(num1*num2);
        }
        else if (op.equals(divide)) {
            System.out.println(num1/num2);
        }
        else if (op.equals(remainder)) {
            System.out.println(num1%num2);
        }
        else {
            System.out.println("invalid operator");
        }
        in.close();
        
    }
    
}
