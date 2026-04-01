package javacore.bintroducaometodos.test;

import javacore.bintroducaometodos.domain.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int num1 = 1;
        int num2 = 2;


        calculadora.alterarDoisNumeros(num1, num2);
        System.out.println("\nDentro do alteraDoisNumeros");
        System.out.println("NumUm: " + num1);
        System.out.println("NumDois: " + num2);
    }

}
