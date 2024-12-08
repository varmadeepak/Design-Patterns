// Concrete Command

public class RideRequestCommand implements Command {
    private RideService receiver;
    private String passenger;
    private String sourceLocation;
    private String destinationLocation;

    RideRequestCommand(RideService receiver,String passenger,String sourceLocation,String destinationLocation){
        this.receiver  = receiver;
        this.passenger = passenger;
        this.sourceLocation = sourceLocation;
        this.destinationLocation = destinationLocation;
    }

    @Override
    public void execute() {
        receiver.requestRide(passenger,sourceLocation,destinationLocation);
    }

}
