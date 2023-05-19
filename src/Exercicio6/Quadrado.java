package Exercicio6;

public class Quadrado {
    //declarar o atributo lado

    private double lado;

    // criar metodo mudar valor, retornar valor do lado

    // construtor inicial recebendo o valor de lado
    public Quadrado(double lado){
        this.lado=lado;

    }
    //mudar de lado permite que eu possa alterar o valor
    // do lado e atribuir um novo valor a ele
    public void mudarLado(double mudarLado){
        this.lado = mudarLado;

    }
    // retorna o valor do lado atual
    public double retornarLado(){
        return lado;

    }
    // calcula a area do quadrado e multiplica
    //o lado por ele mesmo
    public double calcularArea(){
        return lado * lado;

    }
}
