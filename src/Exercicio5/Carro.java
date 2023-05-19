package Exercicio5;

public class Carro {
    //atributos
     String nome;
     String marca;
     String modelo;
     int portas;
     double potencia;

     //construtores

    Carro(){

    }

    // construtor com parametros
    Carro (String nome, String modelo , String marca, int portas){
        this.nome= nome;
        this.modelo = modelo;
        this.marca = marca;
        this.portas= portas;
        this.potencia= 2.0;
    }
    // metodo ligar o carro
    public void ligarCarro() {
        System.out.println("Carro ligado.");
    }
}
