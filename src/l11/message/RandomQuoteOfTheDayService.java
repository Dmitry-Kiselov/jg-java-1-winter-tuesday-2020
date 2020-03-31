package l11.message;

import java.util.Random;

public class RandomQuoteOfTheDayService implements QuoteOfTheDayService {

    private static final String[] quotes = {
            "I'll be back",
            "Vse, poka, poka",
            "Never gonna give you up",
            "Cepur nost",
            "Make love not war"
    };

/*    private final Random random; //<--- DEPENDENCY

    public RandomQuoteOfTheDayService(Random random) { //<--- DEPENDENCY INJECTION
        this.random = random;
    }*/

    private final NumberSupplier numberSupplier; //<--- DEPENDENCY

    public RandomQuoteOfTheDayService(NumberSupplier numberSupplier) { //<--- DI
        this.numberSupplier = numberSupplier;
    }

    @Override
    public String getQuote() {
        int index = numberSupplier.get(0, quotes.length);  // random.nextInt(quotes.length);
        return quotes[index];
    }

}
