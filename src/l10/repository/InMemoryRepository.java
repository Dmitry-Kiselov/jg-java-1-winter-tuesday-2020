package l10.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class InMemoryRepository<ID, T> implements Repository<ID, T> {

    protected Map<ID, T> index = new HashMap<>();

    @Override
    public List<T> findAll() {
        return new ArrayList<>(index.values());
    }

    @Override
    public T findById(ID id) {
        if (index.containsKey(id)) {
            return index.get(id);
        }
        return null;
    }

    @Override
    public void delete(ID id) {
        index.remove(id);
    }

}
