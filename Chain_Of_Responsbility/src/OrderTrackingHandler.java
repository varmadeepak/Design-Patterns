class OrderTrackingHandler extends OrderHandler {
    public OrderTrackingHandler(OrderHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void processOrder(String order) {
        System.out.println("Tracking order: " + order);
        // Perform order tracking logic here
    }
}