package exercicios.intermediario.midiareprodutor.model;

public class Video extends Midia implements Baixavel{
    public Video(String titulo, int duracao) {
        super(titulo, duracao);
    }


    @Override
    public void reproduzir() {
        System.out.println("Exibindo clipe de " + getTitulo());
    }

    public void baixar(){
        System.out.println("Baixando video de " + getTitulo());
    }
}
