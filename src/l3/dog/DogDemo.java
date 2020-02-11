package l3.dog;

public class DogDemo {

    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.name = "Sharik";
        d1.name = "Bobik";

        d1.age = 3;

        System.out.println("d1.name = " + d1.name);
        System.out.println("d1.age = " + d1.age);

        d1.age = 4;

        System.out.println("d1.name = " + d1.name);
        System.out.println("d1.age = " + d1.age);

    }

}
