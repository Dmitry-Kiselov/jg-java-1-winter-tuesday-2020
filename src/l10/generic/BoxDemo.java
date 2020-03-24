package l10.generic;

public class BoxDemo {

    public static void main(String[] args) {

        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(123);

        Box<Double> doubleBox = new Box<>();
        doubleBox.setValue(5.0);

        Box<String> stringBox = new Box<>();

        Box<Number> numberBox = new Box<Number>();

        isPositive(integerBox);
        isPositive(doubleBox);

    }

    public static boolean isPositive(Box<? extends Number> numberBox) {
        return numberBox.getValue().doubleValue() > 0;
    }

}
