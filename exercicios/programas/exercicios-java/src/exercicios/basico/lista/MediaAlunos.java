package exercicios.basico.lista;

import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Digite um valor: ");
        double valor = input.nextDouble();

        int opcao;
        do {
            System.out.println("Escolha a forma de pagamento");
            System.out.println("1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto");
            System.out.println("2 - À Vista no cartão de crédito, recebe 10% de desconto");
            System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
            System.out.println("4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
            System.out.println("0 - Para sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    valor = valor * 0.10;
                    System.out.println("Valor de pagamento: " + valor);
                    break;
                case 2:
                    valor = valor * 0.15;
                    System.out.println("Valor de pagamento: " + valor);
                    break;
                case 3:
                    System.out.println("Valor de pagamento: " + valor);
                    break;
                case 4:
                    valor = valor + 0.15;
                    System.out.println("Valor de pagamento: " + valor);
                    break;
                default:
                    System.out.println("Programa encerrado");
            }
        } while (opcao != 0);
    }
}
