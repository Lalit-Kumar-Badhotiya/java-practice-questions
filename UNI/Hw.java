abstract class Animal {
    abstract void speak();
}

class Dog extends Animal {
    final int dog_count = 38;

    @Override
    void speak() {
        System.out.println("The dog barks");
    }
}

public class Abstract_final {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.speak();
        System.out.println("the dog count is: " + dog.dog_count);
    }

}
