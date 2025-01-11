package catalog;

import books.Book;
import books.BookItem;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Catalog implements Search {
    private Map<String, List<BookItem>> bookTitles = new HashMap<>();
    private Map<String, List<BookItem>> bookAuthors = new HashMap<>();
    private Map<String, List<BookItem>> bookSubjects = new HashMap<>();
    private Map<Date, List<BookItem>> bookPublicationDates = new HashMap<>();

    // Add a book item to the catalog
    public void addBookItem(BookItem bookItem) {
       // Give logic here
    }

    // Implement searchByTitle
    @Override
    public List<Book> searchByTitle(String title) {
        // Give logic here
        return new ArrayList<>(bookTitles.getOrDefault(title, new ArrayList<>()));
    }

    // Implement searchByAuthor
    @Override
    public List<Book> searchByAuthor(String author) {
        // Give logic here
        return new ArrayList<>(bookAuthors.getOrDefault(author, new ArrayList<>()));
    }

    // Implement searchBySubject
    @Override
    public List<Book> searchBySubject(String subject) {
        // Give logic here
        return new ArrayList<>(bookSubjects.getOrDefault(subject, new ArrayList<>()));
    }

    // Implement searchByPublicationDate
    @Override
    public List<Book> searchByPublicationDate(Date publishDate) {
        // Give logic here
        return new ArrayList<>(bookPublicationDates.getOrDefault(publishDate, new ArrayList<>()));
    }
}

