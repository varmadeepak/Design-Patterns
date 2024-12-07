public class DeliveryDriverObserver implements Observer{
    private String driverName;
    DeliveryDriverObserver(String name){
        this.driverName = name;
    }
    @Override
    public void notifySubscribers(Order order) {
        System.out.println("Driver " + driverName + ": Order #" + order.getOrderStatus() + " is now " + order.getOrderStatus() + ".");
    }
}
