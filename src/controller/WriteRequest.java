package controller;

public class WriteRequest implements Command {

    private Request writeRequest;

    public WriteRequest(Request writeRequest) {
        this.writeRequest = writeRequest;
    }

    @Override
    public void execute() {
        writeRequest.write();
    }
    
}
