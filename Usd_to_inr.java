//6. Input currency in rupees and output in USD.
import java.util.Scanner;

public class Usd_to_inr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the latest USD rate:");
        float usd = in.nextFloat();
        System.out.print("Please enter the amount:");
        float inr = in.nextFloat();
        float amount = usd*inr;
        System.out.println(amount);
        in.close();

        
    }
}
