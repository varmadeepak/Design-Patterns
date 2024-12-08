public class PaymentProcessorHandler extends OrderHandler{

    public PaymentProcessorHandler(OrderHandler nextHandler){
        super(nextHandler);
    }

    @Override
    public void processOrder(String order) {
        System.out.println("Processing the payment for order : " + order);

        if(nextHandler != null){
            nextHandler.processOrder(order);
        }
    }
}
