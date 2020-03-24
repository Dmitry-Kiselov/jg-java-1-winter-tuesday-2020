package l10;

public class UncheckedExceptionDemo {

    public static void main(String[] args) {

        String nullString = null;
//        foo(nullString);
        bar();

    }

    private static void foo(String str) {
        if (str.length() > 5) {
            System.out.println("The string length is greater than 5");
        }
    }

    private static void bar() {
        int[] array = new int[10];
        array[11] = 0;
    }

}
