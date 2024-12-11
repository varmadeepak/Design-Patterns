public class OrderValidationHandler extends OrderHandler{
    public OrderValidationHandler(OrderHandler nextHandler){
        super(nextHandler);
    }
    @Override
    public void processOrder(String order) {
        System.out.println("Validating Order : " + order);

        if(nextHandler != null){
            nextHandler.processOrder(order);
        }
    }
}
