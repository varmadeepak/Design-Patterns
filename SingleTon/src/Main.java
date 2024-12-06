import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class PaymentGatewayManager{
    private PaymentGatewayManager(){
        System.out.println("Payment Gateway Manager initialized.");
    }

    private static PaymentGatewayManager instance;

    private static Lock mutexLock = new ReentrantLock();

    public static PaymentGatewayManager getInstance(){
        if(instance == null) {
            mutexLock.lock();
            try{
                if(instance == null) {
                    instance = new PaymentGatewayManager();
                }
            } finally{
                mutexLock.unlock();
            }
        }

        return instance;
    }

    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through the payment gateway.");
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentGatewayManager paymentGateway = PaymentGatewayManager.getInstance();

        paymentGateway.processPayment(100.0);

        PaymentGatewayManager anotherPaymentGateway = PaymentGatewayManager.getInstance();

        if (paymentGateway == anotherPaymentGateway) {
            System.out.println("Both instances are the same. Singleton pattern is working.");
        } else {
            System.out.println("Singleton pattern is not working correctly.");
        }


    }
}