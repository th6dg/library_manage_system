package users;


public abstract class User {
    private String id;
    private String password;
    //private AccountStatus status;
    private Boolean status;
    private Person person; // Represents user's personal details like name, address, etc.
    private utils.LibraryCard card;

    // Constructor
    public User(String id, String password, Boolean status, Person person, utils.LibraryCard card) {
        this.id = id;
        this.password = password;
        this.status = status;
        this.person = person;
        this.card = card;
    }

    // Getter and Setter methods
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public utils.LibraryCard getCard() {
        return card;
    }

    public void setCard(utils.LibraryCard card) {
        this.card = card;
    }

    // Method to reset the user's password
    public boolean resetPassword(String newPassword) {
        if (newPassword == null || newPassword.isEmpty()) {
            return false;
        }
        this.password = newPassword;
        return true;
    }
}
