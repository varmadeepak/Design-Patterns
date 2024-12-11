public class CustomerObserver implements Observer{
    private String customerName;
    CustomerObserver(String name){
        this.customerName = name;
    }
    @Override
    public void notifySubscribers(Order order) {
        System.out.println("Hello, " + customerName + "! Order #" + order.getOrderId() + " is now " + order.getOrderStatus() + ".");
    }
}
