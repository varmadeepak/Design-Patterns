// Receiver

public class RideService {
    public void requestRide(String passenger, String srcLoc, String destLoc) {
        System.out.println("Requesting a ride for passenger: " + passenger +
                " from " + srcLoc + " to " + destLoc);
        // Additional ride request processing logic here
    }

    public void cancelRide(String passenger) {
        System.out.println("Canceling the ride for passenger: " + passenger);
        // Additional cancellation logic here
    }
}
