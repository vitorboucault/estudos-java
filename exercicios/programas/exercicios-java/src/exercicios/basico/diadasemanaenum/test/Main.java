package exercicios.basico.diadasemanaenum.test;

import exercicios.basico.diadasemanaenum.model.DiaDaSemana;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String opcao;
        do {
            System.out.println("\n====Programa Semana===");
            System.out.println("Qual o dia da semana? ");
            System.out.println("Digite SAIR para sair");
            opcao = ler.next();
            try{
                DiaDaSemana entrada = DiaDaSemana.valueOf(opcao.toUpperCase());
                switch(entrada){
                    case SEGUNDA, TERCA, QUARTA,
                         QUINTA, SEXTA:
                        System.out.println("Dia util"); break;
                    case SABADO, DOMINGO:
                        System.out.println("Fim de semana");
                        break;
                }
            }catch(IllegalArgumentException e){
                System.out.println("Opcao invalida");
            }
        } while (!opcao.equalsIgnoreCase("SAIR"));
    }
}
