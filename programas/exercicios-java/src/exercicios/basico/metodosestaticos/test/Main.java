package exercicios.basico.metodosestaticos.test;

import exercicios.basico.metodosestaticos.model.Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora.somar(20000,2);
        Calculadora.subtrair(20000,2);
        Calculadora.multiplicar(20000,2);
        Calculadora.dividir(20000,0);
        Calculadora.media(20000,0, 10);
    }
}
