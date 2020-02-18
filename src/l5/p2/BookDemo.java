package l5.p2;

public class BookDemo {

    public static void main(String[] args) {

        Book b1 = new Book("L. Tolstoy", "War and Peace");
        Book b2 = new Book("L. Tolstoy", "War and Peace");
        Book b3 = new Book("J.K. Rowling", "Harry Potter");

        System.out.println("Reference Equality: ");
        System.out.println("b1 == b1 = " + (b1 == b1));
        System.out.println("b1 == b2 = " + (b1 == b2));
        System.out.println("b1 == b3 = " + (b1 == b3));

        System.out.println();

        System.out.println("b2 == b1 = " + (b2 == b1));
        System.out.println("b2 == b2 = " + (b2 == b2));
        System.out.println("b2 == b3 = " + (b2 == b3));

        System.out.println();

        System.out.println("b3 == b1 = " + (b3 == b1));
        System.out.println("b3 == b2 = " + (b3 == b2));
        System.out.println("b3 == b3 = " + (b3 == b3));

        System.out.println();
        System.out.println("Value Equality: ");
        System.out.println("b1.equals(b1) = " + b1.equals(b1));
        System.out.println("b1.equals(b2) = " + b1.equals(b2));
        System.out.println("b1.equals(b3) = " + b1.equals(b3));

        System.out.println();

        System.out.println("b2.equals(b1) = " + b2.equals(b1));
        System.out.println("b2.equals(b2) = " + b2.equals(b2));
        System.out.println("b2.equals(b3) = " + b2.equals(b3));

        System.out.println();

        System.out.println("b3.equals(b1) = " + b3.equals(b1));
        System.out.println("b3.equals(b2) = " + b3.equals(b2));
        System.out.println("b3.equals(b3) = " + b3.equals(b3));
    }

}
