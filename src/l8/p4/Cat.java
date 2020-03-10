package l8.p4;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void sleep() {
        System.out.println("Cat zzz...");
    }
}
