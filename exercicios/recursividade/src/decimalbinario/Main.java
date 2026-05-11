package decimalbinario;

import java.util.Scanner;

public class Main {
    public static void converteDecimalBinario (int numero){
        if (numero == 0){
            return;
        }
        converteDecimalBinario(numero /2 );
        System.out.print(numero % 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double numero = sc.nextDouble();
        int numeroInteiro = (int) numero;

        if (numero == 0){
            System.out.println("0");
        }else {
            converteDecimalBinario(numeroInteiro);
        }
    }
}
