package lesson1.example1;

public class MathOperationsDemo {

    public static void main(String[] args) {

        double a = 43;
        double b = 18;

        System.out.println(a + b);
        System.out.println("" + a + b);

        System.out.println(a + " + " + b + " = " + (a + b));

        short s = (short) 345223498;
        System.out.println(s);

        int x = 50;
        int y = 5;

        System.out.println("+ => " + (x + y));
        System.out.println("- => " + (x - y));
        System.out.println("/ => " + (x / y));
        System.out.println("* => " + (x * y));
        System.out.println("% => " + (x % y));

        int n = 36;

        boolean isEven = n % 2 == 0;

        System.out.println("is even? " + isEven);

        System.out.println();

        char letter = 'a';
        char letterCode = 65;
        System.out.println(letter);
        System.out.println(letterCode);

        System.out.println((int) letter);
        System.out.println((int) letterCode);

        int hashtag = 35;
        System.out.println(hashtag);
        System.out.println((char) hashtag);

    }

}
