
//23. Input a number and print all the factors of that number (use loops).
import java.util.Scanner;
public class Print_all_factors {
     public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the number: ");
            long n = in.nextLong();
            in.close();
            
            for (long i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.println(i);
                
            }
        }
    }
}   
