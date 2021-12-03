package controller;

/**
 * This class is used to call the execute method in the read and write
 */
public class Invoker {
	/**
	 * The Command interface used for updating the respective read/write in each conversion area
	 */
	private Command update;
	
	/**
	 * This is the default constructor which initializes the update type of read/write
	 * 
	 * invariants: none
	 * preconditions: none
	 * postconditions: the update interface is initialized with the provided update
	 * 
	 * @param update the provided update interface
	 */
	public Invoker(Command update) {
		this.update = update;
	}
	
	/**
	 * This method executes the provided updates read/write via the MenubarListener
	 * 
	 * invariants: none
	 * preconditions: none
	 * postconditions: the read/write for the update is executed
	 */
	public void clickUpdate(){
		update.execute();
	}

}
