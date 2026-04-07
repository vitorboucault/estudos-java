package javacore.npolimorfismo.services;

import javacore.npolimorfismo.domain.Produto;
import javacore.npolimorfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("\n=== Relatório de imposto ===");
        double imposto = produto.calcularTaxa();
        System.out.println("Produto: "+ produto.getNome());
        System.out.println("Valor: R$"+ produto.getValor());
        System.out.println("Taxa a ser paga: R$" + imposto);
        if (produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;

            System.out.println("Data de validade: " + tomate.getDataValidade());
        }
    }

}

