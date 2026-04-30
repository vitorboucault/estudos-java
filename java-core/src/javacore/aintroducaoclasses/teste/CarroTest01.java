package javacore.aintroducaoclasses.teste;

import javacore.aintroducaoclasses.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Supra";
        carro.modelo = "Turbo";
        carro.ano = 2021;

        carro2.nome = "GTR";
        carro2.modelo = "3.0";
        carro2.ano = 2021;

        carro2 = carro;

        System.out.println(carro.nome + " " + carro.modelo + " " + carro.ano);
        System.out.println(carro2.nome + " " + carro2.modelo + " " + carro2.ano);

    }
}
