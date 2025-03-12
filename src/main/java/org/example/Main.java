package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");

        PaymentService paymentObject = context.getBean("payment",  PaymentService.class);

        //Authentication

        paymentObject.makePayment();
        paymentObject.accountBalance(123);

    }
}