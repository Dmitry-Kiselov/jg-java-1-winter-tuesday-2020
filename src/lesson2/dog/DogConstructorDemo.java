package lesson2.dog;

public class DogConstructorDemo {

    public static void main(String[] args) {

        Dog d2 = new Dog("Sharik");

        System.out.println("d2.name = " + d2.name);
        System.out.println("d2.age = " + d2.age);

        Dog d3 = new Dog("Tuzik", 5);

        System.out.println("d3.name = " + d3.name);
        System.out.println("d3.age = " + d3.age);

        Dog d4 = new Dog(1, 2, 3);

        Dog d5 = new Dog(10, 20);

    }

}
