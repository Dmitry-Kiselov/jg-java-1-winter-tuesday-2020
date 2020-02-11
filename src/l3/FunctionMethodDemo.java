package l3;

public class FunctionMethodDemo {

    public static void main(String[] args) {

        int r1 = divide(15, 5);
        int r2 = divide(60, 10);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        boolean b1 = isEven(8);
        boolean b2 = isEven(7);

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        double humanTemperature = celsiusToFahrenheit(36.6);
        System.out.println("36.6c = " + humanTemperature + "f");

    }

    static int divide(int a, int b) {
        int result = a / b;
        return result;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static double celsiusToFahrenheit(double c) {
        return ((c * 9) / 5) + 32;
    }

}
