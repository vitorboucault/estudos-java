package javacore.npolimorfismo.test;

import javacore.npolimorfismo.domain.Computador;
import javacore.npolimorfismo.domain.Produto;
import javacore.npolimorfismo.domain.Tomate;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Produto produto = new Computador("Mac", 10000);
        System.out.println("Produto: "+ produto.getNome());
        System.out.println("Valor: R$"+ produto.getValor());
        System.out.println("Imposto: R$" + produto.calcularTaxa());
        System.out.println("-------------");

        Produto produto2 = new Tomate("Tomate Cereja", 10);
        System.out.println("Produto: "+ produto2.getNome());
        System.out.println("Valor: R$"+ produto2.getValor());
        System.out.println("Imposto: R$" + produto2.calcularTaxa());
        System.out.println("-------------");
    }
}
