//17. Volume Of Sphere
import java.util.Scanner;
public class Volume_Of_Sphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius:");
        double R = in.nextDouble();
        System.out.println(1.3333333333*(3.1415926535897932384*(R*R*R)));
        in.close();
    }
}
