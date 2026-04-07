package exercicios.basico.lista;

import java.util.Scanner;

public class ValoresLogicos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a;
        boolean b;

        System.out.println("Digite o valor A: ");
        a = sc.nextBoolean();

        System.out.println("Digite o valor B: ");
        b = sc.nextBoolean();

        if (a && b) {
            System.out.println("Ambos verdadeiros");
        } else System.out.println("Um deles é falso");
    }





}
