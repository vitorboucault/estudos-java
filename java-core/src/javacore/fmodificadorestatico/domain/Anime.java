package javacore.fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        System.out.println("Bloco");
        episodios = new int[4];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime(){

        for(int episodio : episodios){
            System.out.print("Episodio: " + episodio + " | ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
