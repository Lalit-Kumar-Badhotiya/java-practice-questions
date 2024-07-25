//8. Perimeter Of Circle
import java.util.Scanner;
public class Perimeter_Of_Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius:");
        double R = in.nextFloat();
        double P = 2*3.14*R;
        System.out.println(P);
        in.close();
    }
    
}
