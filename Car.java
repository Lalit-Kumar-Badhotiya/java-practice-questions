











public class Car {
    String brand;
    String model;
    int year;

    Car() {
        brand = "no brand";
        model = "no model";
        year = 0000;
    }

    Car(String bran, String Mode, int mfyear) {
        brand = bran;
        model = Mode;
        year = mfyear;
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("ferrari", "F40", 1980);
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);

    }

}