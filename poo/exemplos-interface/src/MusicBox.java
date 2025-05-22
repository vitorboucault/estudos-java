public class Computador implements VideoPlayer, MusicPlayer{
    @Override
    public void tocarMusica() {
        System.out.println("O computador esta tocando musica");

    }

    @Override
    public void pausarMusica() {
        System.out.println(" O computador esta pausando a musica");

    }

    @Override
    public void pararMusica() {
        System.out.println(" O computador esta parando a musica");

    }

    @Override
    public void iniciarVideo() {
        System.out.println(" O computador esta reproduzindo o video");

    }

    @Override
    public void pausarVideo() {
        System.out.println(" O computador esta pausando o video");

    }

    @Override
    public void pararVideo() {
        System.out.println(" O computador esta parando o video");

    }
}
