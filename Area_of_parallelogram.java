//5. Area Of Parallelogram
import java.util.Scanner;
public class Area_of_parallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base:");
        int B = in.nextInt();
        System.out.print("Enter height:");
        int H = in.nextInt();
        System.out.println(B*H);
        in.close();
    }
    
}
