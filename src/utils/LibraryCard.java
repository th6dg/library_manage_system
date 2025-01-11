package utils;

import java.util.Date;

public class LibraryCard {
    private String cardNumber;
    private Date issued;
    private boolean active;

    // Constructor
    public LibraryCard(String cardNumber, Date issued, boolean active) {
        this.cardNumber = cardNumber;
        this.issued = issued;
        this.active = active;
    }

    // Getters and Setters
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getIssued() {
        return issued;
    }

    public void setIssued(Date issued) {
        this.issued = issued;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    // Method to deactivate the card
    public void deactivate() {
        this.active = false;
        System.out.println("Library card " + cardNumber + " has been deactivated.");
    }

    // Method to activate the card
    public void activate() {
        this.active = true;
        System.out.println("Library card " + cardNumber + " has been activated.");
    }
}
