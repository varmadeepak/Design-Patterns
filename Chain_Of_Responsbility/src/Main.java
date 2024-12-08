public class Main {
    public static void main(String[] args) {
        String order = "Kaju Paneer";
        OrderHandler orderProcessing = new OrderValidationHandler(
                new PaymentProcessorHandler(
                        new OrderPreparationHandler(
                                new DeliveryAssignmentHandler(
                                        new OrderPreparationHandler(null)
                                )
                        )
                )
        );

        orderProcessing.processOrder(order);
    }
}