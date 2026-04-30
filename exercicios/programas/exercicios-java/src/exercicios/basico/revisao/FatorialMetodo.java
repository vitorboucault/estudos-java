package exercicios.basico.revisao;

import java.util.Scanner;

public class FatorialMetodo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = entrada.nextInt();

        System.out.println("Fatorial de 0 até" + numero);
        for(int i = 1; i <= numero; i++){
            System.out.println("Fatorial de " + i + ": " + fatorial(i));
        }
    }
    public static int fatorial(int n) {
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}


