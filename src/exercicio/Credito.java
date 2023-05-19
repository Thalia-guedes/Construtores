package exercicio;

import java.util.Scanner;

public class Credito {
    private double valor;

    public Credito(double valor) {

        this.valor = valor;
    }

    public void creditar(Caixa caixa) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor para créditar: ");
        double valor = scanner.nextDouble();


    }


}