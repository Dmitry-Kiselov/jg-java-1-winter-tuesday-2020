package l6;

import java.util.Random;

public class DoWhileDemo {

    public static void main(String[] args) {

        Random random = new Random();
        int fiftyChance;

        do {
            fiftyChance = random.nextInt(99) + 1;
            System.out.println("Throwin' the ball in da basket.. How lucky I am now? Only this much: " + fiftyChance);
        } while (fiftyChance > 50);

        System.out.println("I am the real deal");

    }

}
