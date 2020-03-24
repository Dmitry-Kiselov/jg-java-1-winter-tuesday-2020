package l10.repository;

public class BookRepository extends InMemoryRepository<ISBN, Book> {

    @Override
    public void save(Book book) {
        index.put(book.getIsbn(), book);
    }

}
