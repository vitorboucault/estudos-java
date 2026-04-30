package exercicios.basico.revisao;

import java.util.Scanner;

public class MediaNumerosImpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numerosPares = 0, numerosImpares = 0;
        int somaImpares = 0;
        int somaPares = 0;
        int numero;

        do{
            System.out.println(" Digite um número: ");
            numero = entrada.nextInt();

            if(numero % 2 == 0) {
                numerosPares++;
                somaPares+=numero;
            } else {
                numerosImpares++;
                somaImpares += numero;
            }

        }while (numerosPares < 10);
        System.out.println("Soma pares: " + somaPares);
    }
}
