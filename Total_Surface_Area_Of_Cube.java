//20. Total Surface Area Of Cube
import java.util.Scanner;
public class Total_Surface_Area_Of_Cube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side:");
        double S = in.nextDouble();
        System.out.println(6*(S*S));
        in.close();
        
    }
    
}
