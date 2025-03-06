package org.example;
import java.util.Random;

public class PixPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        Random random = new Random();
        int code = random.nextInt(1000000); // gera um código aleatório
        System.out.println("Pagamento de R$" + amount + " realizado via PIX.");
        System.out.println("Código PIX: " + code);
    }
}