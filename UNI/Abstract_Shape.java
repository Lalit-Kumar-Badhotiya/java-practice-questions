
abstract class shape {
    abstract double area();

}

class Circle extends shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return radius * radius;
    }
}

class rectangle extends shape {
    double length, width;

    rectangle(double length, double width) {
        this.length = length;
        this.width = width;

    }

    @Override
    double area() {
        return length * width;
    }
}

public class Abstract_Shape {
    public static void main(String[] args) {
        Circle circle = new Circle(65);
        rectangle rectangle = new rectangle(67, 98);
        System.out.println(circle.area());
        System.out.println(rectangle.area());
    }
}