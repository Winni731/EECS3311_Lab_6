package controller;

/**
 * This class manages the write request operation using the Command interface
 */
public class WriteRequest implements Command {
    /**
     * The Request object for writing
     */
    private Request writeRequest;

    /**
     * This is the default constructor which initializes the writeRequest object
     * 
     * invariants: none
     * preconditions: none
     * postconditions: the writeRequest object is initialized
     * 
     * @param writeRequest the write action request
     */
    public WriteRequest(Request writeRequest) {
        this.writeRequest = writeRequest;
    }

    /**
     * This method executes the write operation
     * 
     * invariants: none
     * preconditions: none
     * postconditions: calls the write method of the request
     */
    @Override
    public void execute() {
        writeRequest.write();
    }
    
}
