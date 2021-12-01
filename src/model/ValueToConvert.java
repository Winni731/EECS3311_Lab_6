package model;

import java.util.ArrayList;
import java.util.List;

/**
 * abstract class extends JTextArea implements property change listener
 */
public class ValueToConvert implements Subject {
    protected List<Observer> observers = new ArrayList<>();

    public String cmToMeter(String text) {
        double data = Double.parseDouble(text);
        notify(text);
        return Double.toString(data / 100);
    }

    public String cmToFeet(String text) {
        double data = Double.parseDouble(text);
        notify(text);
        return Double.toString(data / 30.48);
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
        observers.forEach(observer -> observer.update(figure));
    }

}
