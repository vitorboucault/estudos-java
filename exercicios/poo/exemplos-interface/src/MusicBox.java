public class MusicBox implements MusicPlayer{
    @Override
    public void tocarMusica() {
        System.out.println("A caixa de musica esta tocando musica");

    }

    @Override
    public void pausarMusica() {
        System.out.println("A caixa de musica esta pausando a musica");

    }

    @Override
    public void pararMusica() {
        System.out.println("A caixa de musica esta parando a musica");

    }
}
