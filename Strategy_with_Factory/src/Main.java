// Strategy Interface

interface PaymentStrategy {
    void processPayment(double price);
}

// Concrete Strategies

class CardPayment implements PaymentStrategy {

    @Override
    public void processPayment(double price) {
        System.out.println("Card Payment for price : " + price);
    }
}

class UPIPayment implements PaymentStrategy {

    @Override
    public void processPayment(double price) {
        System.out.println("UPI Payment for price : " + price);
    }
}

// Factory class to create the strategy ka object

class PaymentStrategyFactory {
    public static PaymentStrategy createPaymentStrategy(String paymentStrategy){
        if(paymentStrategy.equalsIgnoreCase("Card")){
            return  new CardPayment();
        }
        else if(paymentStrategy.equalsIgnoreCase("UPI")){
            return new UPIPayment();
        }
        // DEFAULT PAYMENT => UPI
        return new UPIPayment();
    }
}

// Context

class PaymentProcessor{
    private PaymentStrategy paymentStrategy;

    PaymentProcessor(){
        this.paymentStrategy = null;
    }

    void setPaymentStrategy(String strategy){
        if(paymentStrategy != null){
            paymentStrategy = null;
        }
        paymentStrategy = PaymentStrategyFactory.createPaymentStrategy(strategy);
    }

    public void processPayment(double amount){
        if(paymentStrategy != null){
            paymentStrategy.processPayment(amount);
        }
        else{
            System.out.println("INVALID_PAYMENT_STRATEGY");
        }
    }
}
public class Main {
    public static void main(String[] args) {

        // BUILD THE CONTEXT
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        // SET THE STRATEGY => UPI
        paymentProcessor.setPaymentStrategy("upi");
        paymentProcessor.processPayment(100f);

        // SET THE STRATEGY => CARD
        paymentProcessor.setPaymentStrategy("card");
        paymentProcessor.processPayment(200f);


        // SET THE STRATEGY => NULL
        paymentProcessor.setPaymentStrategy("");
        paymentProcessor.processPayment(200f);

    }
}