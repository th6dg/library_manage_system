package users;

import books.BookItem;
import books.BookLending;

import java.util.Date;

public class Member extends User {
    private Date dateOfMembership;
    private int totalBooksCheckedOut;

    // Constructor
    public Member(String id, String password, Boolean status, Person person, utils.LibraryCard card, Date dateOfMembership) {
        super(id, password, status, person, card);
        this.dateOfMembership = dateOfMembership;
        this.totalBooksCheckedOut = 0;
    }

    // Getter and Setter methods
    public Date getDateOfMembership() {
        return dateOfMembership;
    }

    public void setDateOfMembership(Date dateOfMembership) {
        this.dateOfMembership = dateOfMembership;
    }

    public int getTotalBooksCheckedOut() {
        return totalBooksCheckedOut;
    }

    public void setTotalBooksCheckedOut(int totalBooksCheckedOut) {
        this.totalBooksCheckedOut = totalBooksCheckedOut;
    }

    // Method to reserve a book
    public boolean reserveBookItem(BookItem bookItem) {
        // Give logic here
        return true;
    }

    // Method to check out a book
    public boolean checkoutBookItem(BookItem bookItem) {
        // Give logic here
        return true;
    }

    // Method to return a book
    public boolean returnBookItem(BookItem bookItem) {
        // Give logic here
        return true;
    }
}
