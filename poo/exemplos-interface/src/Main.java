public class Main {
    public static void main(String[] args) {
        Computador musicPlayer = new Computador();

        executarMusica(musicPlayer);
        executarVideo(musicPlayer);

    }
    public static void executarVideo(VideoPlayer videoPlayer) {
        videoPlayer.iniciarVideo();
    }
    public static void executarMusica(MusicPlayer musicPlayer) {
        musicPlayer.tocarMusica();
    }

}
