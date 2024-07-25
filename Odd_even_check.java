/*1. Write a program to print whether a number is even or odd, also take
input from the user.*/
import java.util.Scanner;
public class Odd_even_check {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num % 2 == 0) {
            System.out.println("The Number is Even");
        }
        else{
            System.out.println("The Number is Odd");
            in.close();
        } 
    }
    
}
