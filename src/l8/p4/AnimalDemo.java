package l8.p4;

public class AnimalDemo {

    public static void main(String[] args) {

        Animal cat = new Cat("Barsik");
        Animal dog = new Dog("Sharik");

        Cat cat2 = new Cat("OOof");

//        cat.sleep();
//        dog.sleep();

        putAnimalAsleep(cat);
        putAnimalAsleep(dog);
        putAnimalAsleep(cat2);
    }

    public static void putAnimalAsleep(Animal animal) {
        System.out.println("Putting animal to sleep..");
        animal.sleep();
    }

}
