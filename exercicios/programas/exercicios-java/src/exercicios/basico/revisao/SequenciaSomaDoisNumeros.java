package exercicios.basico.revisao;

import java.util.Scanner;

public class SequenciaSomaDoisNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int a, b, c;
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();

        while (a!= b+c) {
            b=c;
            c = entrada.nextInt();
        }


    }
}
