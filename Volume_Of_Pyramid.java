//18. Volume Of Pyramid
import java.util.Scanner;
public class Volume_Of_Pyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base length:");
        double basel = in.nextDouble();
        System.out.print("Enter base width:");
        double basew = in.nextDouble();
        System.out.print("Enter height:");
        double height = in.nextDouble();
        double volume = (basel*basew*height)/3;
        System.out.println(volume);
        in.close();
    }  
}