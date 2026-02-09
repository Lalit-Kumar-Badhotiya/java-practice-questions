//1. Area Of Circle Java Program

import java.util.Scanner;
public class Area_of_circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pie = 3.14159;
        System.out.print("Enter the radius:");
        double radius = in.nextDouble();
        double area = pie*(radius*radius);
        System.out.println(area);   
        in.close(); 
    }    
}
