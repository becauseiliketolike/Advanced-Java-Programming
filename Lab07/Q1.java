// Q. 1 In the form created at Lab 6 Question 1, Add two buttons: submit and clear
// When submit is clicked:
// 1. Validate all the fields. Constraints:
//     Name should not be more than 20 character long.
//     Email should be valid
//     Submit button should be clickable only if the terms and condition is checked else it should be disabled
//     Check all fields are filled

// All the error message on validation should be shown in label below the buttons with some numbering in red color.
// When clear button is clicked, clear all the user input and user selected values.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SignUpForm implements ActionListener {
    JFrame jf;
    JLabel jlName, jlAddress, jlCountry, jlEmail, jlMarital, jlGender;
    static JTextField jtfName, jtfAddress, jtfEmail;
    static JComboBox<String> jcbCountry;
    static JCheckBox jcbTerms;
    static ButtonGroup bgStatus, bgGender;
    JRadioButton jrbMale, jrbFemale, jrbMarried, jrbUnmarried, jrbSingle;
    static JButton jbSubmit, jbClear;
    static JTextArea jtaSubmit;
    static int errorIndex;
    static boolean hasError;
    
    public SignUpForm() {
        jf = new JFrame("Sign Up Form");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(500, 500);
        
        jf.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.insets = new Insets(0, 10, 10, 0);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 0; gbc.gridy = 1;
        jlName = new JLabel("Name: ");
        jf.add(jlName, gbc);
        gbc.gridx = 1;
        jtfName = new JTextField(15);
        jf.add(jtfName, gbc);
        
        gbc.gridx = 0; gbc.gridy = 2;
        jlAddress = new JLabel("Address: ");
        jf.add(jlAddress, gbc);
        gbc.gridx = 1;
        jtfAddress = new JTextField(15);
        jf.add(jtfAddress, gbc);
        
        gbc.gridx = 0; gbc.gridy = 3;
        jlEmail = new JLabel("Email: ");
        jf.add(jlEmail, gbc);
        gbc.gridx = 1;
        jtfEmail = new JTextField(15);
        jf.add(jtfEmail, gbc);
        
        gbc.gridx = 0; gbc.gridy = 4;
        jlCountry = new JLabel("Country: ");
        jf.add(jlCountry, gbc);
        gbc.gridx = 1;
        String[] country = {null, "USA", "UK", "Nepal"};
        jcbCountry = new JComboBox<>(country);
        jf.add(jcbCountry, gbc);
        
        gbc.gridx = 0; gbc.gridy = 5;
        jlMarital = new JLabel("Marital Status: ");
        jf.add(jlMarital, gbc);
        gbc.gridx = 1;
        jrbMarried = new JRadioButton("Married");
        jrbUnmarried = new JRadioButton("Unmarried");
        jrbSingle = new JRadioButton("Single");
        bgStatus = new ButtonGroup();
        bgStatus.add(jrbMarried);
        bgStatus.add(jrbUnmarried);
        bgStatus.add(jrbSingle);
        JPanel jpStatus = new JPanel();
        jpStatus.add(jrbMarried); jpStatus.add(jrbUnmarried); jpStatus.add(jrbSingle);
        jf.add(jpStatus, gbc);

        gbc.gridx = 0; gbc.gridy = 6;
        jlGender = new JLabel("Gender: "); 
        jf.add(jlGender, gbc);
        gbc.gridx = 1;
        jrbMale = new JRadioButton("Male");
        jrbFemale = new JRadioButton("Female");
        bgGender = new ButtonGroup();
        bgGender.add(jrbMale);
        bgGender.add(jrbFemale);
        JPanel jpGender = new JPanel();
        jpGender.add(jrbMale); jpGender.add(jrbFemale);
        jf.add(jpGender, gbc);

        gbc.gridx = 0; gbc.gridy = 7;
        gbc.gridwidth = 2;
        jcbTerms = new JCheckBox("Accept Terms and Policy");
        jcbTerms.addActionListener(this);
        jf.add(jcbTerms, gbc);

        jtaSubmit = new JTextArea();
        jtaSubmit.setBackground(null);
        gbc.gridx = 0; gbc.gridy = 9;
        gbc.gridwidth = 2;
        jf.add(jtaSubmit, gbc);

        gbc.gridx = 0; gbc.gridy = 8;
        jbSubmit = new JButton("Submit");
        jbSubmit.setEnabled(false);
        jbSubmit.addActionListener(this);
        jf.add(jbSubmit, gbc);
        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 1;
        jbClear = new JButton("Clear");
        jbClear.addActionListener(this);
        jf.add(jbClear, gbc);
        
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 0; gbc.gridy = 0;
        gbc.insets = new Insets(0, 0, 15, 0);
        jf.add(new JLabel("SIGN UP FORM"), gbc);
        
        jf.setVisible(true);
    }

    public static void ErrorMessage(String message) {
        hasError = true;
        jtaSubmit.append((errorIndex++) + message);
    }

    public static void ClearFields() {
        jbSubmit.setEnabled(false);
        jtfName.setText(null);
        jtfAddress.setText(null);
        jtfEmail.setText(null);
        jcbCountry.setSelectedIndex(0);
        bgStatus.clearSelection();
        bgGender.clearSelection();
        jcbTerms.setSelected(false);
    }
  
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jcbTerms) {    
            if (jcbTerms.isSelected()) 
                jbSubmit.setEnabled(true);
            else 
                jbSubmit.setEnabled(false);
        } else if (e.getSource() == jbSubmit) {
            errorIndex = 1;
            hasError = false;
            jtaSubmit.setText(null);
            jtaSubmit.setForeground(new Color(203, 53, 53));
            String name = jtfName.getText();
            String address = jtfAddress.getText();
            String email = jtfEmail.getText();

            if (name.isEmpty() || name.length() < 20)
                ErrorMessage(". Name should not be empty and greater than 20 chatacters.\n");

            if (address.isEmpty())
                ErrorMessage(". Address should not be empty.\n");
            
            if (!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$"))
                ErrorMessage(". Email format is invalid.\n");
                
            if (jcbCountry.getSelectedItem() == null) 
                ErrorMessage(". Country not selected.\n");
                
            if (bgStatus.getSelection() == null)
                ErrorMessage(". Please choose Marital status.\n");
            
            if (bgGender.getSelection() == null)
                ErrorMessage(". Please choose gender.\n");
            
            if (!hasError) {
                jtaSubmit.setForeground(new Color(34, 139, 34));
                jtaSubmit.append("Form has been submitted successfully.");
                ClearFields();
            }
        } else if (e.getSource() == jbClear) {
            ClearFields();
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        new SignUpForm();
    }
}