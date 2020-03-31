package l11.message;

public class MockNumberSupplier implements NumberSupplier {

    private final int n;

    public MockNumberSupplier(int n) {
        this.n = n;
    }

    @Override
    public int get(int from, int to) {
        return n;
    }
}
