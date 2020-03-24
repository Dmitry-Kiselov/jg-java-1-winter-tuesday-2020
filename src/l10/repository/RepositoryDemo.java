package l10.repository;

public class RepositoryDemo {

    public static void main(String[] args) {

        Book b1 = new Book(new ISBN("1"), "War and Peace", "Leo Tolstoy");
        Book b2 = new Book(new ISBN("2"), "Kolobok", "People");
        Book b3 = new Book(new ISBN("3"), "Master & Margharita", "Mike Bulgakov");

        Repository<ISBN, Book> bookRepository = new BookRepository();

        System.out.println(bookRepository.findAll());

        bookRepository.save(b1);
        bookRepository.save(b2);
        bookRepository.save(b3);

        System.out.println(bookRepository.findAll());
        System.out.println(bookRepository.findById(new ISBN("2")));

        bookRepository.delete(new ISBN("3"));

        System.out.println(bookRepository.findAll());

    }

}
