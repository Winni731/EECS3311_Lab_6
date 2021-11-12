package controller;

public class Invoker {
	
	InterfaceCommand update;
	
	public Invoker(InterfaceCommand update) {
		this.update = update;
	}
	
	public void clickUpdate(){
		this.update.execute();
	}

}
