// Q.1 Design the notepad frame with exact menus and scrolling features.

import java.awt.*;
import javax.swing.*;

class Notepad {
    JFrame f = new JFrame("Notepad");
    JMenuBar mb = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenu edit = new JMenu("Edit");
    JMenu view = new JMenu("View");
    JMenuItem newTab = new JMenuItem("New");
    JMenuItem open = new JMenuItem("Open");
    JMenuItem save = new JMenuItem("Save");
    JMenuItem saveAs = new JMenuItem("Save As");
    JMenuItem undo = new JMenuItem("Undo");
    JMenuItem cut = new JMenuItem("Cut");
    JMenuItem copy = new JMenuItem("Copy");
    JMenuItem paste = new JMenuItem("Paste");
    JMenuItem delete = new JMenuItem("Delete");
    JMenuItem zoom = new JMenuItem("Zoom");
    JMenuItem statusBar = new JMenuItem("Status Bar");
    JMenuItem wordWrap = new JMenuItem("Word Wrap");
    JTextField textField = new JTextField();

    public Notepad() {
        
        file.add(newTab); file.add(open); file.add(save); file.add(saveAs);
        edit.add(undo); edit.add(cut); edit.add(copy); edit.add(paste); edit.add(delete);
        view.add(zoom); view.add(statusBar); view.add(wordWrap);
        
        mb.add(file); mb.add(edit); mb.add(view);
        
        f.setJMenuBar(mb);
        
        f.setSize(400, 400);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

public class Q1 {
    public static void main(String[] args) {
        new Notepad();
    }
}