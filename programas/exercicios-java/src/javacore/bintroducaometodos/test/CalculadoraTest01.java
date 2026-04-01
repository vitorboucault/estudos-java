package javacore.bintroducaometodos.test;

import javacore.bintroducaometodos.domain.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.calcularSoma();
        calculadora.calcularSubtracao();

        calculadora.calcularMultiplicacao(2,2);
    }
}
