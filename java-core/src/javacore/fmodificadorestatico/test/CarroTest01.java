package javacore.fmodificadorestatico.test;

import javacore.fmodificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("La Ferrari", 350);
        Carro carro2 = new Carro("GLA300", 289);
        Carro carro3 = new Carro("M3 Competion", 280);

        Carro.setVelocidadeLimite(180);

        carro1.imprimir();
        carro2.imprimir();
        carro3.imprimir();
    }
}
