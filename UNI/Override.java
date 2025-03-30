class Animal {
    void speak() {
        System.out.println("Animal make sound");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog barks");
    }
}

public class Override {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.speak();
    }
}