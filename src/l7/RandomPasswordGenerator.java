package l7;

import java.util.Arrays;
import java.util.Random;

public class RandomPasswordGenerator {

    private static int abc = 0;

    public static void main(String[] args) {

        RandomPasswordGenerator generator = new RandomPasswordGenerator();

        System.out.println(generator.getRandomPassword(7));
        System.out.println(generator.getRandomPassword(20));

    }

    private String getRandomPassword(int passwordLength) {
        char[] randomPassword = new char[passwordLength];

        for (int i = 0; i < randomPassword.length; i++) {
            randomPassword[i] = getRandomChar();
        }

        return String.valueOf(randomPassword);
    }

    private char getRandomChar() {
        Random random = new Random();
        return (char) (33 + random.nextInt(93));
    }

}
