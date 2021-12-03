package controller;

/**
 * This interface defines the execute method which is used in the ReadRequest and
 * WriteRequest classes to output a message regarding the states of the model
 */
public interface Command {
	/**
	 * This method reads or writes values in the conversion areas
	 * 
	 * invariants: none
	 * preconditions: none
	 * postconditions: the conversion area is read from or written to
	 */
	public void execute();
}
