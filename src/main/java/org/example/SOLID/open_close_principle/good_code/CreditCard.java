package org.example.SOLID.open_close_principle.good_code;

public class CreditCard implements IPaymentProcessor{
    @Override
    public void processPayment(int price) {
        System.out.printf("processing %s rupee via Credit Card",price);
    }
}
