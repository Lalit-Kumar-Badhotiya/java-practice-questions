import java.util.Scanner;

public class Rectangle {
    double length = 0;
    double width = 0;
    double area = 0;
    Scanner in = new Scanner(System.in);

    void fill() {
        System.out.print("Enter Length: ");
        length = in.nextDouble();
        System.out.println();
        System.out.print("Enter Width: ");
        width = in.nextDouble();
    }

    void calarea() {
        area = length * width;
    }

    void print() {
        calarea();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        Rectangle abc = new Rectangle();
        abc.fill();
        abc.print();
    }
}