package lesson2;

public class MethodOverloadDemo {

    public static void main(String[] args) {

        foo();
        foo(3);
        foo(3, 7);
        foo(2.3, 5);

    }

    static void foo() {

    }

    static void foo(int a) {

    }

    static void foo(int a, int b) {

    }

    static void foo(double a, int b) {

    }

}
