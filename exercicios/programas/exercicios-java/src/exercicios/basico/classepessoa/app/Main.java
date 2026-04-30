package exercicios.basico.classepessoa.app;

import exercicios.basico.classepessoa.model.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joao", 24, "01412312345");
        Pessoa p2 = new Pessoa("Maria", 23, "01412512345");

        Scanner ler = new Scanner(System.in);

        p1.listarPessoa();
        System.out.println("Digite a nova idade de == " + p1.getNome());
        int novaIdade = ler.nextInt();
        p1.alterarIdade(novaIdade);

        p1.listarPessoa();

        ler.close();
    }
}
