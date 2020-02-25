package l6;

import java.util.Random;

public class ContinueDemo {

    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            boolean isSock = (random.nextInt(10) == 5);

            if (isSock) {
                System.out.println(i + ") Eww.. Sock!");
                continue;
            }

            System.out.println(i + ") Here you go, my lovely Samsung Washer Bubble Dry 3000");
        }


    }

}
