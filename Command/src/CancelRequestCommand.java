// concrete command
public class CancelRequestCommand implements Command{
    private RideService receiver;
    private String passenger;

    CancelRequestCommand(RideService receiver,String passenger){
        this.receiver = receiver;
        this.passenger = passenger;
    }
    @Override
    public void execute() {
        receiver.cancelRide(passenger);
    }
}
