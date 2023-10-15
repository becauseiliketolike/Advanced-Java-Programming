import javax.swing.*;

public class Form {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Registration Form");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600, 600);
        
        // Name
        JLabel nameJLabel = new JLabel("Name: ");
        JTextField nameTextField = new JTextField();
        nameTextField.setColumns(50);

        // Country
        JLabel countryJLabel = new JLabel("Country: ");
        String[] country = {"USA", "UK", "Nepal"};
        JComboBox countryJComboBox = new JComboBox(country);

        // Password
        JLabel passwordJLabel = new JLabel("Password: ");
        JPasswordField passwordJField = new JPasswordField();
        passwordJField.setColumns(50);

        // Gender
        JLabel genderJLabel = new JLabel("Gender: ");
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");
        ButtonGroup genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(maleButton);
        genderButtonGroup.add(femaleButton);
        
        // Marital Status
        JLabel maritalStatusJLabel = new JLabel("Marital Status: ");
        JCheckBox marriedJCheckBox = new JCheckBox("Married");
        JCheckBox unmarriedJCheckBox = new JCheckBox("Unmarried");
        JCheckBox singleJCheckBox = new JCheckBox("Single");
        ButtonGroup statusButtonGroup = new ButtonGroup();
        statusButtonGroup.add(marriedJCheckBox);
        statusButtonGroup.add(unmarriedJCheckBox);
        statusButtonGroup.add(singleJCheckBox);

        // Grid Layout
        
        
        // jFrame.add();
        jFrame.setVisible(true);
    }
}