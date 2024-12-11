import java.util.ArrayList;
import java.util.List;

// OBSERVER INTERFACE
interface Observer{
    void notifySubscribers(Order order);
}

// CONCRETE OBSERVERS
class RestaurantObserver implements Observer{
    private String restaurantName;

    RestaurantObserver(String name){
        this.restaurantName = name;
    }
    @Override
    public void notifySubscribers(Order order) {
        System.out.println("Restaurant : " + restaurantName + "Order # " + order.getOrderId() + "Is Now : " + order.getOrderStatus() + ".");
    }
}

class CustomerObserver implements Observer{
    private String customerName;

    CustomerObserver(String name){
        this.customerName = name;
    }

    @Override
    public void notifySubscribers(Order order) {
        System.out.println("Hello : " + customerName + " Your order with Order #" + order.getOrderId() + "is now " + order.getOrderStatus());
    }
}

class DeliveryDriverObserver implements Observer{
    private String driverName;
    DeliveryDriverObserver(String name){
        this.driverName = name;
    }
    @Override
    public void notifySubscribers(Order order) {
        System.out.println("Driver " + driverName + ": Order #" + order.getOrderStatus() + " is now " + order.getOrderStatus() + ".");
    }
}

// SUBJECT
class Order{
    private int orderId;
    private String orderStatus;

    private List<Observer> observers = new ArrayList<>(); // subscribers

    Order(int id){
       this.orderId = id;
       this.orderStatus = "ORDER_PLACED";
    }

    public int getOrderId() {return orderId;}
    public String getOrderStatus() {return orderStatus;}

    public void setOrderStatus(String status){
        this.orderStatus = status;
        notifyObservers();
    }
    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }
    private void notifyObservers() {

        for(Observer observer : observers){
            observer.notifySubscribers(this);
        }
    }


}
public class Main {
    public static void main(String[] args) {
        Order order = new Order(123);

        RestaurantObserver restaurant = new RestaurantObserver("Restaurant");
        CustomerObserver customer = new CustomerObserver("Customer");
        DeliveryDriverObserver deliveryDriver = new DeliveryDriverObserver("Delivery_Driver");

        order.attach(restaurant);
        order.attach(customer);
        order.attach(deliveryDriver);

        order.setOrderStatus("OUT_FOR_DELIVERY");
        order.setOrderStatus("ORDER_DELIVERED");
    }
}