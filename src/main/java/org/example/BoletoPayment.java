package org.example;
import java.util.Random;

public class BoletoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        Random random = new Random();
        int boletoCode = random.nextInt(100000000);
        System.out.println("Pagamento de R$" + amount + " realizado via Boleto.");
        System.out.println("Código do Boleto: BOLETO" + boletoCode);
    }
}