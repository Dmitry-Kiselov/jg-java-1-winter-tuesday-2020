package l3.square;

public class Square {

    int side;

    public Square(int side) {
        this.side = side;
    }

    int calculateArea() {
        return side * side;
    }

    void printInfo() {
        System.out.println("I'm square with a side of " + side);
        System.out.println("My area is " + calculateArea());
    }

}
