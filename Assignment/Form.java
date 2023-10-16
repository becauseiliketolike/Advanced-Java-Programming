import java.awt.*;
import javax.swing.*;

public class Form {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Registration Form");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600, 400);
        jFrame.setLayout(new GridLayout(6, 1));
        
        JLabel nameJLabel = new JLabel("Name: ");
        JTextField nameTextField = new JTextField();
        nameTextField.setColumns(50);

        JLabel countryJLabel = new JLabel("Country: ");
        String[] country = {"USA", "UK", "Nepal"};
        JComboBox countryJComboBox = new JComboBox(country);

        JLabel passwordJLabel = new JLabel("Password: ");
        JPasswordField passwordJField = new JPasswordField();
        passwordJField.setColumns(50);

        JLabel genderJLabel = new JLabel("Gender: ");
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");
        ButtonGroup genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(maleButton);
        genderButtonGroup.add(femaleButton);
        
        JLabel maritalStatusJLabel = new JLabel("Marital Status: ");
        JCheckBox marriedJCheckBox = new JCheckBox("Married");
        JCheckBox unmarriedJCheckBox = new JCheckBox("Unmarried");
        JCheckBox singleJCheckBox = new JCheckBox("Single");
        ButtonGroup statusButtonGroup = new ButtonGroup();
        statusButtonGroup.add(marriedJCheckBox);
        statusButtonGroup.add(unmarriedJCheckBox);
        statusButtonGroup.add(singleJCheckBox);

        JPanel panel1 = new JPanel();
        panel1.add(nameJLabel); panel1.add(nameTextField);
        JPanel panel2 = new JPanel();
        panel2.add(passwordJLabel); panel2.add(passwordJField);
        JPanel panel3 = new JPanel();
        panel3.add(countryJLabel); panel3.add(countryJComboBox);
        JPanel panel4 = new JPanel();
        panel4.add(genderJLabel); panel4.add(maleButton); panel4.add(femaleButton);
        JPanel panel5 = new JPanel();
        panel5.add(maritalStatusJLabel); panel5.add(marriedJCheckBox); panel5.add(unmarriedJCheckBox); panel5.add(singleJCheckBox);
        JPanel panel6 = new JPanel();
        panel6.add(new JButton("Submit")); panel6.add(new JButton("Cancel"));

        jFrame.add(panel1);
        jFrame.add(panel2);
        jFrame.add(panel3);
        jFrame.add(panel4);
        jFrame.add(panel5);
        jFrame.add(panel6);
        jFrame.setVisible(true);
    }
}