//volume of cone
import java.util.Scanner;
public class Volume_Of_Cone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius:");
        double R = in.nextDouble();
        System.out.print("Enter height:");
        double H = in.nextDouble();
        System.out.println(3.14*R*R*(H/3));
        in.close();
    }
    
}
