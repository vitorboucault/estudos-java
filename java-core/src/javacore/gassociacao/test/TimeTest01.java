package javacore.gassociacao.test;

import javacore.gassociacao.dominio.Jogador;
import javacore.gassociacao.dominio.Time;

public class TimeTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Time time = new Time("Bahia");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
