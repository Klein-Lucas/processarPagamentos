package org.example;

public class PaymentProcessor{

    private final PaymentStrategy paymentStrategy;

    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double forma) {
        paymentStrategy.processPayment(forma);
    }
}