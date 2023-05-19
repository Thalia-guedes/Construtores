package Exercicio6;

public class Main {
    public static void main(String[] args) {
        // instanciando o metodo Quadrado
        Quadrado quadrado = new Quadrado(5.0);
        System.out.println(" o lado do quadrado e " + quadrado.retornarLado());
        System.out.println("Área do quadrado: " + quadrado.calcularArea());

        // instanciando novo lado e mudando o valor do quadrado
        quadrado.mudarLado(25.0);

        System.out.println(quadrado.retornarLado());
        System.out.println(quadrado.calcularArea());


    }
}
