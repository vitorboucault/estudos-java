package exercicios.basico.lista;

import java.util.Scanner;

public class ABIguais {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a;
        int b;

        System.out.println("Digite o valor de A: ");
        a = ler.nextInt();
        System.out.println("Digite o valor de B: ");
        b = ler.nextInt();
        if (a==b){
            int c = a+b;
            System.out.println(c);
        } else {
            int c = a*b;
            System.out.println(c);
        }
    }
}
