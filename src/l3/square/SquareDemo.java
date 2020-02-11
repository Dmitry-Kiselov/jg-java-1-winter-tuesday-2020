package l3.square;

public class SquareDemo {

    public static void main(String[] args) {

        Square square = new Square(6);
        System.out.println("square.calculateArea() = " + square.calculateArea());

        square.side = 4;
        System.out.println("square.calculateArea() = " + square.calculateArea());

        square.printInfo();

    }

}
