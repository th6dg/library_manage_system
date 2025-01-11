package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LibrarianMainFrame extends JFrame {
    public LibrarianMainFrame() {
        setTitle("Librarian Dashboard");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel for Buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 20, 20));

        // Buttons
        JButton addBookButton = new JButton("Add Book");
        JButton removeBookButton = new JButton("Remove Book");
        JButton addMemberButton = new JButton("Add Member");
        JButton removeMemberButton = new JButton("Remove Member");
        JButton logoutButton = new JButton("Logout");

        panel.add(addBookButton);
        panel.add(removeBookButton);
        panel.add(addMemberButton);
        panel.add(removeMemberButton);
        panel.add(new JLabel()); // Empty space for layout balance
        panel.add(logoutButton);

        add(panel);

        // Action Listeners for Buttons
        addBookButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "Add Book functionality coming soon!"));
        removeBookButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "Remove Book functionality coming soon!"));
        addMemberButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "Add Member functionality coming soon!"));
        removeMemberButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "Remove Member functionality coming soon!"));

        logoutButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Logged out successfully!");
            dispose(); // Close main frame
            new LoginFrame().setVisible(true); // Return to login frame
        });

        setVisible(true);
    }
}
