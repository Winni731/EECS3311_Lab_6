package model;

import java.awt.Color;
import javax.swing.JTextArea;

/**
 * ConcreteObserver class that receives the updates from observable class with observer pattern
 */
public class FeetConversionArea implements Observer {

    /**
     * The permanent color used for the area
     */
    private static final Color GR = Color.green;
    /**
     * The text area used for user input
     */
    private final JTextArea textArea;
    /**
     * The Subject interface used to add this conversion area observer
     */
    protected Subject subject;

    /**
     * This is the default constructor for this class which sets up all
     * the parameters of the FeetConversionArea
     * 
     * invariants: textArea size, textArea bounds are always positive
     * preconditions: upperX, upperY, rows, and cols must be positive
     * postconditions: a new FeetConversionArea will be initialized
     * 
     * @param upperX the upper left X position
     * @param upperY the upper left Y position
     * @param rows the amount of rows
     * @param cols the amount of columns
     * @param subject the Subject interface used to add an Observer to
     */
    public FeetConversionArea(int upperX, int upperY, int rows, int cols, Subject subject) {
        super();
        textArea = new JTextArea("0 ft", rows, cols);
        textArea.setBounds(upperX, upperY, rows, cols);
        textArea.setBackground(GR);
        textArea.setEditable(false);
        textArea.setSize(240, 240);
        this.subject = subject;
        this.subject.add(this);
    }

    /**
     * This method gets and returns the JTextArea used in this conversion area
     * 
     * invariants: none
     * preconditions: none
     * postconditions: a JTextArea will be returned
     * 
     * @return the JTextArea
     */
    public JTextArea getTextArea() {
        return this.textArea;
    }

    /**
     * This method gets and returns the text inside this conversion area
     * 
     * invariants: none
     * preconditions: none
     * postconditions: a String value will be returned
     * 
     * @return the String of the text
     */
    public String getText() {
        return textArea.getSelectedText();
    }

    /**
     * This method sets the text inside this conversion area
     * 
     * invariants: none
     * preconditions: none
     * postconditions: sets the text in this conversion area
     * 
     * @param text the String value used for the text
     */
    public void SetText(String text) {
        textArea.setText(text);
    }
    
    public Subject getSubject() {
    	return this.subject;
    }

    @Override
    public void update(String figure) {
    	System.out.println("FeetConversionArea received notification from ValueToConvert, value: "+figure);
    }

}
