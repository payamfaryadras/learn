package com.payam.learn.designpatterns.behavioral.memento;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainPanel extends JPanel {
    private JLabel jLabel;
    private JTextField jTextField;
    private JButton jButton;
    private JTextHistory jTextHistory;

    public MainPanel() {
        jLabel = new JLabel("Enter Your Name");
        jTextField = new JTextField(20);
        jButton = new JButton("Save!");
        jTextHistory = new JTextHistory(jTextField);
        setLayout(new FlowLayout());
        add(jLabel);
        add(jTextField);
        add(jButton);
        jButton.addActionListener(event -> jTextHistory.save());
        jTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if ((e.getKeyCode() == KeyEvent.VK_Z)
                        && ((e.getModifiers() & KeyEvent.CTRL_MASK) != 0)) {
                    jTextHistory.undo();
                }
            }

        });
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Memento Design Pattern");
        jFrame.setSize(800, 200);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jFrame.add(new MainPanel());

        jFrame.setVisible(true);
    }
}
