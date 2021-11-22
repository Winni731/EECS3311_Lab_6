package model;

import java.awt.Color;
import javax.swing.JTextArea;

/**
 * ConcreteObserver class that receives the updates from observable class with observer pattern
 */
public class FeetConversionArea implements Observer {
    private static final Color GR = Color.green;
    private final JTextArea textArea;
    Subject subject;

    public FeetConversionArea(int upperX, int upperY, int rows, int cols, Subject subject) {
        super();
        textArea = new JTextArea("0 ft", rows, cols);
        textArea.setBounds(upperX, upperY, rows, cols);
        textArea.setBackground(Color.green);
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
