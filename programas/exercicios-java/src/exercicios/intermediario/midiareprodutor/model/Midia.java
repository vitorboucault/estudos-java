package exercicios.intermediario.midiareprodutor.model;

public abstract class Midia {
    private String titulo;
    private int duracao;

    public Midia(String titulo) {
        this.titulo = titulo;
    }
    public Midia(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public void obterDuracao() {
        System.out.println("Duracao: " + getDuracao() + " minutos");
    }

    public int getDuracao() {
        return duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract void reproduzir();

}
