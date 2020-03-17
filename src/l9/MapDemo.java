package l9;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<String, Integer> movieRatings = new HashMap<>();

        System.out.println(movieRatings);

        movieRatings.put("Big Lebovsky", 5);
        movieRatings.put("Witcher", 7);
        movieRatings.put("The Dark Knight", 9);
        movieRatings.put("Doctor House", 10);
        movieRatings.put("The Lord of the Rings: The Fellowship of the Ring", 9);

        System.out.println(movieRatings);

        movieRatings.put("Big Lebovsky", 6);

        System.out.println(movieRatings);

        System.out.println("movieRatings.containsKey(\"Witcher\") = " + movieRatings.containsKey("Witcher"));
        System.out.println("movieRatings.containsKey(\"Spidermoon\") = " + movieRatings.containsKey("Spidermoon"));

        System.out.println("movieRatings.containsValue(1) = " + movieRatings.containsValue(1));
        System.out.println("movieRatings.containsValue(10) = " + movieRatings.containsValue(10));

        System.out.println();
        System.out.println("The movies with rating 9:");
        for (Map.Entry<String, Integer> entry : movieRatings.entrySet()) {
            if (entry.getValue() == 9) {
                System.out.println(entry.getKey());
            }
        }

        System.out.println();
        System.out.println("Deleting Lord of the Rings");
        movieRatings.remove("The Lord of the Rings: The Fellowship of the Ring");

        System.out.println(movieRatings);
        System.out.println("movieRatings.size() = " + movieRatings.size());

    }

}
