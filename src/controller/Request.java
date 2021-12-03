package controller;

/**
 * This class defines the read and write operations for a read/write request
 */
public class Request {
	/**
	 * The centimeters and converted centimeter value String objects
	 */
	private String centimeters, convertedValue;

	/**
	 * This is the default constructor which initializes the centimeters and
	 * convertedValue String objects
	 * 
	 * invariants: the centimeters and its converted value is always positive
	 * preconditions: none
	 * postconditions: the centimeters and convertedValue objects are initialized
	 * 
	 * @param centimeters the centimeter value String object
	 * @param convertedValue the converted value String object
	 */
	public Request(String centimeters, String convertedValue) {
		this.centimeters = centimeters;
		this.convertedValue = convertedValue;
	}

	/**
	 * This method outputs the read status of the current request
	 * 
	 * invariants: none
	 * preconditions: none
	 * postconditions: the status of the read request is output to the console
	 */
	public void read() {
		System.out.println(centimeters + " cm will be converted to " + convertedValue);
	}
	
	/**
	 * This method outputs the write status of the current request
	 * 
	 * invariants: none
	 * preconditions: none
	 * postconditions: the status of the write request is output to the console
	 */
	public void write() {
		System.out.println(convertedValue + " has been written to the model");
	}

}
