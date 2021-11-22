package model;

/**
 * Observable interface that push the value to notify the observer using observer pattern
 */
public interface Subject {

    public void add(Observer observer);

    public void remove(Observer observer);

    public void notify(String figure);

}
