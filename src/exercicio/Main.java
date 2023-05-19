package exercicio;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Caixa caixa = new Caixa();

            System.out.println("Saldo inicial: R$" + caixa.getSaldo());



            Debito debito1 = new Debito(-1000);
            debito1.debitar(caixa);

            Credito credito1 = new Credito(-1000);
            credito1.creditar(caixa);


            System.out.println("Saldo final: R$" + caixa.getSaldo());
        }

    }
    // Nao coneguir fazer a operacao para subtrair, td jeito que tendetei deu erro.


