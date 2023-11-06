import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SumListener implements ActionListener {
    JFrame myFrame;
    JButton btn;
    JTextField num1, num2;
    JLabel result;

    SumListener() {
        myFrame = new JFrame("Sum");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(new FlowLayout());
        num1 = new JTextField(20);
        num2 = new JTextField(20);
        result = new JLabel();
        btn = new JButton("Sum");
        btn.addActionListener(this);
        myFrame.add(num1);
        myFrame.add(num2);
        myFrame.add(btn);
        myFrame.add(result);
        myFrame.setSize(600, 400);
        myFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        int n1 = Integer.valueOf(num1.getText());
        int n2 = Integer.valueOf(num2.getText());
        int sum = n1 + n2;
        result.setText((String.valueOf(sum)));
    }

    public static void main(String[] args) {
        new SumListener();
    }
}
