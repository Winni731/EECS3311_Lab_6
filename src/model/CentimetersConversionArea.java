package model;

import javax.swing.*;
import java.awt.Color;

/**
 * This class represents the yellow centimeters conversion box. This is the area where the user
 * enters the amount of centimeters to convert to feet and meters. It makes use of the Observer
 * interface which deals with the conversion of the values.
 */
public class CentimetersConversionArea implements Observer {

    /**
     * The permanent color used for the area
     */
    private static final Color YL = Color.yellow;
    /**
     * The text area used for user input
     */
    private final JTextArea textArea;
    /**
     * The Subject interface used to add this conversion area observer
     */
    private Subject subject;

    /**
     * This is the default constructor for this class which sets up all
     * the parameters of the CentimetersConversionArea
     * 
     * invariants: textArea size, textArea bounds are always positive
     * preconditions: upperX, upperY, rows, and cols must be positive
     * postconditions: a new CentimetersConversionArea will be initialized
     * 
     * @param upperX the upper left X position
     * @param upperY the upper left Y position
     * @param rows the amount of rows
     * @param cols the amount of columns
     * @param subject the Subject interface used to add an Observer to
     */
    public CentimetersConversionArea(int upperX, int upperY, int rows, int cols, Subject subject) {
        super();
        textArea = new JTextArea("0", rows, cols);
        textArea.setBounds(upperX, upperY, rows, cols);
        textArea.setBackground(YL);
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

    @Override
    public void update(String figure) {
    	System.out.printf("'%s' received notification from figure: '%s'", figure);
    }
}
