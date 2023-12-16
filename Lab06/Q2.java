// Q.2 Create a Login form that has two label: username and password and two text field to take input of these values. 
// There should be a Login button. Once the Login button is created, display the dashboard. 
// In the form there should be link to signup page. If the link is created display the add user form created earlier.

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Dashboard {
    Dashboard() {
        JFrame jfd = new JFrame("Dashboard");
        jfd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfd.setLayout(new FlowLayout());
        jfd.add(new JTextArea("Login Successful"), BorderLayout.CENTER);
        jfd.setSize(400, 400);
        jfd.setVisible(true);
    }
}

public class Q2 implements ActionListener {
    JFrame jf;
    JButton jbLogin, jbSignUp;
    JLabel username, password;
    JTextField uField;
    JPasswordField pField;
    GridBagConstraints gbc;

    public Q2() {
        jf = new JFrame("Login Form");
        jf.setSize(400, 400);
        jf.setLayout(new GridBagLayout());
        
        gbc = new GridBagConstraints();
        
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = 0; gbc.gridy = 1;
        username = new JLabel("Username: ");
        jf.add(username, gbc);

        gbc.gridx = 1;
        uField = new JTextField(10);
        jf.add(uField, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        password = new JLabel("Password: ");
        jf.add(password, gbc);
        
        gbc.gridx = 1;
        pField = new JPasswordField(10);
        jf.add(pField, gbc);
        
        gbc.insets = new Insets(10, 5, 10, 5);
        gbc.gridx = 0; gbc.gridy = 3;
        jbLogin = new JButton("Login");
        jbLogin.addActionListener(this);
        jf.add(jbLogin, gbc);

        gbc.anchor = GridBagConstraints.LAST_LINE_END;
        gbc.gridx = 1;
        jbSignUp = new JButton("Sign up");
        jbSignUp.addActionListener(this);
        jf.add(jbSignUp, gbc);
        
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridwidth = 2;
        gbc.gridx = 0; gbc.gridy = 0;
        jf.add(new JLabel("LOGIN"), gbc);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbLogin && !(uField.getText().isEmpty()) && (pField.getPassword().length != 0)) {
            jf.dispose();
            new Dashboard();
        } else if (e.getSource() == jbSignUp) {
            jf.dispose();
            new Q1();
        }
    }

    public static void main(String[] args) {
        new Q2();
    }
}