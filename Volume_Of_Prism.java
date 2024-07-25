//15. Volume Of Prism
import java.util.Scanner;
public class Volume_Of_Prism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base:");
        double B = in.nextDouble();
        System.out.print("Enter base:");
        double H = in.nextDouble();
        System.out.println(B*H);
        in.close();
    }
}
