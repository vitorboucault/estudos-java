package javacore.gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-----Digite o nome do jogador---- ");
        String jogador = input.nextLine();
        System.out.println(jogador);

    }
}
