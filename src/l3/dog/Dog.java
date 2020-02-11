package l3.dog;

public class Dog {

    String name;

    int age;
    int weight;
    int height;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(int age, int weight, int height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Dog(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

}
