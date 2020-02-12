package com.payam.learn.designpatterns.behavioral.memento;

import javax.swing.*;
import java.util.LinkedList;

public class JTextHistory {

    public LinkedList<JTextFieldMemento> linkedList = new LinkedList<>();
    private JTextField textField;

    public JTextHistory(JTextField jTextField) {
        this.textField = jTextField;
    }

    public void save(){
        linkedList.push(new JTextFieldMemento(textField.getText()));
        textField.setText("");
    }
    public void undo(){
        if(!linkedList.isEmpty()){
            textField.setText(linkedList.pop().getText());
        }else{
            textField.setText("");
        }
    }

}
