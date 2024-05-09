import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    private JTextField usernameField;
    private JPasswordField passwordField;

    public Login() {
        setTitle("Mental Health App Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 250);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        getContentPane().setBackground(new Color(193, 255, 114));

        // Logo JLabel
        ImageIcon logoIcon = new ImageIcon("Wellness-Wave.png"); // Replace "logo.png" with your actual logo file path
        JLabel logoLabel = new JLabel(logoIcon);
        add(logoLabel, BorderLayout.WEST);

        JLabel signInLabel = new JLabel("LOGIN", SwingConstants.CENTER);
        signInLabel.setFont(new Font("Arial", Font.BOLD, 24));
        signInLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        add(signInLabel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel(new GridLayout(2, 1, 0, 10));
        centerPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        centerPanel.setOpaque(false);

        JPanel usernamePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(15);
        usernamePanel.add(usernameLabel);
        usernamePanel.add(usernameField);

        JPanel passwordPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(15);
        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordField);

        centerPanel.add(usernamePanel);
        centerPanel.add(passwordPanel);
        add(centerPanel, BorderLayout.CENTER);

        Color buttonColor = new Color(193, 255, 114);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        JButton loginButton = new JButton("Login");
        JButton resetButton = new JButton("Reset Password");
        loginButton.setBackground(buttonColor);
        resetButton.setBackground(buttonColor);
        buttonPanel.add(loginButton);
        buttonPanel.add(resetButton);
        add(buttonPanel, BorderLayout.SOUTH);

        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Login")) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());


            JOptionPane.showMessageDialog(this, "Username: " + username + "\nPassword: " + password);
        } else if (e.getActionCommand().equals("Reset Password")) {

            JOptionPane.showMessageDialog(this, "Reset Password functionality not implemented yet.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MentalHealthAppLogin().setVisible(true);
            }
        });
    }
}
