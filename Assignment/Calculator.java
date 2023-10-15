import java.awt.GridLayout;
import javax.swing.*;

public class Calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        
        frame.setLayout(new GridLayout(2, 1));
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        panel.add(new JButton("7")); 
        panel.add(new JButton("8")); 
        panel.add(new JButton("9")); 
        panel.add(new JButton("/"));
        panel.add(new JButton("4")); 
        panel.add(new JButton("5")); 
        panel.add(new JButton("6")); 
        panel.add(new JButton("*"));
        panel.add(new JButton("1")); 
        panel.add(new JButton("2")); 
        panel.add(new JButton("3")); 
        panel.add(new JButton("-"));
        panel.add(new JButton(".")); 
        panel.add(new JButton("0")); 
        panel.add(new JButton("=")); 
        panel.add(new JButton("+"));
        
        frame.add(new JLabel());
        frame.add(panel);
        frame.setVisible(true);
    }    
}
