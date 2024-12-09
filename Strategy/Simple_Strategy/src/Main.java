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

// Context

class PaymentProcessor{
    private PaymentStrategy paymentStrategy;

    PaymentProcessor(){
        this.paymentStrategy = null;
    }

    void setPaymentStrategy(PaymentStrategy strategy){
        if(paymentStrategy != null){
            paymentStrategy = null;
        }
        this.paymentStrategy = strategy;
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

        // BUILD THE STRATEGY
        PaymentStrategy cardPayment = new CardPayment();

        // SET STRATEGY
        paymentProcessor.setPaymentStrategy(cardPayment);

        // INVOKE ACTION
        paymentProcessor.processPayment(250.33f);


        // REPEAT SAME FOR OTHER STRATEGY
        PaymentStrategy upiPayment = new UPIPayment();
        paymentProcessor.setPaymentStrategy(upiPayment);
        paymentProcessor.processPayment(500f);

    }
}