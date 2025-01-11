package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class MemberMainFrame extends JFrame {
    public MemberMainFrame() {
        setTitle("Member Dashboard");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel for Buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 20, 20));

        // Buttons
        JButton searchBooksButton = new JButton("Search Books");
        JButton viewBorrowedBooksButton = new JButton("View Borrowed Books");
        JButton returnBooksButton = new JButton("Return Books");
        JButton logoutButton = new JButton("Logout");

        panel.add(searchBooksButton);
        panel.add(viewBorrowedBooksButton);
        panel.add(returnBooksButton);
        panel.add(new JLabel()); // Empty space for layout balance
        panel.add(logoutButton);

        add(panel);

        // Action Listeners for Buttons
        searchBooksButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "Search Books functionality coming soon!"));
        viewBorrowedBooksButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "View Borrowed Books functionality coming soon!"));
        returnBooksButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "Return Books functionality coming soon!"));

        logoutButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Logged out successfully!");
            dispose(); // Close main frame
            new LoginFrame().setVisible(true); // Return to login frame
        });

        setVisible(true);
    }
}
