abstract class OrderHandler {
    protected OrderHandler nextHandler;

    OrderHandler(OrderHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    public abstract void processOrder(String order);
}
