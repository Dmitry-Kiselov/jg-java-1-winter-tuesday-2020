package l8.p4;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sleep() {
        System.out.println("Dog zzz...");
    }
}
