
//Write a Java program to create a simple calculator
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operator: +, -, *, or /");
        String operator = scanner.next();

        System.out.println("Enter 1 no");
        int no1 = scanner.nextInt();
        System.out.println("Enter 2 no");
        int no2 = scanner.nextInt();

        switch (operator) {
            case "+":
                System.out.println(no1 + no2);
                break;
            case "-":
                System.out.println(no1 - no2);
                break;
            case "*":
                System.out.println(no1 * no2);
                break;
            case "/":
                System.out.println(no1 / no2);
                break;
        }
        scanner.close();

    }

}
