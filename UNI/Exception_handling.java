import java.util.Scanner;

public class Exception_handling {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a: ");
            int a = scanner.nextInt();
            System.out.println("Enter b: ");
            int b = scanner.nextInt();

            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("This is arithematic exception");
        } catch (Exception ex) {
            System.out.println("This is Exception");
        } finally {
            System.out.println("Program executed succesfully");
        }
    }
}
