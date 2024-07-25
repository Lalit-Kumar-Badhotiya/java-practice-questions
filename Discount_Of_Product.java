//4. Calculate Discount Of Product
import java.util.Scanner;
public class Discount_Of_Product{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the cost:");
        double cost = in.nextDouble();
        System.out.print("Enter the discount percentage:");
        double dis = in.nextDouble();
        System.out.println((cost/100)*dis);
        in.close();

    }

}