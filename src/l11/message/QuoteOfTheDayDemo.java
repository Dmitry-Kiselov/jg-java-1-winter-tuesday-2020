package l11.message;

import java.util.Random;

public class QuoteOfTheDayDemo {

    public static void main(String[] args) {

//        Random random = new Random();

        NumberSupplier numberSupplier = new MockNumberSupplier(0);  //new RandomNumberSupplier();

        QuoteOfTheDayService quoteService = new RandomQuoteOfTheDayService(numberSupplier); //<--- DI

        System.out.println(quoteService.getQuote());

    }

}
