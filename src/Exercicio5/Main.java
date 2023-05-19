package Exercicio5;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.ligarCarro();
        // construtor parametros

        carro1.nome="Creta";
        carro1.portas= 4;
        carro1.marca= "Hyundai";
        carro1.modelo="Suv";
        carro1.potencia= 2.0;

        System.out.println("Oie Carol, esse é meu carro " + carro1.nome+
                " Quantidade de portas " + "  " +carro1.portas + " " + carro1.marca + "" +
                " " + carro1.modelo + " " + carro1.potencia);

    }

}
