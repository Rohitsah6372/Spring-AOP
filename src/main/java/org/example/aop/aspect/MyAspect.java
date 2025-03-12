package org.example.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

    @Before("execution(* org.example.PaymentServiceImpl.makePayment())")  // Fixed the missing parenthesis
    public void printBefore() {
        System.out.println("Payment Started (This message is from Aspect)");
    }

    @After("execution(* org.example.PaymentServiceImpl.makePayment())")
    public  void printAfter(){
        System.out.println("After Payment");
    }


    @Before("execution(* org.example.PaymentServiceImpl.makePayment(..))")  // Fixed the missing parenthesis
    public void AmountBeforePayment() {
        System.out.println("Total Amount");
    }

    @After("execution(* org.example.PaymentServiceImpl.makePayment(..))")
    public  void AmountAfterPayment(){
        System.out.println("Amount Left");
    }

}
