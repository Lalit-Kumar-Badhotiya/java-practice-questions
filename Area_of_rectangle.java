//3. Area Of Rectangle Program 
import java.util.Scanner;
public class Area_of_rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter width:");
        int width = in.nextInt();
        System.out.print("Enter length:");
        int length = in.nextInt();
        System.out.println(width*length);
        in.close();
    }
}
