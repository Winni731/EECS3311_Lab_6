package model;

import java.util.ArrayList;
import java.util.List;

/**
 * This class implements Subject interface that represents a handler for observers in the observer pattern
 */
public class ValueToConvert implements Subject {
    /**
     * A List of type Observer used for keeping track of the total observers
     */
    protected List<Observer> observers = new ArrayList<Observer>();; 
    /**
     * the MeterConversionArea observer object
     */
    protected MeterConversionArea meterArea;
    /**
     * the FeetConversionArea observer object
     */
    protected FeetConversionArea feetArea;
    
    /**
     * This is the constructor that contains MeterConversionArea and FeetConversionArea as followers
     * 
     * invariants: none
     * preconditions: none
     * postconditions: instantiates a ValueToConvert handler object
     * 
     * @param meterArea the MeterConversionArea observer object
     * @param feetArea the FeetConversionArea observer object
     */
    public ValueToConvert(MeterConversionArea meterArea, FeetConversionArea feetArea) {
    	super();
    	this.meterArea = meterArea;
    	this.feetArea = feetArea;
    }
    
    /**
     * This is the getter method that gets the MeterConversionArea
     * 
     * invariants: none
     * preconditions: none
     * postconditions: gets the MeterConversionArea
     * 
     * @return the MeterConversionArea
     */
    public MeterConversionArea getMeterArea() {
    	return meterArea;
    }
    
    /**
     * This is the getter method that gets the FeetConversionArea
     * 
     * invariants: none
     * preconditions: none
     * postconditions: gets the FeetConversionArea
     * 
     * @return the FeetConversionArea
     */
    public FeetConversionArea getFeetArea() {
    	return feetArea;
    }
    
    /**
     * This is the getter method that gets the observer list
     * 
     * invariants: none
     * preconditions: none
     * postconditions: gets the observer list
     * 
     * @return the observer list
     */
    public List<Observer> getObservers() {
    	return this.observers;
    }
    
    /**
     * This method does the notify action
     * 
     * invariants: none
     * preconditions: none
     * postconditions: notify followers for state updates
     * 
     * @param figure the TextValue that needs to be notified to followers
     */
    public void tweet(String figure) {
    	notify(figure);
    }   

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
        System.out.printf("\nMeterArea Original Value: %s, TextValue Received: %s\n", meterArea.getTextArea().getText(), text);
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
        System.out.printf("\nFeetArea Original Value: %s, TextValue Received: %s\n", feetArea.getTextArea().getText(), text);
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
        this.observers.add(observer);
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
        this.observers.remove(observer);
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
    	((ValueToConvert) meterArea.getSubject()).getObservers().forEach(observer -> observer.update(figure));
    }

}
