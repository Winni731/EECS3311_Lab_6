package controller;

public class Invoker {
	
	Command update;
	
	public Invoker(Command update) {
		this.update = update;
	}
	
	public void clickUpdate(){
		this.update.execute();
	}

}
