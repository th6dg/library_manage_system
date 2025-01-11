package catalog;

import books.Book;
import java.util.Date;
import java.util.List;

public interface Search {
    List<Book> searchByTitle(String title);
    List<Book> searchByAuthor(String author);
    List<Book> searchBySubject(String subject);
    List<Book> searchByPublicationDate(Date publishDate);
}
