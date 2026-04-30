package exercicios.intermediario.midiareprodutor.model;

public class Musica extends Midia implements Baixavel{

    public Musica(String titulo, int duracao) {
        super(titulo, duracao);
    }

    @Override
    public void reproduzir() {
        System.out.println("Tocando: " + getTitulo());
    }

    public void baixar(){
        System.out.println("Baixando musica: " + getTitulo());
    }


}
