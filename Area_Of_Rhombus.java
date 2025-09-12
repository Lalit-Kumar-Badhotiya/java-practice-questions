
//6. Area Of Rhombus
import java.util.Scanner;
public class Area_Of_Rhombus{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Base:");
        int base = in.nextInt();
        System.out.print("Enter Height:");
        int height = in.nextInt();
        System.out.println(base*height);
        in.close();
    }
}
