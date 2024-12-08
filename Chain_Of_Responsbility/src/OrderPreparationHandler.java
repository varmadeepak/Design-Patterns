public class OrderPreparationHandler extends OrderHandler{
    public OrderPreparationHandler(OrderHandler nextHandler){
        super(nextHandler);
    }
    @Override
    public void processOrder(String order) {
        System.out.println("Preparing the order : " + order);

        if(nextHandler != null){
            nextHandler.processOrder(order);
        }
    }
}
