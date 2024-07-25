// calculate Commission percentage
import java.util.Scanner;
public class Commission_calculator {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the total cost:");
    double cost = in.nextDouble();
    System.out.print("Enter the commission amount:");
    double ca = in.nextDouble();
        System.out.println((ca/cost)*100);
    in.close();    
    }
}
