package Bancario;
import java.util.Collections;
import java.util.Scanner;


public class BankingSystem {
    public static void main(String[] args) {
    Scanner reading = new Scanner(System.in);
    Card card = new Card();

        System.out.println("O limite do seu cartão é de " + card.getLimit() + " reais.");

        int exit = 1;
        while (exit != 0) {
            System.out.println("Digite a descrição da compra: ");
            String description = reading.next();

            System.out.println("Digite o valor da compra: ");
            double value = reading.nextDouble();

            Shopping shoppings = new Shopping(description, value);
            boolean purchaseCompleted = card.launchPurchase(shoppings);

            if (purchaseCompleted) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para cadastrar outra compra: ");
                exit = reading.nextInt();
            } else {
                System.out.println("saldo insuficiente!");
                exit = 0;
            }
        }

        System.out.println("\n*************************");
        System.out.println("COMPRAS REALIZADAS: ");
        Collections.sort(card.getShoppings());
        for (Shopping c : card.getShoppings()) {
            System.out.println(c.getDescription() + " - " + c.getValue());
        }
        System.out.println("*************************");
        System.out.println("\nLimite atual do cartão: " + card.getCurrentLimit());

    }


}
