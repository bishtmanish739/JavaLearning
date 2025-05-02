package org.example.SOLID.open_close_principle.bad_code;

public class BadPaymentProcess {
    public void processPayment(int price, String method) throws Exception {


        if(method=="credit card"){
            System.out.printf("processing %s rupee with %s",price,method);
        }
        else if(method=="upi"){
            System.out.printf("processing %s rupee with %s",price,method);
        }
        else {
            throw  new Exception("Payment not supported");
        }
        System.out.println("Bad way to process payment ");

    }

}
