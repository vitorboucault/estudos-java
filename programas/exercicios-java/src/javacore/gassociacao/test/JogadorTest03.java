package javacore.gassociacao.test;

import javacore.gassociacao.dominio.Jogador;
import javacore.gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {

        Jogador jogador = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Pele");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("---Jogador---");
        jogador.imprime();
        System.out.println("---Time---");
        time.imprime();
    }
}
