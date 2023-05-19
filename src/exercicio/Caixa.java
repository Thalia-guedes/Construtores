package exercicio;

public class Caixa {
    private double saldo;

    public Caixa() {

        saldo = 1000.00;
    }

    public double getSaldo() {
        return saldo;
    }

     double setsubtrairValores (double Credito, double Debito){
        saldo = Credito - Debito;
        return saldo;
    }

}