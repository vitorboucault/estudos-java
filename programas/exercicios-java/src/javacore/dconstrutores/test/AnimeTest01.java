package javacore.dconstrutores.test;

import javacore.dconstrutores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto",
                15,"TV", "Ação", "Production 6");

        anime.imprimirDados();

    }
}
