package consultation.repository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryStringRepository implements Repository<String> {

    private List<String> strings;

    public InMemoryStringRepository() {
        this.strings = new ArrayList<>();
    }

    @Override
    public List<String> findAll() {
        return strings;
    }

    @Override
    public void save(String item) {
        strings.add(item);
    }

    @Override
    public void delete(String item) {
        strings.remove(item);
    }

}
