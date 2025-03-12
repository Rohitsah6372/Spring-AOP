package org.example;

import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService{

    @Override
    public void makePayment() {

        //Some Payment Code
        System.out.println("Amount Debited");


        System.out.println("Amount Credited");
    }

    @Override
    public void accountBalance(int x) {
        System.out.println("Amount = " +x);
    }


}
