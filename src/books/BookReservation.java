package books;

import java.util.Date;

public class BookReservation {
    private String itemId;
    private Date creationDate;
    private Boolean status;  // ReservationStatus
    private String memberId;

    // Constructor
    public BookReservation(String itemId, Date creationDate, Boolean status, String memberId) {
        this.itemId = itemId;
        this.creationDate = creationDate;
        this.status = status;
        this.memberId = memberId;
    }

    // Getters and Setters
    public String getItemId() {
        return itemId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMemberId() {
        return memberId;
    }


    // Fetch reservation details
    public static BookReservation fetchReservationDetails(BookItem book) {
       //Give logic here
       return null;
    }
}
