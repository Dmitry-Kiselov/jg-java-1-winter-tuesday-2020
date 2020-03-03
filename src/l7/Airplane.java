package l7;

import java.util.Arrays;

public class Airplane {

    public static void main(String[] args) {

        Passenger[][] aircraft = {
                {new Passenger("A1", false), new Passenger("B1", false), new Passenger("C1", false),  new Passenger("D1", true)}, //0
                {new Passenger("A2", false), new Passenger("B2", false), new Passenger("C2", false), new Passenger("D2", false)}, //0
                {new Passenger("A3", false), new Passenger("B3", true), new Passenger("C3", false), new Passenger("D3", false)}, //0
                {new Passenger("A4", false), new Passenger("B4", false), new Passenger("C4", false), new Passenger("D4", false)}, //0
        };

        System.out.println(Arrays.toString(aircraft[0]));
        System.out.println(Arrays.toString(aircraft[1]));
        System.out.println(Arrays.toString(aircraft[2]));
        System.out.println(Arrays.toString(aircraft[3]));

    }

}
