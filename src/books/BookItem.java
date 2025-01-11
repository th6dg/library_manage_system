package books;

import utils.Rack;
import java.util.Date;

public class BookItem extends Book {
    private boolean isReferenceOnly;
    private Date borrowed;
    private Date dueDate;
    private double price;
    private Boolean status;  // book status
    private Date dateOfPurchase;
    private Rack placedAt;

    // Constructor
    public BookItem(String ISBN, String title, String subject, String publisher, Date publicationDate, 
                    boolean isReferenceOnly, double price, Rack placedAt, Boolean status, Date dateOfPurchase) {
        super(ISBN, title, subject, publisher, publicationDate, null);
        this.isReferenceOnly = isReferenceOnly;
        this.price = price;
        this.placedAt = placedAt;
        this.status = status;
        this.dateOfPurchase = dateOfPurchase;
    }

    // Getters and Setters
    public boolean isReferenceOnly() {
        return isReferenceOnly;
    }

    public Date getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(Date borrowed) {
        this.borrowed = borrowed;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public double getPrice() {
        return price;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public Rack getPlacedAt() {
        return placedAt;
    }

    // Method to checkout the book
    public boolean checkout(String memberId) {
        // Give logic here
        return false;
    }
}

