package exercicios.basico.revisao;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = entrada.next();
        System.out.println("Qual a sua idade?");
        int idade = entrada.nextInt();
        System.out.println("Olá " + nome + " você tem " + idade + " anos");

    }

}
