package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int esc;
        double amount;
        PaymentStrategy forma = null;

        do {
            System.out.println("/n=== SELECIONA UMA FORMA DE PAGAMENTO ===/n");
            System.out.println("1. Pagamento por BOLETO");
            System.out.println("2. Pagamento por CARTAO DE CREDITO");
            System.out.println("3. Pagamento por PIX");
            System.out.println("0. Para sair");
            System.out.println("Opção: ");
            Scanner scanner = new Scanner(System.in);
            esc = scanner.nextInt();

            System.out.print("Digite o valor da transação: ");
            amount = scanner.nextDouble();


            if(esc == 1){
                System.out.println("Pagamento BOLETO selecionado");
                forma = new BoletoPayment();
            }else if(esc == 2){
                System.out.println("Pagamento CARTAO DE CREDITO selecionado");
                forma = new CreditCardPayment();
            } else if(esc == 3){
                System.out.println("Pagamento PIX selecionado");
                forma = new PixPayment();
            } else if (esc == 0){
                return;
            } else {
                System.out.println("Esolha incorreta, selecione outra opção");
            }

            PaymentProcessor pagamento = new PaymentProcessor(forma);
            pagamento.executePayment(amount);

        } while (esc != 0);


    }
}