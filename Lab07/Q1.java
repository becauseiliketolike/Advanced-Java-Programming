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
    JLabel jlName, jlAddress, jlCountry, jlEmail, jlMarital, jlGender, jlTerms;
    JTextField jtfName, jtfAddress, jtfEmail, jtfMarital, jtfGender, jtfTerms;
    JComboBox jcbCountry;
    JCheckBox jcbMarried, jcbUnmarried, jcbSingle, jcbAccept;
    ButtonGroup bgStatus, bgGender;
    JRadioButton jrbMale, jrbFemale;

    public SignUpForm() {
        jf = new JFrame("Sign Up Form");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400, 400);
        
        jf.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        jlName = new JLabel("Name: ");
        jtfName = new JTextField(20);
        jtfName.addActionListener(this);
        
        jlAddress = new JLabel("Address: ");
        jtfAddress = new JTextField(20);
        jtfAddress.addActionListener(this);
        
        jlEmail = new JLabel("Email: ");
        jtfEmail = new JTextField(20);
        jlCountry = new JLabel("Country: ");
        String[] country = {"USA", "UK", "Nepal"};
        jcbCountry = new JComboBox(country);
        jcbCountry.addActionListener(this);
        
        jlMarital = new JLabel("Marital Status: ");
        jcbMarried = new JCheckBox("Married");
        jcbMarried.addActionListener(this);
        jcbUnmarried = new JCheckBox("Unmarried");
        jcbUnmarried.addActionListener(this);
        jcbSingle = new JCheckBox("Single");
        jcbSingle.addActionListener(this);
        bgStatus = new ButtonGroup();
        bgStatus.add(jcbMarried);
        bgStatus.add(jcbUnmarried);
        bgStatus.add(jcbSingle);

        jlGender = new JLabel("Gender: ");      
        jrbMale = new JRadioButton("Male");
        jrbMale.addActionListener(this);
        jrbFemale = new JRadioButton("Female");
        jrbFemale.addActionListener(this);
        bgGender = new ButtonGroup();
        bgGender.add(jrbMale);
        bgGender.add(jrbFemale);

        jlTerms = new JLabel("Terms and Policy: ");
        jcbAccept = new JCheckBox();

        jf.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        //
    }
}

public class Q1 {
    public static void main(String[] args) {
        new SignUpForm();
    }
}