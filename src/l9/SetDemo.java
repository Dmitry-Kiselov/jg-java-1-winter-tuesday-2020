package l9;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        System.out.println(set);

        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");
        set.add("X");
        set.add("c");

        System.out.println(set);

    }

}
