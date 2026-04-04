package javacore.isobrescrita.test;

import javacore.isobrescrita.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto");
        Anime anime2 = new Anime("Dragon Ball");
        System.out.println(anime);
        System.out.println(anime2);
    }
}
