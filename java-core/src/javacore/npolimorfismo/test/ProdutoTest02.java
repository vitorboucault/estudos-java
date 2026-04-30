package javacore.npolimorfismo.test;

import javacore.npolimorfismo.domain.Computador;
import javacore.npolimorfismo.domain.Produto;
import javacore.npolimorfismo.domain.Tomate;
import javacore.npolimorfismo.services.CalculadoraImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Mac", 10000);
        Tomate tomate = new Tomate("Tomate Cereja", 10);
        tomate.setDataValidade("30/10/26");

        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);


    }


}
