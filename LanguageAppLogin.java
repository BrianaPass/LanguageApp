import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LanguageAppLogin {

    // Main frame for the login page
    public static void main(String[] args) {
        JFrame frame = new JFrame("Language App - Login");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel to hold components
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        // Set the frame visibility to true
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);

        // Username Label
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 80, 25);
        panel.add(userLabel);

        // Username Text Field
        JTextField userText = new JTextField(20);
        userText.setBounds(140, 50, 165, 25);
        panel.add(userText);

        // Password Label
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 90, 80, 25);
        panel.add(passwordLabel);

        // Password Text Field
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(140, 90, 165, 25);
        panel.add(passwordText);

        // Login Button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(140, 130, 80, 25);
        panel.add(loginButton);

        // Login Action
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passwordText.getPassword());

                // Simple login check (this can be replaced with actual login logic)
                if (username.equals("admin") && password.equals("password")) {
                    JOptionPane.showMessageDialog(null, "Login successful! Welcome to the Language App.");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password. Try again.");
                }
            }
        });

        // Register Button
        JButton registerButton = new JButton("Register");
        registerButton.setBounds(230, 130, 100, 25);
        panel.add(registerButton);

        // Register Action (just a message for now)
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Registration page (to be implemented)");
            }
        });
    }
}
