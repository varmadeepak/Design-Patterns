// Abstract Template

abstract class AmazonOrderProcessingTemplate{
    public void processOrder(){
        verifyOrder();
        assignDeliveryAgent();
        deliveryTracking();
    }
    abstract void verifyOrder();
    abstract void assignDeliveryAgent();
    abstract void deliveryTracking();
}

// Concrete Templates
class LocalOrderProcessor extends AmazonOrderProcessingTemplate{

    @Override
    void verifyOrder() {
        System.out.println("Verified Local Order");
    }

    @Override
    void assignDeliveryAgent() {
        System.out.println("Assigned delivery partner for local order");
    }

    @Override
    void deliveryTracking() {
        System.out.println("Delivery tracking for local order");
    }
}

class InternationalOrderProcessor extends AmazonOrderProcessingTemplate{

    @Override
    void verifyOrder() {
        System.out.println("Verified International Order");
    }

    @Override
    void assignDeliveryAgent() {
        System.out.println("Assigned delivery partner for International order");
    }

    @Override
    void deliveryTracking() {
        System.out.println("Delivery tracking for International order");
    }
}
public class Main {
    public static void main(String[] args) {
        AmazonOrderProcessingTemplate localOrder =  new LocalOrderProcessor();
        localOrder.processOrder();

        AmazonOrderProcessingTemplate internationalOrder =  new InternationalOrderProcessor();
        internationalOrder.processOrder();
    }
}