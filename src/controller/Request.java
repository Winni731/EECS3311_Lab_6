package controller;

public class Request {
	
	private String centimeters, convertedValue;

	public Request(String centimeters, String convertedValue) {
		this.centimeters = centimeters;
		this.convertedValue = convertedValue;
	}

	public void read() {
		System.out.println(centimeters + " cm will be converted to " + convertedValue);
	}
	
	public void write() {
		System.out.println(convertedValue + " has been written to the model");
	}

}
