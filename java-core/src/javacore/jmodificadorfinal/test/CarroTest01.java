package javacore.jmodificadorfinal.test;

import javacore.jmodificadorfinal.dominio.Carro;
import javacore.jmodificadorfinal.dominio.Subaru;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);

        carro.COMPRADOR.setNome("jose");
        System.out.println(carro.COMPRADOR);

        Subaru subaru = new Subaru();

        subaru.setNome("Subaru");
        subaru.imprime();


    }
}
