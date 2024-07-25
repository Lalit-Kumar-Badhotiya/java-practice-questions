//24. Take integer inputs till the user enters 0 and print the sum of all numbers
import java.util.Scanner;
public class SumAllinput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        while (true) {
            System.out.print("Enter the number:");
            double n = in.nextDouble();
            sum = sum +n;
            if (n == 0){
                break;
            }
        }
        System.out.println(sum);
        in.close();
    }
}