package model;

import javax.swing.*;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class CentimetersConversionArea implements Observer {

    private static final Color YL = Color.yellow;
    private final JTextArea textArea;
    private Subject subject;

    public CentimetersConversionArea(int upperX, int upperY, int rows, int cols, Subject subject) {
        super();
        textArea = new JTextArea("0", rows, cols);
        textArea.setBounds(upperX, upperY, rows, cols);
        textArea.setBackground(Color.yellow);
        textArea.setSize(240, 240);
        this.subject = subject;
        this.subject.add(this);
    }

    public JTextArea getTextArea() {
//        notify(this.textArea.getText());
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

    }
}
