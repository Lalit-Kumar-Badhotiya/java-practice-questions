public class Person {
    String name;
    String address;
    int age;

    Person() {
        name = "no name";
        address = "no address";
        age = 0;
    }

    Person(String name1, String addres1, int age1) {
        name = name1;
        address = addres1;
        age = age1;
    }

    public static void main(String[] args) {
        Person person = new Person();
        Person person2 = new Person("Bharat", "agra", 20);
        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.age);
        System.out.println(person2.name);
        System.out.println(person2.address);
        System.out.println(person2.age);

    }

}