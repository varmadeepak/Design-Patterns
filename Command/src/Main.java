public class Main {
    public static void main(String[] args) {

        // Creating a receiver
        RideService rideService = new RideService();

        // Creating an invoker
        RideRequestInvoker rideRequestInvoker = new RideRequestInvoker();

        // Preparing required commands
        Command command1 = new RideRequestCommand(rideService,"Deepak","Source","Destination");
        Command command2 = new CancelRequestCommand(rideService,"Deepak");

        // Process request and cancellation
        rideRequestInvoker.processRequest(command1);
        rideRequestInvoker.processRequest(command2);

    }
}