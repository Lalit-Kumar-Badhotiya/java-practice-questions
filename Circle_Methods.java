/*6. [Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.]
(https://beginnersbook.com/2014/01/java-program-to-calculate-area-and-circumference-of-circle/)*/
import java.util.Scanner;
public class Circle_Methods {
    static double pie =3.141592653589793238462643383279502884197;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius:");
        Double radius = in.nextDouble();
        in.close();
        double circumference = Circumference(radius);
        double area = Area(radius);
        System.out.println("The circumference is: " + circumference);
        System.out.print("The area is: " + area);
    }
    static double Circumference(double radius){
        double cir = (2*pie)*radius;
        return cir;
    }
    static double Area(double radius){
        double area = pie*(radius*radius);
        return area;
    }
}
