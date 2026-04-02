package javacore.csobrecargametodos.domain;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;

    public Anime(String tipo, int episodios, String nome, String genero) {
        this.tipo = tipo;
        this.episodios = episodios;
        this.nome = nome;
        this.genero = genero;
    }

    public void init(String nome, String tipo, int episodios) {
        this.tipo = tipo;
        this.nome = nome;
        this.episodios = episodios;
    }

    public void init(String nome, String tipo, int episodios, String genero) {
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }

    public void imprimirDados(){
        System.out.println("Anime:\n" + getNome() + " | " + this.tipo
                + " | " + this.episodios + " | " + this.genero);
    }

    public String getGenero(){
        return this.genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }
    public void setEpisodio(int episodios) {
        this.episodios = episodios;
    }

}
