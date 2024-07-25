//2. Calculate Electricity Bill
import java.util.Scanner;
public class Electricity_Bill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the cost of unit:");
        double unit = in.nextDouble();
        System.out.print("Enter amount of unit consumed:");
        double unic = in.nextDouble();
        System.out.println("THE bill is: " +unic*unit);
        in.close();
        
    }
    
}
