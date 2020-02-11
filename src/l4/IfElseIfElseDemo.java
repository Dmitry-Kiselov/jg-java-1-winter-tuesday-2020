package l4;

public class IfElseIfElseDemo {

    public static void main(String[] args) {

        String trafficLight = "blue"; //"yellow" "red"

        System.out.println("I'm driving black on black..");
        System.out.println("Just got my license back..");

        if (trafficLight.equals("green")) {

            System.out.println("Keep going.. Let's do it..");

        } else if (trafficLight.equals("yellow")) {

            System.out.println("Pedal to the metal..");

        } else if (trafficLight.equals("red")) {

            System.out.println("Stop!!!");

        } else {

            System.out.println("Something went wrong..");

        }

        System.out.println("We did it :-)");

    }

}
