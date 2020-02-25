package l6;

import java.util.Random;

public class BreakDemo {

    public static void main(String[] args) {

        Random random = new Random();

        int passengersCount = 5000;

        for (int currentPassenger = 1; currentPassenger <= passengersCount; currentPassenger++) {
            double currentPassengerTemperature = (random.nextDouble() * 3.4) + 36.6;

            if (currentPassengerTemperature > 39.5) {
                System.out.println("Unfortunately, sick passenger has been found 😷 ABORT at " + currentPassenger);
                break;
            }

            System.out.println("Great news, no sick passengers yet!");

        }

    }

}
