package exercicios.basico;

import java.util.Scanner;

public class SomaDoisNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);



        System.out.println("----------------");
        System.out.println("Digite um numero: ");
        System.out.println("----------------");
        int numeroUm = entrada.nextInt();

        System.out.println("----------------");
        System.out.println("Digite um segundo numero: ");
        System.out.println("----------------");
        int numeroDois = entrada.nextInt();
        int soma = numeroDois + numeroUm;
        System.out.println("A soma dos numeros: " + soma);


    }

}
