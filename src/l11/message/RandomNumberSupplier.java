package l11.message;

import java.util.Random;

public class RandomNumberSupplier implements NumberSupplier {

    private final Random random = new Random();

    @Override
    public int get(int from, int to) {
        return from + random.nextInt(to);
    }

}
