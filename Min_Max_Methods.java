/*1. [Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.]
(https://www.java67.com/2019/05/how-to-find-largest-and-smallest-of-three-numbers-in-java.html)*/
import java.util.Scanner;
public class Min_Max_Methods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = in.nextInt();
        System.out.print("Enter the second number:");
        int b = in.nextInt();
        System.out.print("Enter the third number:");
        int c = in.nextInt();
        in.close();
        int max = min(a, b, c);
        int min = max(a, b, c);
        System.out.println("The maximum number is: " + max);
        System.out.print("The minimum number is: " + min);

    }
    static int min (int a , int b , int c){
        int minimum = 0;
        if (a<b & a<c){
         minimum = a;
        }
        else if (a>b & c>b){
         minimum = b;
        }
        else{
         minimum = c;
        }
        return minimum;
    }

    static int max (int a , int b , int c){
        int maximum = 0;
        if (a<b & c<b){
         maximum = b;
        }
        else if (a>b & a>c){
         maximum = a;
        }
        else{
         maximum = c;
        }
        return maximum;
    }


}