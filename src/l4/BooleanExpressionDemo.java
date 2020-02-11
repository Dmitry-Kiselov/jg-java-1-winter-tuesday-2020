package l4;

public class BooleanExpressionDemo {

    public static void main(String[] args) {

        int x = 4;

        if (x > 5 && x < 20 && x % 2 == 0) {
            System.out.println("T");
        } else {
            System.out.println("F");
        }

        System.out.println();

        boolean alwaysTrue = false;

        if (!alwaysTrue) {
            System.out.println("X");
        } else {
            System.out.println("Y");
        }

    }

}
