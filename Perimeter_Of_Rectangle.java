//11. Perimeter Of Rectangle
import java.util.Scanner;
public class Perimeter_Of_Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length:");
        double L = in.nextDouble();
        System.out.print("Enter width:");
        double W = in.nextDouble();
        System.out.println(2*(L+W));
        in.close();
    }
    
}
