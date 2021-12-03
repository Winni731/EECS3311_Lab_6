package model;

import java.util.ArrayList;
import java.util.List;

/**
 * This class extends JTextArea implements property change listener
 */
public class ValueToConvert implements Subject {
    /**
     * A List of type Observer used for keeping track of the total observers
     */
    protected List<Observer> observers = new ArrayList<Observer>();; 
    
    protected MeterConversionArea meterArea;
    protected FeetConversionArea feetArea;
    
    public ValueToConvert(MeterConversionArea meterArea, FeetConversionArea feetArea) {
    	super();
    	this.meterArea = meterArea;
    	this.feetArea = feetArea;
    }
    
    public MeterConversionArea getMeterArea() {
    	return meterArea;
    }
    
    public FeetConversionArea getFeetArea() {
    	return feetArea;
    }
    
    public List<Observer> getObservers() {
    	return this.observers;
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
   //     double old_data = Double.parseDouble(getMeterArea());
        System.out.printf("\nMeterArea: %s, TextValue: %s\n", meterArea.getTextArea().getText(), text);
    //    meterArea.update(text);
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
        System.out.printf("\nFeetArea: %s, TextValue: %s\n", feetArea.getTextArea().getText(), text);
      //  System.out.print(observers.size());
     //   feetArea.update(text);
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
    	System.out.println("I am here");
    //	observers.add(feetArea);
    	System.out.println(((ValueToConvert) (meterArea.getSubject())).getObservers().size());
//    	for (int i=0; i< getObservers().size(); i++) {
//    		System.out.println("here: "+i);
//    	}
    	
    	((ValueToConvert) meterArea.getSubject()).getObservers().forEach(observer -> observer.update(figure));
     //   observers.update(figure);
    }

}
