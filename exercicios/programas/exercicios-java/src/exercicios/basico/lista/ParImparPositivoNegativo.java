package exercicios.basico.lista;

import java.util.Scanner;

public class ParImparPositivoNegativo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor;

        System.out.println("Digite um valor: ");
        valor = ler.nextInt();

        if(valor%2==0){
            System.out.println("O valor digitado é par");
        } else System.out.println("O valor é impar");
        if (valor >= 0){
            System.out.println("O valor é positivo");
        } else System.out.println("O valor é negativo");
    }
}
