
















//7. Area Of Equilateral Triangle
import java.util.Scanner;
public class Area_Of_Equilateral_Triangle{
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       double root = 0.4330127019;
        System.out.print("Enter side:");
        double side = in.nextDouble();
        System.out.println(root*(side*side));
        in.close();
    }
}
