

//4. Area Of Isosceles Triangle 
import java.util.Scanner;
public class Area_of_isosceles_tri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Base:");
        int B = in.nextInt();
        System.out.print("Enter Height:");
        int H = in.nextInt();
        System.out.println((B*H)/2);
        in.close();
        
    }
    
}
