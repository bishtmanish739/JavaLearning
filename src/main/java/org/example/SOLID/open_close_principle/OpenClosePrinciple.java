package org.example.SOLID.open_close_principle;

import org.example.SOLID.open_close_principle.bad_code.BadPaymentProcess;
import org.example.SOLID.open_close_principle.good_code.CreditCard;
import org.example.SOLID.open_close_principle.good_code.IPaymentProcessor;
import org.example.SOLID.open_close_principle.good_code.PaymentProcessor;

public class OpenClosePrinciple {
    public static void main(String[] args) throws Exception {
        //definition : every software component should be open for extension but close for modification
        BadPaymentProcess badPaymentProcess=new BadPaymentProcess();
        badPaymentProcess.processPayment(4,"upi");

        //Good way

        IPaymentProcessor iPaymentProcessor=new CreditCard();
        PaymentProcessor paymentProcessor=new PaymentProcessor(iPaymentProcessor);
        paymentProcessor.processPayment(15);
    }
}
