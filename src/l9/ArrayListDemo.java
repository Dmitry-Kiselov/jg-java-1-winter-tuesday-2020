package l9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<Dumpling> dumplingsPack = new ArrayList<>();

        System.out.println("dumplingsPack.isEmpty() = " + dumplingsPack.isEmpty());
        System.out.println(dumplingsPack);

        dumplingsPack.add(new Dumpling("Chicken", 12));
        dumplingsPack.add(new Dumpling("Turkey", 14));
        dumplingsPack.add(new Dumpling("Beef", 11));
        dumplingsPack.add(new Dumpling("Pork", 15));
        dumplingsPack.add(new Dumpling("Lamb", 17));
        dumplingsPack.add(null);
        dumplingsPack.add(new Dumpling("Cheese", 19));

        System.out.println(dumplingsPack);

 /*       System.out.println();

        for (Dumpling dumpling : dumplingsPack) {
            System.out.println(dumpling);
        }*/

        System.out.println("dumplingsPack.isEmpty() = " + dumplingsPack.isEmpty());
        System.out.println("dumplingsPack.get(3) = " + dumplingsPack.get(3));
        System.out.println("dumplingsPack.size() = " + dumplingsPack.size());
        System.out.println("dumplingsPack.contains(new Dumpling(\"Cheese\", 19)) = " + dumplingsPack.contains(new Dumpling("Cheese", 19)));

        System.out.println();
        System.out.println("Removing dumpling @ idx = 3");

        dumplingsPack.remove(3);

        System.out.println("dumplingsPack.get(3) = " + dumplingsPack.get(3));
        System.out.println("dumplingsPack.size() = " + dumplingsPack.size());

        System.out.println();
        System.out.println("Clearing dumplings pack");

        dumplingsPack.clear();

        System.out.println("dumplingsPack.size() = " + dumplingsPack.size());
        System.out.println("dumplingsPack.isEmpty() = " + dumplingsPack.isEmpty());

    }

}
