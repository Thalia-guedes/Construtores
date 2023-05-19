package Exercicio3;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome="Thalia";
        pessoa.idade=23;
        pessoa.peso= 55;
        pessoa.altura= 1.62;

        System.out.println(" Meu nome e " + pessoa.nome + " tenho " + pessoa.idade + " anos "
        + pessoa.peso + " kg , e tenho " + pessoa.altura + " de altura");

    }
}
