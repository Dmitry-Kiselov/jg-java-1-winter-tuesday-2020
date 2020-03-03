package l7;

public class RangeDemo {

    public static void main(String[] args) {

        Range r1 = Range.of();
        Range r2 = Range.of(10, 20);
        Range r3 = Range.ofLeft(50);
        Range r4 = Range.ofRight(80);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

    }

}
