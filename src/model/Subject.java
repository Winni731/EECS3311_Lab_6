package model;

/**
 * Observable interface that push the value to notify the observer using observer pattern
 */
public interface Subject {
    /**
     * This method adds the Observer object to the respective conversion area
     * 
     * invariants: none
     * preconditions: none
     * postconditions: the Observer object is added to the respective conversion area
     * 
     * @param observer the Observer object to add to the conversion area
     */
    public void add(Observer observer);

    /**
     * This method removes the Observer object from the respective conversion area
     * 
     * invariants: none
     * preconditions: none
     * postconditions: the Observer object is removed from the respective conversion area
     * 
     * @param observer the Observer object to remove from the conversion area
     */
    public void remove(Observer observer);

    /**
     * This method notifies the respective conversion area
     * 
     * invariants: none
     * preconditions: none
     * postconditions: the respective conversion area is notified of a new figure
     * 
     * @param figure the new String value the conversion area is notified of
     */
    public void notify(String figure);
}
