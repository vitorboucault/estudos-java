import java.util.Scanner;

public class ExemploFor {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String desejaMudarHumor = "sim";

        while (desejaMudarHumor.equalsIgnoreCase("sim")) {

        System.out.println("AJUDANDO MINHA NAMORADA LINDA");
        System.out.println("-------------------------------------------");
        System.out.println("Como está minha namorada hoje? (triste/feliz/normal/estressada)");
        String resposta = teclado.next();
        switch(resposta) {
            case "estressada": {
                System.out.println("-------------------------------------------");
                System.out.println("Giovanna precisa contar até 10");
                System.out.println("-------------------------------------------");
                for (int contagem = 1; contagem <= 10; contagem++ ){
                    System.out.println(contagem);
                }
                System.out.println("-------------------------------------------");
                System.out.println("Agora passou e está pronta pra receber dengo");
                System.out.println("-------------------------------------------");
                break;
            }
            case "normal": {
                System.out.println("-------------------------------------------");
                System.out.println("Giovanna está bem e pronta pra receber beijos");
                System.out.println("-------------------------------------------");
                break;
            }
            case "feliz":{
                System.out.println("---------------------------------------------------------------------");
                System.out.println("Então ligue pro seu namorado pra ganhar dengo e ficar mais feliz ainda");
                System.out.println("---------------------------------------------------------------------");
                break;
            }
            case "triste": {
                System.out.println("---------------------------------------------------------------------");
                System.out.println("Então ligue pro seu namorado para receber dengo e voltar a ficar feliz");
                System.out.println("---------------------------------------------------------------------");
                break;
            }
            default: {
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("Não entendi sua resposta. Por favor, digite triste, feliz, normal ou estressada.");
                System.out.println("-------------------------------------------------------------------------------");
                continue; // Volta para o início do loop
            }
        }
        System.out.println("-------------------------------------------");
        System.out.println("Deseja mudar o seu humor novamente? (sim/não)");
        System.out.println("-------------------------------------------");
        desejaMudarHumor = teclado.next();
            
        }
        System.out.println("-------------------------------------------");
        System.out.println("Programa encerrado. Muitos dengos para você!");
        System.out.println("-------------------------------------------");
        teclado.close();
        }
    }
