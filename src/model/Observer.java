package model;

/**
 * The Observer interface used to update each conversion area
 */
public interface Observer {
    /**
     * This method updates the respective conversion area's text
     * 
     * invariants: none
     * preconditions: none
     * postconditions: the respective conversion area's text is updated
     * 
     * @param figure the String value used to update the text area
     */
    void update(String figure);
}
