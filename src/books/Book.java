package books;

import java.util.Date;
import java.util.List;

public abstract class Book {
    private String ISBN;
    private String title;
    private String subject;
    private String publisher;
    private Date publicationDate;
    private List<String> authors;

    // Constructor
    public Book(String ISBN, String title, String subject, String publisher, Date publicationDate, List<String> authors) {
        this.ISBN = ISBN;
        this.title = title;
        this.subject = subject;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
        this.authors = authors;
    }

    // Getters and Setters
    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getSubject() {
        return subject;
    }

    public String getPublisher() {
        return publisher;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public List<String> getAuthors() {
        return authors;
    }
}
