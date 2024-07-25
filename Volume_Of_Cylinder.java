//16. Volume Of Cylinder
import java.util.Scanner;
public class Volume_Of_Cylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius:");
        double R = in.nextDouble();
        System.out.print("Enter height:");
        double H = in.nextDouble();
        System.out.println(3.141592653589793238462643383279502884197*R*R*H);
        in.close();
    }
}
