package consultation.repository;

import consultation.Milk;
import consultation.Water;

public class RepositoryDemo {

    public static void main(String[] args) {

        Repository<String> stringRepository = new InMemoryStringRepository();

        System.out.println(stringRepository.findAll());

        stringRepository.save("FOO");
        stringRepository.save("BAR");
        stringRepository.save("BAZ");

        System.out.println(stringRepository.findAll());

        stringRepository.delete("BAR");

        System.out.println(stringRepository.findAll());

    }

}
