package l7;

public class Range {

    private int leftBound;
    private int rightBound;

    private Range() {
    }

    private Range(int leftBound, int rightBound) {
        this.leftBound = leftBound;
        this.rightBound = rightBound;
    }

    public static Range of() {
        return new Range(0, 0);
    }

    public static Range of(int leftBound, int rightBound) {
        return new Range(leftBound, rightBound);
    }

    public static Range ofLeft(int leftBound) {
        return new Range(leftBound, leftBound + 10);
    }

    public static Range ofRight(int rightBound) {
        return new Range(rightBound - 10, rightBound);
    }

    @Override
    public String toString() {
        return "Range{" +
                "leftBound=" + leftBound +
                ", rightBound=" + rightBound +
                '}';
    }
}
