package exercicios.basico.lista;

import java.util.Scanner;

public class SalarioMinimo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Salario minimo atual: ");
        double salarioMinimoBase = ler.nextDouble();

        System.out.println("Seu salario: ");
        double salario =  ler.nextDouble();

        double resultado = salario / salarioMinimoBase;

        System.out.println("Seu salario é" +
                " equivalente a: " + resultado +
                " salarios minimos");

    }
}
