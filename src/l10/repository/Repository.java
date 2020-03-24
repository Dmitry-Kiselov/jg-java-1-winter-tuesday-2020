package l10.repository;

import java.util.List;

public interface Repository<ID, T> {

    List<T> findAll();

    T findById(ID id);

    void save(T t);

    void delete(ID id);

}
