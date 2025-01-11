package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    public LoginFrame() {
        setTitle("Library Login");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel for Login Form
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));

        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField();
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();
        JButton loginButton = new JButton("Login");

        panel.add(userLabel);
        panel.add(userField);
        panel.add(passLabel);
        panel.add(passField);
        panel.add(new JLabel()); // Empty space
        panel.add(loginButton);

        add(panel);

        // Login Button Action
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passField.getPassword());

                // Logic for librarian and member login
                if (username.equals("librarian") && password.equals("password")) {
                    JOptionPane.showMessageDialog(null, "Login successful! Welcome Librarian.");
                    dispose(); // Close login frame
                    new LibrarianMainFrame(); // Open librarian main frame
                } else if (username.equals("member") && password.equals("password")) {
                    JOptionPane.showMessageDialog(null, "Login successful! Welcome Member.");
                    dispose(); // Close login frame
                    new MemberMainFrame(); // Open member main frame
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid credentials. Try again!");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginFrame loginFrame = new LoginFrame();
            loginFrame.setVisible(true);
        });
    }
}
