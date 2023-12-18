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
import javax.swing.*;

class SignUpForm {
    JFrame jf = new JFrame();
    JLabel jlName, jlAddress, jlCountry, jlEmail, jlMarital, jlGender, jlTerms;

    public SignUpForm() {
        jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400, 400);
        jlName = new JLabel("Name: ");
        JTextField nameTextField = new JTextField(20);
        jlAddress = new JLabel("Address: ");
        JTextField addTextField = new JTextField(20);
        jlEmail = new JLabel("Email: ");
        JTextField emailTextField = new JTextField(20);
        jlCountry = new JLabel("Country: ");
        String[] country = {"USA", "UK", "Nepal"};
        JComboBox countryJComboBox = new JComboBox(country);
        JLabel maritalStatusJLabel = new JLabel("Marital Status: ");
        JCheckBox marriedJCheckBox = new JCheckBox("Married");
        JCheckBox unmarriedJCheckBox = new JCheckBox("Unmarried");
        JCheckBox singleJCheckBox = new JCheckBox("Single");
        ButtonGroup statusButtonGroup = new ButtonGroup();
        statusButtonGroup.add(marriedJCheckBox);
        statusButtonGroup.add(unmarriedJCheckBox);
        statusButtonGroup.add(singleJCheckBox);
        JLabel genderJLabel = new JLabel("Gender: ");
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");
        ButtonGroup genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(maleButton);
        genderButtonGroup.add(femaleButton);
        JLabel TermsJLabel = new JLabel("Terms and Policy: ");
        JCheckBox acceptJCheckBox = new JCheckBox();
        JPanel panel1 = new JPanel();
        panel1.add(nameJLabel); panel1.add(nameTextField);
        JPanel panel2 = new JPanel();
        panel2.add(addJLabel); panel2.add(addTextField);
        JPanel panel3 = new JPanel();
        panel3.add(emailJLabel); panel3.add(emailTextField);
        JPanel panel4 = new JPanel();
        panel4.add(countryJLabel); panel4.add(countryJComboBox);
        JPanel panel5 = new JPanel();
        panel5.add(maritalStatusJLabel); panel5.add(marriedJCheckBox); panel5.add(unmarriedJCheckBox); panel5.add(singleJCheckBox);
        JPanel panel6 = new JPanel();
        panel6.add(genderJLabel); panel6.add(maleButton); panel6.add(femaleButton);
        JPanel panel7 = new JPanel();
        panel7.add(TermsJLabel); panel7.add(acceptJCheckBox);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 1));
        panel.add(panel1);
        panel.add(panel2);
        panel.add(panel3);
        panel.add(panel4);
        panel.add(panel5);
        panel.add(panel6);
        panel.add(panel7);
        jf.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0; gbc.gridy = 0;
        jf.add(new JLabel("SIGN UP"), gbc);
        gbc.gridy = 1;
        jf.add(panel, gbc);
        gbc.gridy = 2;
        jf.add(jbSignUp, gbc);
        jf.setVisible(true);
    }
}

public class Q1 {
    public static void main(String[] args) {
        new SignUpForm();
    }
}