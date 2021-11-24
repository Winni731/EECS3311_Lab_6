package model;

import javax.swing.*;
import java.awt.Color;

/**
 * ConcreteObserver class that receives the updates from observable class with observer pattern
 */
public class MeterConversionArea implements Observer {
    private static final Color og = Color.orange;
    private JTextArea textArea;
    private Subject subject;

    public MeterConversionArea(int upperX, int upperY, int rows, int cols, Subject subject) {
        super();
        textArea = new JTextArea("0 m", rows, cols);
        textArea.setBounds(upperX, upperY, rows, cols);
        textArea.setBackground(Color.orange);
        textArea.setEditable(false);
        textArea.setSize(240, 240);
        this.subject = subject;
        this.subject.add(this);
    }

    public JTextArea getTextArea() {
        return this.textArea;
    }

    public String getText() {
        return textArea.getSelectedText();
    }

    public void SetText(String text) {
        textArea.setText(text);
    }

    @Override
    public void update(String figure) {
        // TODO Auto-generated method stub

    }

}
