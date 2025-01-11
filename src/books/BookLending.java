package books;

import java.util.Date;

public class BookLending {
    private String itemId;        // The ID of the book item being lent
    private Date creationDate;    // The date the lending record was created
    private Date dueDate;         // The date the book is due to be returned
    private Date returnDate;      // The date the book was actually returned
    private String memberId;      // The ID of the member borrowing the book

    // Constructor
    public BookLending(String itemId, Date creationDate, Date dueDate, String memberId) {
        this.itemId = itemId;
        this.creationDate = creationDate;
        this.dueDate = dueDate;
        this.memberId = memberId;
    }

    // Getters and Setters
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getReturnDate() {
        // Give logic here
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    // Method to lend a book
    public static void lendBook(BookItem book, String memberId) {
       // Give logic here
    }

    // Method to fetch lending details
    public static BookLending fetchLendingDetails(BookItem book) {
        // Give logic here
        return null;
    }

    
}
