package controller;

public class ReadRequest implements Command {

    private Request readRequest;

    public ReadRequest(Request readRequest) {
        this.readRequest = readRequest;
    }

    @Override
    public void execute() {
        readRequest.read();
    }
    
}
