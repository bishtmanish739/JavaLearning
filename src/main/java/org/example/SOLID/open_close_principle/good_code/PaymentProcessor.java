package org.example.SOLID.open_close_principle.good_code;

public class PaymentProcessor implements IPaymentProcessor{

    IPaymentProcessor iPaymentProcessor;
    public PaymentProcessor(IPaymentProcessor iPaymentProcessor){
        this.iPaymentProcessor=iPaymentProcessor;
    }


    @Override
    public void processPayment(int price) {
        this.iPaymentProcessor.processPayment(price);

    }
}
