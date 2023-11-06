import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Converter implements ActionListener {
    JFrame myFrame;
    JButton btn;
    JTextField word, result;

    Converter() {
        myFrame = new JFrame("Converter");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(new FlowLayout());
        word = new JTextField(20);
        result = new JTextField(20);
        btn = new JButton("Convert");
        btn.addActionListener(this);
        myFrame.add(word);
        myFrame.add(btn);
        myFrame.add(result);
        myFrame.setSize(600, 400);
        myFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String w = String.valueOf(word.getText());
        result.setText(String.valueOf(w.toUpperCase()));
    }

    public static void main(String[] args) {
        new Converter();
    }
}
