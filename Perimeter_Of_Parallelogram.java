//10. Perimeter Of Parallelogram
import java.util.Scanner;
public class Perimeter_Of_Parallelogram{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Base:");
        double B =in.nextDouble();
        System.out.print("Enter side:");
        double S =in.nextDouble();
        System.out.println(2*(B+S));
        in.close();
    }
}