package exercicios.intermediario.midiareprodutor.test;

import exercicios.intermediario.midiareprodutor.model.Baixavel;
import exercicios.intermediario.midiareprodutor.model.Midia;
import exercicios.intermediario.midiareprodutor.model.Musica;
import exercicios.intermediario.midiareprodutor.model.Video;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Midia> midias = new ArrayList<>();
        midias.add(new Musica("Nao ha ferrolhos", 3));
        midias.add(new Musica("Musica 2", 4));
        midias.add(new Musica("Musica 3", 5));
        midias.add(new Video("Nao há ferrolhos", 10));
        midias.add(new Video("Video 2", 10));

        for (Midia midia : midias) {
            midia.reproduzir();
            if (midia instanceof Baixavel baixavel ) {
                baixavel.baixar();
            }
        }
    }
}
