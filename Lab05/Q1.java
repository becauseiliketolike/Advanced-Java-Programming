// Q.1 Design the notepad frame with exact menus and scrolling features.

import java.awt.*;
import javax.swing.*;

class Notepad {
    public Notepad() {
        JFrame f = new JFrame("Notepad");
        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu view = new JMenu("View");
        
        file.add(new JMenuItem("New"));
        file.add(new JMenuItem("Open"));
        file.add(new JMenuItem("Save"));
        file.add(new JMenuItem("Save As"));
        
        edit.add(new JMenuItem("Undo")); 
        edit.add(new JMenuItem("Cut")); 
        edit.add(new JMenuItem("Copy")); 
        edit.add(new JMenuItem("Paste")); 
        edit.add(new JMenuItem("Delete"));
        
        view.add(new JMenuItem("Zoom")); 
        view.add(new JMenuItem("Status Bar")); 
        view.add(new JMenuItem("Word Wrap"));
        
        mb.add(file); mb.add(edit); mb.add(view);
        
        f.setJMenuBar(mb);
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        f.add(scrollPane, BorderLayout.CENTER);

        f.setSize(800, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

public class Q1 {
    public static void main(String[] args) {
        new Notepad();
    }
}