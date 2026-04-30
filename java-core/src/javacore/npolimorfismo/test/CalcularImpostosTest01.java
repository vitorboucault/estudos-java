package javacore.npolimorfismo.test;

import javacore.npolimorfismo.domain.Celular;
import javacore.npolimorfismo.domain.Computador;
import javacore.npolimorfismo.domain.Tomate;
import javacore.npolimorfismo.services.CalculadoraImposto;

public class CalcularImpostosTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Mac", 10000);
        Tomate tomate = new Tomate("Tomate cereja", 10);
        Celular celular = new Celular("Iphone 17 Pro", 12000);

        tomate.setDataValidade("30/10/26");
        CalculadoraImposto.calcularImposto(computador);
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(celular);


    }
}
