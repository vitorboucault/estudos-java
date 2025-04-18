public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTV smartTv = new SmartTV();

        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);


        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        
        smartTv.passarCanal();
        smartTv.passarCanal();

        smartTv.escolherCanal(15);

        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status = TV ligada: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status = TV ligada: " + smartTv.ligada);
    }
}
