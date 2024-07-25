//19. Curved Surface Area Of Cylinder
import java.util.Scanner;
public class Curved_Surface_Area_Of_Cylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base radius:");
        double BR = in.nextDouble();
        System.out.print("Enter height:");
        double H = in.nextDouble();
        double CSA = (2*3.141592653589793238462643383279502884197*(BR*H));
        System.out.println(CSA);
        in.close();
        
    }
}
