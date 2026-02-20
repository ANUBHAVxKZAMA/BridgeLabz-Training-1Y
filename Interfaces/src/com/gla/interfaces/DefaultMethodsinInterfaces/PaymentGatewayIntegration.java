package com.gla.interfaces.DefaultMethodsinInterfaces;
interface PaymentProcessor {
    void processPayment(double amount);
    // Default method added later
    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " processed.");
    }
}
class Razorpay implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment of ₹" + amount + " processed via Razorpay.");
    }
    // No refund override — default will be used
}
public class PaymentGatewayIntegration {
    public static void main(String[] args) {
        PaymentProcessor payment = new Razorpay();
        payment.processPayment(1000);
        payment.refund(500);  // Uses default method
    }
}