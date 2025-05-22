public class Smartphone implements VideoPlayer, MusicPlayer{
    @Override
    public void tocarMusica() {
        System.out.println("O smartphone esta tocando musica");

    }

    @Override
    public void pausarMusica() {
        System.out.println(" O smartphone esta pausando a musica");

    }

    @Override
    public void pararMusica() {
        System.out.println(" O smartphone esta parando a musica");

    }

    @Override
    public void iniciarVideo() {
        System.out.println(" O smartphone esta reproduzindo o video");

    }

    @Override
    public void pausarVideo() {
        System.out.println(" O smartphone esta pausando o video");

    }

    @Override
    public void pararVideo() {
        System.out.println(" O smartphone esta parando o video");

    }
}
