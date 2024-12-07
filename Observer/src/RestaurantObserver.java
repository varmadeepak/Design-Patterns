public class RestaurantObserver implements Observer {
    private String restaurantName;
    RestaurantObserver(String name){
        this.restaurantName = name;
    }


    @Override
    public void notifySubscribers(Order order) {
        System.out.println("Restaurant " + restaurantName + ": Order #" + order.getOrderId() + " is now " + order.getOrderStatus() + ".");
    }
}
