package javacore.dconstrutores.domain;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;
    private String estudio;


    public Anime(String nome, int episodios, String tipo, String genero) {
        this();
        this.tipo = tipo;
        this.episodios = episodios;
        this.nome = nome;
        this.genero = genero;
    }

    public Anime(String nome, int episodios, String tipo,String genero, String estudio) {
        this(nome, episodios, tipo, genero);
        this.estudio = estudio;
    }

    public Anime() {
        System.out.println("Dentro do construtor 2");
    }

    public void imprimirDados(){
        System.out.println("Anime:\n" + getNome() + " | " + this.tipo
                + " | " + this.episodios + " | " + this.genero
        + " | " + this.estudio);
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
