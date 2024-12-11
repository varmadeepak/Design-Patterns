// Invoker
public class RideRequestInvoker {
    public void processRequest(Command command){
        command.execute();
    }
}
