/**
 * Sistema Smart TV
 * 
 * Simula o sistema de uma SmartTV
 * <p>
 * <b>Nota:</b> Leia atentamente a documentação
 * 
 * @author João Vïtor Cezar Boucault
 * @version 1.0
 * @since 15/04/2025
 * 
 * 
 */
public class SmartTV {
    boolean ligada=false;
    int canal = 1;
    int volume = 25;


    /**
     * Método para ligar a TV
     * @param ligar Primeiro parametro do método
     */
    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--; 
        System.out.println("Diminuindo o volume para: " + volume);       
    }

    public void passarCanal(){
        canal++;
    }

    public void voltarCanal(){
        canal--;
    }

    public void escolherCanal(int novoCanal){
        canal = novoCanal;

    }

}

