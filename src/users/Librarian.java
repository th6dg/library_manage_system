package users;

import books.BookItem;
import java.util.ArrayList;
import java.util.List;

public class Librarian extends User {

    // Constructor
    public Librarian(String id, String password, Boolean status, Person person, utils.LibraryCard card) {
        super(id, password, status, person, card);
    }

    // Method to add a new book item to the library
    public boolean addBookItem(BookItem bookItem) {
        // Give logic here
        return true;
    }

    // Method to add a new book item to the library
    public boolean removeItem(BookItem bookItem) {
        // Give logic here
        return true;
    }

    // Method to block a library member
    public boolean removeMember(Member member) {
        // Give logic here
        return true;
    }

    // Method to unblock a library member
    public boolean addMember(Member member) {
        // Give logic here
        return true;
    }

}
