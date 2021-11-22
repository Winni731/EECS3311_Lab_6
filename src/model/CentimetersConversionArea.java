package model;

import javax.swing.*;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class CentimetersConversionArea implements Subject {

    private static final Color YL = Color.yellow;
    private JTextArea textArea;
    protected List<Observer> observers = new ArrayList<>();

    public CentimetersConversionArea(int upperX, int upperY, int rows, int cols) {
        super();
        textArea = new JTextArea("0", rows, cols);
        textArea.setBounds(upperX, upperY, rows, cols);
        textArea.setBackground(Color.yellow);
        textArea.setSize(240, 240);
    }

    public JTextArea getTextArea() {
        notify(this.textArea.getText());
        return this.textArea;
    }

    public String getText() {
        return textArea.getSelectedText();
    }

    public void SetText(String text) {
        textArea.setText(text);
    }

    @Override
    public synchronized void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public synchronized void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(String figure) {
        observers.forEach(observer -> observer.update(figure));
    }
}
