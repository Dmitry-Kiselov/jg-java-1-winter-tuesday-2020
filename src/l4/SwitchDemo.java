package l4;

public class SwitchDemo {

    public static void main(String[] args) {

        String trafficLight = "green"; //"yellow" "red"

        System.out.println("I'm driving black on black..");
        System.out.println("Just got my license back..");

        switch (trafficLight) {
            case "green":
                System.out.println("Keep going.. Let's do it.. [" + trafficLight + "]");
                break;
            case "yellow":
                System.out.println("Pedal to the metal..[" + trafficLight + "]");
                break;
            case "red":
                System.out.println("Stop!!! [" + trafficLight + "]");
                break;
            default:
                System.out.println("Something went wrong.. [" + trafficLight + "]");
                break;
        }

        System.out.println("We did it :-)");

        int x = 0;

        switch (x) {
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("Something else");
                break;
        }

    }

}
