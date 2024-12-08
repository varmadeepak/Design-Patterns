class DeliveryAssignmentHandler extends OrderHandler {
    public DeliveryAssignmentHandler(OrderHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void processOrder(String order) {
        System.out.println("Assigning delivery for order: " + order);
        // Perform delivery assignment logic here

        // If delivery is assigned, pass it to the next handler
        if (nextHandler != null) {
            nextHandler.processOrder(order);
        }
    }
}