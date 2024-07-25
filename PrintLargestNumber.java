/*25. Take integer inputs till the user enters 0 and print the largest number from
all.*/
import java.util.Scanner;
public class PrintLargestNumber {
    public static void main(String[] args) {
        long largest_num = 0;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number:");
            long num = in.nextLong();
            if (num > largest_num) {
                largest_num = num;
            }
            else if (num == 0 ){
                System.out.println("Largest number is :" + largest_num);
                break;
            }
            in.close();
        }
    }
}
