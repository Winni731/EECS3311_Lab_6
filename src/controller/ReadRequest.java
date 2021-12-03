package controller;

/**
 * This class manages the read request operation using the Command interface
 */
public class ReadRequest implements Command {
    /**
     * The Request object for reading
     */
    private Request readRequest;

    /**
     * This is the default constructor which initializes the readRequest object
     * 
     * invarants: none
     * preconditions: none
     * postconditions: the readRequest object is initialized
     * 
     * @param readRequest
     */
    public ReadRequest(Request readRequest) {
        this.readRequest = readRequest;
    }

    /**
     * This method executes the read operation
     * 
     * invariants: none
     * preconditions: none
     * postconditions: calls the read method of the request
     */
    @Override
    public void execute() {
        readRequest.read();
    }
    
}
