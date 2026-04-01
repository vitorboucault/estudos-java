package exercicios.basico.revisao;

import java.util.Scanner;

public class ProgramaTresSomas {
    public static void main(String[] args) {
        System.out.println("Conta A, digite um numero:");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        System.out.println(contaUm(numero));
        System.out.println(contaDois(numero));
        System.out.println(contaTres(numero));

    }

    public static double contaUm(int n) {
        double soma = 0.0;
        for (int i = 1; i <= n; i++) {
            soma += 1.0 / i;
        }
        return soma;
    }
    public static double contaDois(int n) {
        int soma = 0;
        int j = n;
        for (int i = 1; i <= n; i++) {
            soma += (double) i /j;
            j--;
        }
        return soma;
    }
    public static double contaTres(int n) {
        double soma = 0.0;
        for (int i = 1; i <= n; i++) {
            soma -= 1.0 / i;
        }
        return soma;
    }
}
