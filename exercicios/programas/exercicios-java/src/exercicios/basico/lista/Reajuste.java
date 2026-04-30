package exercicios.basico.lista;

import java.util.Scanner;

public class Reajuste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor;

        System.out.println("Digite o valor que" +
                " deseja reajustar: ");
        valor = sc.nextInt();

        double reajuste = valor * 0.05;

        System.out.println("5% de "+ valor +
                " equivale a " + reajuste);
    }
}
