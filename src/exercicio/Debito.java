package exercicio;

import java.util.Scanner;

public class Debito {
    private double valor;

    public Debito(double valor) {
        this.valor = valor;
    }

    public void debitar(Caixa caixa) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor para debitar: ");
        double valor = scanner.nextDouble();


    }
}