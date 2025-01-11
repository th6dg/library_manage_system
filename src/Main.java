import gui.LoginFrame;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Initialize the Library system
       // Library library = new Library();
        //library.start(); // Optional startup logic

        // Launch the GUI
        SwingUtilities.invokeLater(() -> {
            LoginFrame loginFrame = new LoginFrame();
            loginFrame.setVisible(true);
        });
    }
}
