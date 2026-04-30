package exercicios.basico.revisao;

import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor para o lado do quadrado: ");
        double lado = entrada.nextDouble();
        double area = lado * lado;
        System.out.println("A area do quadrado é: " + area);
    }
}
