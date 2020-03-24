package l10.repository;

public class ProductRepository extends InMemoryRepository<Long, String> {

    @Override
    public void save(String s) {
        index.put(123L, s);
    }

}
