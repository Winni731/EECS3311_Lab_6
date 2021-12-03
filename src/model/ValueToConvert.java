package model;

import java.util.ArrayList;
import java.util.List;

/**
 * abstract class extends JTextArea implements property change listener
 */
public class ValueToConvert implements Subject {
    /**
     * A List of type Observer used for keeping track of the total observers
     */
    protected List<Observer> observers = new ArrayList<>();

    /**
     * This method converts the centimeter value to meters
     * 
     * invariants: the centimeter value is always positive
     * preconditions: the centimeters is positive
     * postconditions: the converted meters value is returned
     * 
     * @param text the text that is used to convert to meters
     * @return the Double converted meter value
     */
    public String cmToMeter(String text) {
        double data = Double.parseDouble(text);
        notify(text);
        return Double.toString(data / 100);
    }

    /**
     * This method converts the centimeter value to feet
     * 
     * invariants: the centimeter value is always positive
     * preconditions: the centimeters is positive
     * postconditions: the converted feet value is returned
     * 
     * @param text the text that is used to convert to feet
     * @return the Double converted feet value
     */
    public String cmToFeet(String text) {
        double data = Double.parseDouble(text);
        notify(text);
        return Double.toString(data / 30.48);
    }

    /**
     * This method adds an observer to the observers list
     * 
     * invariants: none
     * preconditions: none
     * postconditions: the observer is added to the observers list
     */
    @Override
    public synchronized void add(Observer observer) {
        observers.add(observer);
    }

    /**
     * This method removed an observer from the observers list
     * 
     * invariants: none
     * preconditions: none
     * postconditions: the observer is removed from the observers list
     */
    @Override
    public synchronized void remove(Observer observer) {
        observers.remove(observer);
    }

    /**
     * This method notifies each observer's conversion area in the observers list
     * 
     * invariants: none
     * preconditions: none
     * postconditions: every observer in the observers list is updated with a new figure
     */
    @Override
    public void notify(String figure) {
        observers.forEach(observer -> observer.update(figure));
    }

}
