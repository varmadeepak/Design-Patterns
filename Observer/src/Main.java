public class Main {
    public static void main(String[] args) {

        Order order = new Order(169);

        CustomerObserver customer = new CustomerObserver("Customer_1");
        RestaurantObserver restaurant = new RestaurantObserver("Restaurant_1");
        DeliveryDriverObserver driver = new DeliveryDriverObserver("ZeptoDriver");

        order.attach(customer);
        order.attach(restaurant);
        order.attach(driver);

        order.setOrderStatus("Out For Delivery");

        order.setOrderStatus("Order Delivered");
    }
}