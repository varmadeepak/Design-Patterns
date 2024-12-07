import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private String orderStatus;
    private List<Observer> observers = new ArrayList<>();

    Order(int id){
        this.orderId = id;
        this.orderStatus = "Order Placed";
    }
    public int getOrderId(){
        return orderId;
    }
    public String getOrderStatus(){
        return orderStatus;
    }
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